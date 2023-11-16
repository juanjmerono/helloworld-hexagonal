package es.um.hexagon.todolist.adapters.h2db;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TribunalService {
    
    private TribunalAllRepository tribunalAllRepository;
    private CoordinadorAllRepository coordinadorAllRepository;

    public TribunalService(TribunalAllRepository tribunalAllRepository, CoordinadorAllRepository coordinadorAllRepository) {
        this.tribunalAllRepository = tribunalAllRepository;
        this.coordinadorAllRepository = coordinadorAllRepository;
    }

    public Optional<TribunalAllEntity> findById(TribunalId id) {
        return tribunalAllRepository.findById(id).map(t -> 
            t.withCoords(coordinadorAllRepository
                .findAllByIdCodTituAndIdTipoTitulacionAndIdCursoAca(id.getCod_titu(), id.getTipo_titulacion(), id.getCurso_aca())));
    }
    

}
