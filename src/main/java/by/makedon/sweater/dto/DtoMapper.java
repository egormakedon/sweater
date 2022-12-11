package by.makedon.sweater.dto;

import by.makedon.sweater.domain.BaseBean;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yahor Makedon
 */
public interface DtoMapper<ENTITY extends BaseBean, DTO extends Dto> {
	ENTITY convertToEntity(DTO dto);
	DTO convertToDto(ENTITY entity);

	default List<ENTITY> convertToEntity(List<DTO> dtoList) {
		return dtoList.stream().map(this::convertToEntity).collect(Collectors.toList());
	}

	default List<DTO> convertToDto(List<ENTITY> entityList) {
		return entityList.stream().map(this::convertToDto).collect(Collectors.toList());
	}
}
