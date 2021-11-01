package es.um.hexagon.todolist.domain.api;

import java.util.stream.Stream;

import es.um.hexagon.todolist.domain.model.TodoList;

public interface TodoListService {
    
    Stream<TodoList> findAll();

}
