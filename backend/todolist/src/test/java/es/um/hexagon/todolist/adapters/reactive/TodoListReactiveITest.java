package es.um.hexagon.todolist.adapters.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class TodoListReactiveITest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testFindAll() {
        String responseString = new String("Hello, Spring!");
        this.webTestClient
            .get()
            .uri("/hello")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBodyList(String.class)
            .consumeWith(serverResponseFluxExchangeResult -> {
                assertEquals(responseString,serverResponseFluxExchangeResult.getResponseBody());
            });
    }

}
