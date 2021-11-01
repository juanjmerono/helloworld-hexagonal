package es.um.hexagon.todolist.adapters.h2db;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;

@Service("todoListSeederH2Service")
public class TodoListSeederService {
    
    private TodoListRepository todoListRepository;

    @Autowired
    public TodoListSeederService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
        this.seedDatabase();
    }

    public void seedDatabase() {

        LogManager.getLogger(this.getClass()).warn("------ Populating TodoList Database ------");
        LogManager.getLogger(this.getClass()).warn("------ "+AopProxyUtils.ultimateTargetClass(this.todoListRepository)+" ------");

        TodoEntity [] todoEntities0 = {
            new TodoEntity(new Todo("l0 todo 1",null)),
            new TodoEntity(new Todo("l0 todo 2",null)),
            new TodoEntity(new Todo("l0 todo 3",null)),
        };

        TodoEntity [] todoEntities1 = {
            new TodoEntity(new Todo("l1 todo 1",null)),
            new TodoEntity(new Todo("l1 todo 2",null)),
            new TodoEntity(new Todo("l1 todo 3",null)),
        };

        TodoEntity [] todoEntities2 = {
            new TodoEntity(new Todo("l2 todo 1",null)),
            new TodoEntity(new Todo("l2 todo 2",null)),
            new TodoEntity(new Todo("l2 todo 3",null)),
        };

        TodoListEntity [] todoListEntities = {
            new TodoListEntity(new TodoList("pepe","lista0")),
            new TodoListEntity(new TodoList("pepe","lista2")),
            new TodoListEntity(new TodoList("juan","lista1")),
        };

        todoListEntities[0].setTodoItems(Arrays.asList(todoEntities0));
        todoListEntities[1].setTodoItems(Arrays.asList(todoEntities1));
        todoListEntities[2].setTodoItems(Arrays.asList(todoEntities2));

        todoListRepository.saveAll(Arrays.asList(todoListEntities));
    }

}
