package com.mk.mkauth.domain;

import lombok.Data;
import org.hibernate.mapping.Collection;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;


@Data
public class RegistrationForm {
    private String username;
    private String password;

    private String email;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder){
        User user =new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setPrhone(phone);
        user.setUsername(username);
        user.setRoles(Collections.singleton(Role,USER));
    return user;
    }
}
