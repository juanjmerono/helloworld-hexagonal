package es.um.hexagon.todolist.domain.model;

import java.time.LocalDate;

public class Todo {
 
    private LocalDate dueDate;
    private String description;

    public Todo(String description, LocalDate dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() { return description; }

    public LocalDate getDueDate() { return dueDate; }

}
