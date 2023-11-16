package es.um.hexagon.todolist.adapters.h2db;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "TODO", name = "COORDINADOR_ALL")
@Getter
public class CoordinadorAllEntity {

    
    @EmbeddedId
    private CoordinadorAllId id;

    @Column
    private String nombre;

    public String toString() {
        return String.format("******* COORDINADOR ALL: [%s] %s", id.getEmail(), nombre);
    }

}
