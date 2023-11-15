package es.um.hexagon.todolist.adapters.h2db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "TODO", name = "COORDINADOR")
@Getter
public class CoordinadorEntity {
    
    @Id
    private String email;

    @Column
    private String nombre;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "coords")
    private List<TituEntity> titus;

    public String toString() {
        return String.format("******* COORDINADOR: [%s] %s", email, nombre);
    }

}
