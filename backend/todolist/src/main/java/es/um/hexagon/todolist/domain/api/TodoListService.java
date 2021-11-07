package es.um.hexagon.todolist.domain.api;

import java.util.stream.Stream;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoListService {
    
    Flux<TodoList> findAll();

    Mono<TodoList> newTodoList(TodoList todoList);

    Mono<Todo> addTodo(TodoList todoList);

}
