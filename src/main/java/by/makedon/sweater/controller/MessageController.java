package by.makedon.sweater.controller;

import by.makedon.sweater.dto.bean.MessageDto;
import by.makedon.sweater.dto.bean.MessageDtoMapper;
import by.makedon.sweater.dto.bean.MessageDtoValidator;
import by.makedon.sweater.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Yahor Makedon
 */
@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private MessageDtoMapper messageDtoMapper;
	@Autowired
	private MessageDtoValidator messageDtoValidator;

	@GetMapping("/messages")
	public String getMessages(Model model) {
		model.addAttribute("messages", messageDtoMapper.convertToDto(messageService.getAll()));
		return "messages";
	}

	@PostMapping("/message")
	public String addMessage(MessageDto messageDto, BindingResult bindingResult) {
		messageDtoValidator.validate(messageDto, bindingResult);

		if (!bindingResult.hasErrors()) {
			messageService.save(messageDtoMapper.convertToEntity(messageDto));
		}

		return "redirect:/messages";
	}
}
