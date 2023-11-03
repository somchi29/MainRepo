package org.chisom.services;

import org.chisom.data.model.Chat;
import org.chisom.dtos.request.ChatCreationRequest;


public interface ChatService {
        Chat createChat(ChatCreationRequest chatCreationRequest);

        Chat findChat( Long id);

        String delete(Chat chat);
    }



