package es.um.hexagon.todolist.domain.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.um.hexagon.todolist.domain.api.TodoListService;
import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import es.um.hexagon.todolist.domain.spi.TodoListPersistence;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("todoListService")
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListPersistence todoListPersistence;

    @Override
    public Flux<TodoList> findAll() {
        return this.todoListPersistence.findAll();
    }

    @Override
    public Mono<TodoList> newTodoList(TodoList todoList) {
        return this.todoListPersistence.newTodoList(todoList);
    }

    @Override
    public Mono<Todo> addTodo(TodoList todoList) {
        return this.todoListPersistence.addTodo(todoList);
    }

    
    
}
