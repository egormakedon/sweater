package by.makedon.sweater.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Yahor Makedon
 */
public interface BaseBean extends Serializable, Cloneable {
	void setId(Long id);
	Long getId();
	void setModifiedUserId(Long modifiedUserId);
	Long getModifiedUserId();
	void setCreatedUserId(Long createdUserId);
	Long getCreatedUserId();
	void setModifiedDate(LocalDateTime modifiedDate);
	LocalDateTime getModifiedDate();
	void setCreatedDate(LocalDateTime createdDate);
	LocalDateTime getCreatedDate();
	void setActive(Boolean active);
	Boolean getActive();
}
