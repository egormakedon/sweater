package by.makedon.sweater.service;

import by.makedon.sweater.domain.BaseBean;

import java.util.List;

/**
 * @author Yahor Makedon
 */
public interface CrudService<ENTITY extends BaseBean> {
	List<ENTITY> getAll();
	ENTITY save(ENTITY entity);
}
