package by.makedon.sweater.dto.bean;

import by.makedon.sweater.domain.bean.Message;
import by.makedon.sweater.dto.DtoMapper;
import by.makedon.sweater.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Yahor Makedon
 */
@Component
public class MessageDtoMapper implements DtoMapper<Message, MessageDto> {
	@Autowired
	private MessageService messageService;

	@Override
	public Message convertToEntity(MessageDto dto) {
		Message message;
		Long id = dto.getId();

		if (id == null) {
			message = new Message();
		} else {
			Optional<Message> optional = messageService.getById(id);

			if (optional.isEmpty()) {
				throw new IllegalArgumentException(String.format("Message entity with '%d' id doesn't exist", id));
			}

			message = optional.get();
		}

		message.setText(dto.getText());
		message.setTag(dto.getTag());

		return message;
	}

	@Override
	public MessageDto convertToDto(Message entity) {
		MessageDto messageDto = new MessageDto();
		messageDto.setId(entity.getId());
		messageDto.setText(entity.getText());
		messageDto.setTag(entity.getTag());

		return messageDto;
	}
}
