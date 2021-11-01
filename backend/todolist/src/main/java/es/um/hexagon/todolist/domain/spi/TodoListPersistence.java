package es.um.hexagon.todolist.domain.spi;

import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import es.um.hexagon.todolist.domain.model.TodoList;

@Repository
public interface TodoListPersistence {
    
    Stream<TodoList> findAll();

}
