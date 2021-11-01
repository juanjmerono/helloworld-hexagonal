package es.um.hexagon.todolist.adapters.mongodb;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.um.hexagon.todolist.domain.model.TodoList;
import es.um.hexagon.todolist.domain.spi.TodoListPersistence;

@Repository("todoListPersistenceBeta")
public class TodoListPersistenceMongoDB implements TodoListPersistence {

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public Stream<TodoList> findAll() {
        return todoListRepository.findAll().stream().map(TodoListEntity::toTodoList);
    }

}
