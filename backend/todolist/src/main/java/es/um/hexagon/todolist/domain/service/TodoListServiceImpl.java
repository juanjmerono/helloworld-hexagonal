package es.um.hexagon.todolist.domain.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.um.hexagon.todolist.domain.api.TodoListService;
import es.um.hexagon.todolist.domain.model.TodoList;
import es.um.hexagon.todolist.domain.spi.TodoListPersistence;

@Service("todoListService")
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListPersistence todoListPersistence;

    @Override
    public Stream<TodoList> findAll() {
        return this.todoListPersistence.findAll();
    }
    
}
