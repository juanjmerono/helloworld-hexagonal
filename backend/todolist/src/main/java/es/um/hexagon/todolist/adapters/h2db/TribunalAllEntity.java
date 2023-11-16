package es.um.hexagon.todolist.adapters.h2db;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(schema = "TODO", name = "TRIBUNAL")
@Getter
public class TribunalAllEntity {

    @EmbeddedId
    private TribunalId id;

    @Column
    private String cod_conv_defensa;
    @Column
    private String convocatoria;
    @Column
    private String tipo_tribunal;
    @Column
    private String descripcion;
    @Column
    private LocalDateTime fecha_presentacion;

    @Transient
    private List<CoordinadorAllEntity> coords;

    public TribunalAllEntity withCoords(List<CoordinadorAllEntity> coords) {
        this.coords = coords;
        return this;
    }

}

