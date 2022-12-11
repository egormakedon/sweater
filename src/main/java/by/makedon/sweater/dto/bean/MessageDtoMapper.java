package by.makedon.sweater.dto.bean;

import by.makedon.sweater.domain.bean.Message;
import by.makedon.sweater.dto.DtoMapper;
import org.springframework.stereotype.Component;

/**
 * @author Yahor Makedon
 */
@Component
public class MessageDtoMapper implements DtoMapper<Message, MessageDto> {
	@Override
	public Message convertToEntity(MessageDto dto) {
		Message message = new Message();
		message.setId(dto.getId());
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
