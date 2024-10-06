package com.asgard09.library.service;

import com.asgard09.library.model.Message;
import com.asgard09.library.repository.MessageRepository;
import com.asgard09.library.requestmodel.AdminQuestionRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Transactional
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void postMessage(Message messageRequest, String userEmail){
        Message message = new Message(messageRequest.getTitle(), messageRequest.getQuestion());
        message.setUserEmail(userEmail);
        messageRepository.save(message);
    }

    //Update message that admin sent
    public void putMessage(AdminQuestionRequest adminQuestionRequest, String userEmail) throws Exception{
        Optional<Message> message = messageRepository.findById(adminQuestionRequest.getId());
        if (!message.isPresent()){
            throw new Exception("Message not found");
        }

        message.get().setAdminEmail(userEmail);
        message.get().setResponse(adminQuestionRequest.getResponse());
        message.get().setClosed(true);
        messageRepository.save(message.get());
    }
}
