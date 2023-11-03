package org.chisom.services;

import org.chisom.data.model.Chat;
import org.chisom.dtos.request.ChatCreationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServicesImpl implements ChatService {
        private List<String> chatMessages;

        public void addMessage(String message) {
            chatMessages.add(message);
        }

        public List<String> getAllMessages() {
            return chatMessages;
        }

        public Long countChat() {
            return countChat();
        }

    @Override
    public Chat createChat(ChatCreationRequest chatCreationRequest) {
        return null;
    }

    @Override
    public Chat findChat(Long id) {
        return null;
    }

    @Override
    public String delete(Chat chat) {
        return null;
    }
}



//    @Override
//    public void createChat(ChatRequest chatRequest) {
//        Chat chat = new Chat();
//        map(chatRequest, chat);
//        chatRepository.save(chat);
//    }
//
//    @Override
//    public Long countChat() {
//        return chatRepository.count();
//    }
//}
//
//
