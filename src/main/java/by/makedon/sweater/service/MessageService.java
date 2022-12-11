package by.makedon.sweater.service;

import by.makedon.sweater.domain.bean.Message;

import java.util.List;

/**
 * @author Yahor Makedon
 */
public interface MessageService extends CrudService<Message> {
	List<Message> getByTag(String tag);
}
