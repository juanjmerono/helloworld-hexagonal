package es.um.hexagon.todolist.adapters.h2db;

import java.util.List;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository("todoListRepository")
public interface TodoListRepository extends R2dbcRepository<TodoListEntity,String> {
    Flux<TodoListEntity> findByUser(String user);
}
