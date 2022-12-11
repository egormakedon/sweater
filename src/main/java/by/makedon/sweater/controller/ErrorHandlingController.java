package by.makedon.sweater.controller;

import by.makedon.sweater.util.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Yahor Makedon
 */
@ControllerAdvice
@Slf4j
public class ErrorHandlingController {
	@ExceptionHandler(Exception.class)
	public void handle(Exception e) {
		log.error(e.getLocalizedMessage(), e);
		throw new BaseException(e.getLocalizedMessage(), e);
	}
}
