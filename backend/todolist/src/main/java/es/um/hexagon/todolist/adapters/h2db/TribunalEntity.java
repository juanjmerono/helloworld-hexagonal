package es.um.hexagon.todolist.adapters.h2db;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(schema = "TODO", name = "TRIBUNAL")
@Getter
public class TribunalEntity {

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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns({
        @JoinColumn(name = "cod_titu", referencedColumnName = "cod_titu", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)),
        @JoinColumn(name = "tipo_titulacion", referencedColumnName = "tipo_titulacion", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)),
        @JoinColumn(name = "curso_aca", referencedColumnName = "curso_aca", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)),
    })
    private TituEntity titu;

}

