package com.example.iasback.services;

import com.example.iasback.models.User;
import com.example.iasback.payload.response.JwtResponse;
import com.example.iasback.security.jwt.JwtUtils;
import com.example.iasback.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SignService {


    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    UserService userService;


    public ResponseEntity<?> loginByElectronCard(String iin){
        User user = userService.getByIIN(iin);
        UserDetails userDetails = UserDetailsImpl.build(user);
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwtToken = jwtUtils.generateJwtToken(authentication);
        UserDetailsImpl userDetailsImpl = (UserDetailsImpl) authentication.getPrincipal();
        return ResponseEntity.ok(
                new JwtResponse(
                        jwtToken,
                        userDetailsImpl.getId(),
                        userDetailsImpl.getUsername(),
                        userDetailsImpl.getEmail(),
                        userDetailsImpl.getRole(),
                        userDetailsImpl.getName(),
                        userDetailsImpl.getSurname(),
                        userDetailsImpl.getPatronymic())
        );
    }
}
