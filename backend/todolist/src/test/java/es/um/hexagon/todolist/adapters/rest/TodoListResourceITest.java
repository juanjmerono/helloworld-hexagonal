package es.um.hexagon.todolist.adapters.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.Test;

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
            .value(todoList -> todoList.get(0).getUser(), equalTo("pepe"));     
    }

    
}
