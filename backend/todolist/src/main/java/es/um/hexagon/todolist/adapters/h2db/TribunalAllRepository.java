package es.um.hexagon.todolist.adapters.h2db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tribunalAllRepository")
public interface TribunalAllRepository extends JpaRepository<TribunalAllEntity,TribunalId> {
    Optional<TribunalAllEntity> findById(TribunalId id);
}
