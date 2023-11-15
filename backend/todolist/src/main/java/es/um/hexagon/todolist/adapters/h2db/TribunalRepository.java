package es.um.hexagon.todolist.adapters.h2db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tribunalRepository")
public interface TribunalRepository extends JpaRepository<TribunalEntity,TribunalId> {
    Optional<TribunalEntity> findById(TribunalId id);
}
