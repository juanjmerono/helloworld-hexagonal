package es.um.hexagon.todolist.adapters.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.jupiter.api.Test;

import es.um.hexagon.todolist.domain.model.Todo;
import es.um.hexagon.todolist.domain.model.TodoList;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class TodoListResourceITest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testFindAll() {
        this.webTestClient
            .get()
            .uri(uriBuilder -> uriBuilder.path(TodoListResource.TODOLIST+TodoListResource.SEARCH).build())
            .exchange()
            .expectStatus().isOk()
            .expectBodyList(TodoList.class)
            .value(todoList -> todoList.get(0).getUser(), equalTo("pepe"))
            .value(todoList -> todoList.get(0).getName(), equalTo("lista0"));
    }

    @Test
    public void testNewTodoList() {
        TodoList newTodoList = new TodoList("mike","lista3");
        this.webTestClient
            .post()
            .uri(uriBuilder -> uriBuilder.path(TodoListResource.TODOLIST).build())
            .body(BodyInserters.fromValue(newTodoList))
            .exchange()
            .expectStatus().isOk()
            .expectBodyList(TodoList.class)
            .value(todoList -> todoList.get(0).getUser(), equalTo("mike"))
            .value(todoList -> todoList.get(0).getName(), equalTo("lista3"));
    }
    
    @Test
    public void testAddTodo() {
        TodoList newTodoList = new TodoList("mike","lista3");
        Todo newTodo = new Todo("l3 todo 0",null);
        newTodoList.addTodo(newTodo);
        this.webTestClient
            .post()
            .uri(uriBuilder -> uriBuilder.path(TodoListResource.TODOLIST+TodoListResource.TODO).build())
            .body(BodyInserters.fromValue(newTodoList))
            .exchange()
            .expectStatus().isOk()
            .expectBodyList(Todo.class)
            .value(todo -> todo.get(0).getDescription(), equalTo("l3 todo 0"))
            .value(todo -> todo.get(0).getDueDate(), nullValue());
    }

}
