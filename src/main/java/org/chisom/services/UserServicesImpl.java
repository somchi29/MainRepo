package org.chisom.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.chisom.data.model.User;
import org.chisom.data.repositories.UserRepository;
import org.chisom.dtos.request.ChatCreationRequest;
import org.chisom.dtos.request.RegisterUserRequest;
import org.chisom.exceptions.AlreadyExistException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public String registerWith(RegisterUserRequest registerUserRequest) {
        Optional<User> optionalUser = userRepository.findByEmail(registerUserRequest.getEmail());

        if (optionalUser.isPresent()) {
            throw new AlreadyExistException("Username Already Exist");
        }
        User user = new User();
        user.setUserName(registerUserRequest.getUserName());
        user.setEmail(registerUserRequest.getEmail());
        user.setPassword(registerUserRequest.getPassword());

        userRepository.save(user);



        return "successful ";
    }

    @Override
    public void createChatFor(ChatCreationRequest chatCreationRequest) {

            // Add the new chat to a collection or perform other business logic
        }


    }



    // Other methods and business logic







































//package org.chisom.services;
//import org.chisom.dtos.Models.User;
//import org.chisom.dtos.request.ChatRequest;
//import org.chisom.dtos.request.RegisterUserRequest;
//import org.chisom.exceptions.AlreadyExistException;
//import org.chisom.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Service
//@Component
//public class UserServicesImpl implements  UserServices {
//
//  @Autowired
//    private UserRepository userRepository;
//
////    @Autowired
////    private UserServicesImpl(registerUserRequest){
////        return map(userRepository.save(map(registerUserRequest)));
////    }
//
//    @Override
//    public UserRepository registerWith(RegisterUserRequest registerUserRequest) throws AlreadyExistException {
//        return userRepository;
//    }
//
//    @Override
//    public void createChatFor(ChatRequest createChatRequest) {
//    }
//
//    public String findUser(RegisterUserRequest registerUserRequest) throws AlreadyExistException {
////        Optional<User> user = userRepository.findbyid((registerUserRequest.getUsername()));
////        if (user.isPresent()) throw new AlreadyExistException("Username Already Exist");
//        User user = new User();
//        userRepository.setEmail.save(user.getEmail());
//        userRepository.setPassword.save(user.getPassword());
//        userRepository.findById.save(user.getId());
//
//        return registerUserRequest.getUsername();
//    }
//}
