package es.um.hexagon.todolist.adapters.mongodb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import lombok.Getter;
import lombok.Setter;

@Document
public class TodoListEntity {
    @Id
    private String id;
    @Getter @Setter
    private String user;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<TodoEntity> todoItems;

    public TodoListEntity() {
        // Need and empty constructor
    }

    public TodoListEntity(TodoList todoList) {
        this.id = UUID.randomUUID().toString();
        this.user = todoList.getUser();
        this.name = todoList.getName();
    }

    public TodoList toTodoList() {
        TodoList todoList = new TodoList(this.user, this.name);
        if (this.todoItems!=null) {
            todoList.setTodoItems(this.todoItems.stream().map(TodoEntity::toTodo).collect(Collectors.toList()));
        }
        return todoList;
    }
    
    public void addTodo(Todo todo) {
        if (this.todoItems==null) {
            this.todoItems = new ArrayList<TodoEntity>();
        }
        this.todoItems.add(new TodoEntity(todo));
    }    

}
