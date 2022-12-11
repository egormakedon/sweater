package by.makedon.sweater.domain.bean;

import by.makedon.sweater.domain.AbstractBean;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Yahor Makedon
 */
@Entity
@Table(name = "Message")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Message extends AbstractBean {
	private static final long serialVersionUID = 1L;

	@Column(name = "Text", nullable = false)
	private String text;
	@Column(name = "Tag", nullable = false)
	private String tag;
}
