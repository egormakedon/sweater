package by.makedon.sweater.service.bean;

import by.makedon.sweater.domain.bean.Message;
import by.makedon.sweater.repository.MessageRepository;
import by.makedon.sweater.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Yahor Makedon
 */
@Service
@Slf4j
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public List<Message> getAll() {
		List<Message> messageList = messageRepository.findAll();
		log.info("Find all messages: {}", messageList);
		return messageList;
	}

	@Transactional
	@Override
	public Message save(Message entity) {
		Message message = messageRepository.save(entity);
		log.info("Save message: {}", message);
		return message;
	}

	@Override
	public List<Message> getByTag(String tag) {
		List<Message> messageList = messageRepository.findMessagesByTag(tag);
		log.info("Find messages by '{}' tag: {}", tag, messageList);
		return messageList;
	}
}
