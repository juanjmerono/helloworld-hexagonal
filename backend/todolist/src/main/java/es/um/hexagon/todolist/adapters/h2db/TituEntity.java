package es.um.hexagon.todolist.adapters.h2db;

import java.util.List;

import javax.persistence.ConstraintMode;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "TODO", name = "TITU")
@Getter
public class TituEntity {

    @EmbeddedId 
    private TituId id;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        schema = "TODO", name = "COORDINADOR_TITU",
        foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT),
        joinColumns = {
            @JoinColumn(name = "cod_titu", referencedColumnName = "cod_titu", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)),
            @JoinColumn(name = "tipo_titulacion", referencedColumnName = "tipo_titulacion", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)),
            @JoinColumn(name = "curso_aca", referencedColumnName = "curso_aca", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
        },
        inverseForeignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT),
        inverseJoinColumns = {
            @JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
        })
    private List<CoordinadorEntity> coords;

}
