package es.um.hexagon.todolist.adapters.mongodb;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
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
        BeanUtils.copyProperties(todoList, this);
    }

    public TodoList toTodoList() {
        TodoList todoList = new TodoList();
        BeanUtils.copyProperties(this, todoList, "todoItems");
        List<Todo> todoItems = this.todoItems.stream().map(TodoEntity::toTodo).collect(Collectors.toList());
        todoList.setTodoItems(todoItems);
        return todoList;
    }

}
