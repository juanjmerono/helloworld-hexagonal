package es.um.hexagon.todolist.adapters.rest;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.hexagon.todolist.domain.api.TodoListService;
import es.um.hexagon.todolist.domain.model.TodoList;

@RestController
@RequestMapping(TodoListResource.TODOLIST)
public class TodoListResource {
    
    static final String TODOLIST = "/todolists";
    static final String SEARCH = "/search";

    private TodoListService todoListService;

    @Autowired
    public TodoListResource(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping(SEARCH)
    public Stream<TodoList> findAll() {
        return todoListService.findAll();
    }

}
