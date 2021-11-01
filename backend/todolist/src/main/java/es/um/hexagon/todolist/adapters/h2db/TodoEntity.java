package es.um.hexagon.todolist.adapters.h2db;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import es.um.hexagon.todolist.domain.model.Todo;
import lombok.Getter;
import lombok.Setter;

@Entity
public class TodoEntity {
    
    @Id
    private String id;

    @Getter @Setter
    private String description;
    @Getter @Setter
    private LocalDate dueDate;

    public TodoEntity() {
        // required empty constructor
    }

    public TodoEntity(Todo todo) {
        this.id = UUID.randomUUID().toString();
        this.description = todo.getDescription();
        this.dueDate = todo.getDueDate();
    }


    public Todo toTodo() {
        return new Todo(this.description,this.dueDate);
    }

    public void fromTodo(Todo source) {
        this.description = source.getDescription();
        this.dueDate = source.getDueDate();
    }

}
