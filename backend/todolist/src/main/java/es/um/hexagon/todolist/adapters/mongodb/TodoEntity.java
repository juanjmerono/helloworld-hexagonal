package es.um.hexagon.todolist.adapters.mongodb;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import es.um.hexagon.todolist.domain.model.Todo;
import lombok.Getter;
import lombok.Setter;

@Document
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
