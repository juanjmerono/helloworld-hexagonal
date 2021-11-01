package es.um.hexagon.todolist.adapters.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("todoListRepositoryBeta")
public interface TodoListRepository extends MongoRepository<TodoListEntity,String> {
}
