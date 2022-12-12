package by.makedon.sweater.service;

import by.makedon.sweater.domain.BaseBean;

import java.util.List;
import java.util.Optional;

/**
 * @author Yahor Makedon
 */
public interface CrudService<ENTITY extends BaseBean> {
	List<ENTITY> getAll();
	Optional<ENTITY> getById(Long id);
	ENTITY save(ENTITY entity);
}
