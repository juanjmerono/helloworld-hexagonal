package es.um.hexagon.todolist.adapters.h2db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Getter
public class CoordinadorAllId implements Serializable {
    
    @Column(columnDefinition = "cod_titu")
    private String codTitu;
    @Column(columnDefinition = "tipo_titulacion")
    private String tipoTitulacion;
    @Column(columnDefinition = "curso_aca")
    private int cursoAca;
    private String email;

}
