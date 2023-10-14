package com.winnerwinifred.mailsender.user;

import com.winnerwinifred.mailsender.registeration.RegisterationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User registerUser(RegisterationRequest request) {
        Optional<User> user= this.findByEmail(request.email());
        if (user.isPresent()){
            throw new UserAlreadtExistsException("User with email: " +request.email()+ "already exists");
        }
        var newUser = new User();
        newUser.setFirstName(request.firstName());
        newUser.setLastName(request.lastName());
        newUser.setEmail(request.email());
        newUser.setPassword();
        newUser.setRole(request.role());

        return userRepository.save(newUser);//save to db
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}















