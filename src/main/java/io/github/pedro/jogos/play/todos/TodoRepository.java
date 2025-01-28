package io.github.pedro.jogos.play.todos;

import ch.qos.logback.core.model.INamedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
