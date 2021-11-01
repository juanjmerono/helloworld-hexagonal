package es.um.hexagon.todolist.adapters.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("todoListRepositoryBeta")
public interface TodoListRepository extends MongoRepository<TodoListEntity,String> {
    List<TodoListEntity> findByUser(String user);
}
