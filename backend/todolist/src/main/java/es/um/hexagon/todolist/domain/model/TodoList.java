package es.um.hexagon.todolist.domain.model;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    
    private String name;
    private List<Todo> todoItems;
    private String user;

    public TodoList() {
        // required empty constructor
    }

    public TodoList(String user, String name) {
        this.user = user;
        this.name = name;
    }

    public String getName() { return name; }

    public List<Todo> getTodoItems() { return todoItems; }

    public String getUser() { return user; }

    public void setTodoItems(List<Todo> newItems) { this.todoItems = newItems; }

    public void addTodo(Todo todo) { 
        if (this.todoItems==null) {
            this.todoItems = new ArrayList<Todo>();
        }
        this.todoItems.add(todo); 
    }

}
