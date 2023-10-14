package com.winnerwinifred.mailsender.user;

import com.winnerwinifred.mailsender.registeration.RegisterationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers(); //get users from db
    User registerUser(RegisterationRequest request);//add a user
    Optional<User> findByEmail(String email);
}
