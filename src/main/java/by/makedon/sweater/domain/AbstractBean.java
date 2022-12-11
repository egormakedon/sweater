package by.makedon.sweater.domain;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Yahor Makedon
 */
@MappedSuperclass
@Data
public abstract class AbstractBean implements BaseBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@Column(name = "ModifiedUserId", nullable = false)
	protected Long modifiedUserId;
	@Column(name = "CreatedUserId", nullable = false)
	protected Long createdUserId;
	@Column(name = "ModifiedDate", nullable = false)
	protected LocalDateTime modifiedDate;
	@Column(name = "CreatedDate", nullable = false)
	protected LocalDateTime createdDate;
	@Column(name = "ActiveFlag", nullable = false)
	@Type(type = "yes_no")
	protected Boolean active;

	public AbstractBean() {
		//TODO update id
		this.modifiedUserId = 1L;
		//TODO update id
		this.createdUserId = 1L;
		this.modifiedDate = LocalDateTime.now();
		this.createdDate = LocalDateTime.now();
		this.active = Boolean.TRUE;
	}
}
