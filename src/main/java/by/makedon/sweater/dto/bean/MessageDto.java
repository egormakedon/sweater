package by.makedon.sweater.dto.bean;

import by.makedon.sweater.dto.Dto;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yahor Makedon
 */
@Data
@NoArgsConstructor
public class MessageDto implements Dto {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private String tag;
}
