//package org.chisom.services;
//
//import org.chisom.data.model.Message;
//import org.chisom.data.repositories.MessageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MessageService {
//    private final MessageRepository messageRepository;
//
//    @Autowired
//    public MessageService(MessageRepository messageRepository) {
//        this.messageRepository = messageRepository;
//    }
//
//    public List<Message> getAllMessages() {
//        return messageRepository.findAll();
//    }
//
//    public Message getMessagesBySender(String sender) {
//        for (Message message : messageRepository.findAll()){
//            if (message.getBody().equals(sender)){
//                return message;
//            }
//        }
//
//        throw new IllegalArgumentException("Message not found");
//    }
//
//    public Message saveMessage(Message message) {
//        return messageRepository.save(message);
//    }
//}
//
//
//
