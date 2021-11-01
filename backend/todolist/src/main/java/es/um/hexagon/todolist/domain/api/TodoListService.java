package es.um.hexagon.todolist.domain.api;

import java.util.stream.Stream;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;

public interface TodoListService {
    
    Stream<TodoList> findAll();

    TodoList newTodoList(TodoList todoList);

    Todo addTodo(TodoList todoList);

}
