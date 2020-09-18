package com.example.iasback.controllers;

import com.example.iasback.models.*;
import com.example.iasback.payload.request.SignupRequest;
import com.example.iasback.payload.response.MessageResponse;
import com.example.iasback.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;





    @GetMapping("/users")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<User> users(boolean bool) {
        return userService.listUser(bool);
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> createUser( @RequestBody SignupRequest signupRequest) {

        System.out.println(signupRequest);

        if(userService.existUserByUsername(signupRequest.getUsername())){
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Логин Занят"));
        }

        if(userService.existUserByIIN(signupRequest.getIin())){
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Пользователь с таким иин уже существует"));
        }

        User user = new User(
                signupRequest.getUsername(),
                signupRequest.getName(),
                signupRequest.getSurname(),
                signupRequest.getPatronymic(),
                signupRequest.getEmail(),
                passwordEncoder.encode(signupRequest.getPassword()),
                signupRequest.getRole_id(),
                signupRequest.getIin()
        );

        return ResponseEntity.ok(userService.createUser(user))  ;
    }

    @PostMapping("/edit")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public User editUser(@RequestBody User user) {
        return userService.editUser(user);
    }

    @GetMapping("/delete")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> deleteUser(int userId, boolean bool, int roleId) {

        if(roleId==1){
            if(userService.checkAdminCounts()){
                return ResponseEntity
                        .badRequest()
                        .body(new MessageResponse("Невозможно удаление так как минимальное количество администраторов должно оставаться равным 3 "));
            }
        }


        return ResponseEntity.ok(userService.deleteUser(userId, bool));
    }

    @GetMapping("/recovery")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Integer recoveryUser(int userId, boolean bool) {
        return userService.recoveryUser(userId, bool);
    }

    @GetMapping("/remove")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Integer removeUser(int userId) {
        return userService.removeUser(userId);

    }


}
