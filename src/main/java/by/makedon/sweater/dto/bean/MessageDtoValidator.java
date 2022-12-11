package by.makedon.sweater.dto.bean;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Yahor Makedon
 */
@Component
public class MessageDtoValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return MessageDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MessageDto messageDto = (MessageDto) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "text", null);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tag", null);
	}
}
