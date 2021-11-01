package es.um.hexagon.todolist.adapters.h2db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("todoListRepository")
public interface TodoListRepository extends JpaRepository<TodoListEntity,String> {
}
