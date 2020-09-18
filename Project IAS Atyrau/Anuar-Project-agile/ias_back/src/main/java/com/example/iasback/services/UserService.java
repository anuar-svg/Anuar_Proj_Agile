package com.example.iasback.services;

import com.example.iasback.models.Event;
import com.example.iasback.models.User;
//import com.example.iasback.repository.UserRepository;
import com.example.iasback.payload.response.MessageResponse;
import com.example.iasback.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;


    public List<User> listUser( boolean bool){
        return userMapper.allUsers(bool);
    }

    public User getByIIN( String iin){
        return userMapper.findByIIN(iin);
    }


    public User createUser(User user){
        return userMapper.createUser(user);
    }


    public User editUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.editUser(user);
    }


    public Integer deleteUser(Integer userId, boolean bool){
        userMapper.deleteUser(userId, bool);
        return userId ;
    }

    public Integer removeUser(Integer userId){
        userMapper.removeUser(userId );
        return userId ;
    }

    public Integer recoveryUser(Integer userId, boolean bool){
        userMapper.recoveryUser(userId, bool);
        return userId ;
    }



    public boolean existUserByUsername(String username){
        return userMapper.existsByUsername(username);

    }

    public boolean existUserByIIN(String iin){
        return userMapper.existsByIIN(iin);

    }



    public boolean checkAdminCounts(){
        return userMapper.checkAdminCounts();

    }

}
