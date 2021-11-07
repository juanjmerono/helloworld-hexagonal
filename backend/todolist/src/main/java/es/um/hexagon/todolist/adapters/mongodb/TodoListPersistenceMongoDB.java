package es.um.hexagon.todolist.adapters.mongodb;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import es.um.hexagon.todolist.domain.spi.TodoListPersistence;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository("todoListPersistenceBeta")
public class TodoListPersistenceMongoDB implements TodoListPersistence {

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public Flux<TodoList> findAll() {
        return this.todoListRepository.findAll().map(TodoListEntity::toTodoList);
    }

    @Override
    public Mono<TodoList> newTodoList(TodoList todoList) {
        return this.todoListRepository.save(new TodoListEntity(todoList)).map(TodoListEntity::toTodoList);
    }

    @Override
    public Mono<Todo> addTodo(TodoList todoList) {
        /*Todo todo = todoList.getTodoItems().get(0);
        TodoListEntity todoListEntity = this.todoListRepository
            .findByUser(todoList.getUser()).stream()
            .filter(item -> todoList.getName().equals(item.getName()))
            .findFirst()
            .orElse(new TodoListEntity(todoList));
        todoListEntity.addTodo(todo);
        return this.todoListRepository.save(todoListEntity)
            .getTodoItems().stream()
            .filter(item -> todo.getDescription().equals(item.getDescription()))
            .findFirst()
            .orElse(new TodoEntity(todo)).toTodo();*/
        return null;
    }

}
