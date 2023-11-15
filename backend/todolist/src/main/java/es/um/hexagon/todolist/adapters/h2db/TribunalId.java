package es.um.hexagon.todolist.adapters.h2db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Embeddable
public class TribunalId implements Serializable {
    
    private String user_id;
    private String cod_titu;
    private String tipo_titulacion;
    private int curso_aca;

}
