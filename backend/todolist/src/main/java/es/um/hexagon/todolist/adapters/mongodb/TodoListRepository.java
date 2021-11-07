package es.um.hexagon.todolist.adapters.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository("todoListRepositoryBeta")
public interface TodoListRepository extends ReactiveMongoRepository<TodoListEntity,String> {
    Flux<TodoListEntity> findByUser(String user);
}
