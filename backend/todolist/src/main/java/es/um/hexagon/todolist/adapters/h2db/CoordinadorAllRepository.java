package es.um.hexagon.todolist.adapters.h2db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("coordinadorAllRepository")
public interface CoordinadorAllRepository extends JpaRepository<CoordinadorAllEntity,CoordinadorAllId> {
    List<CoordinadorAllEntity> findAllByIdCodTituAndIdTipoTitulacionAndIdCursoAca(String codtitu, String tipotitu, int cursoaca);
}
