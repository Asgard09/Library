package com.asgard09.library.repository;

import com.asgard09.library.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Message, Long> {

}
