package es.um.hexagon.todolist.adapters.reactive;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.hexagon.todolist.domain.api.TodoListService;
import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(TodoListReactiveResource.TODOLIST)
public class TodoListReactiveResource {
    
    static final String TODOLIST = "/reactive/todolists";
    static final String SEARCH = "/search";
    static final String TODO = "/todo";

    private TodoListService todoListService;

    @Autowired
    public TodoListReactiveResource(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping(SEARCH)
    public Flux<TodoList> findAll() {
        return todoListService.findAll();
        //return Mono.fromSupplier(() -> new Todo("Mi first todo", null));
    }

    /*@GetMapping(SEARCH)
    public Stream<TodoList> findAll() {
        return todoListService.findAll();
    }

    @PostMapping
    public TodoList newTodoList(@RequestBody TodoList todoList) {
        return this.todoListService.newTodoList(todoList);
    }

    @PostMapping(TODO)
    public Todo addTodo(@RequestBody TodoList todoList) {
        return this.todoListService.addTodo(todoList);
    }*/

}
