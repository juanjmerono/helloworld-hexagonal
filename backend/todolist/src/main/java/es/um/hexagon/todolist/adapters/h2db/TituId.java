package es.um.hexagon.todolist.adapters.h2db;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Getter
public class TituId implements Serializable {
    
    private String cod_titu;
    private String tipo_titulacion;
    private int curso_aca;

}
