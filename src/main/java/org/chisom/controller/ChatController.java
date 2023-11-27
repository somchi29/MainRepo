package org.chisom.controller;

import lombok.AllArgsConstructor;
import org.chisom.data.model.Message;
import org.chisom.dtos.request.RegisterUserRequest;
import org.chisom.exceptions.AlreadyExistException;
import org.chisom.services.ChatService;
import org.chisom.services.UserServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@AllArgsConstructor
    public class ChatController {

    private final ChatService chatServices;
    private final UserServices userServices;


    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message chatMessage) {
//        return ChatService.addChatMessage(chatMessage.getBody());
        return null;
    }
    @PostMapping("register")
    public String registerUser(@RequestBody RegisterUserRequest registerUserRequest) throws AlreadyExistException {
        try {
            return userServices.registerWith(registerUserRequest);
        }catch (AlreadyExistException alreadyExistException){
            return alreadyExistException.getMessage();
        }

        }

    }











