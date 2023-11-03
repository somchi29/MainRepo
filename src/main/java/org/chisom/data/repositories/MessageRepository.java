//package org.chisom.data.repositories;
//
//import org.chisom.data.model.Message;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface MessageRepository extends MongoRepository<Message, String> {
//
//    Optional<Message> findMessageByChatIdAndBody(String chatId, String body);
//
//    List<String> findMessagesByChatId(String id);
//}