package by.makedon.sweater.repository;

import by.makedon.sweater.domain.bean.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yahor Makedon
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
