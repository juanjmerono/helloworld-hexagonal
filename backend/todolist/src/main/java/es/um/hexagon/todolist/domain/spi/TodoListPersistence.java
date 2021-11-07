package es.um.hexagon.todolist.domain.spi;

import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface TodoListPersistence {
    
    //Stream<TodoList> findAll();
    Flux<TodoList> findAll();

    Mono<TodoList> newTodoList(TodoList todoList);

    Mono<Todo> addTodo(TodoList todoList);

}
