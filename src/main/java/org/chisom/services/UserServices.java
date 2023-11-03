package org.chisom.services;

import org.chisom.dtos.request.ChatCreationRequest;
import org.chisom.dtos.request.RegisterUserRequest;
import org.chisom.exceptions.AlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {
    String registerWith(RegisterUserRequest registerUserRequest) throws AlreadyExistException;
    void  createChatFor(ChatCreationRequest createChatRequest);
}
