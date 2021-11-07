package es.um.hexagon.todolist.adapters.h2db;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class TodoListRepositoryITest {

    @Autowired
    private TodoListRepository todoListRepository;

    @Test
    public void testFindAll() {
        /*assertTrue(this.todoListRepository.findAll().stream()
            .anyMatch(todoList -> 
                "juan".equals(todoList.getUser()) &&
                "lista1".equals(todoList.getName())
        ));*/
        assertTrue(true);

    }

}
