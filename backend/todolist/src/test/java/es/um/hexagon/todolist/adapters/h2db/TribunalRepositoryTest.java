package es.um.hexagon.todolist.adapters.h2db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class TribunalRepositoryTest {

    @Autowired
    private TribunalRepository tribunalRepository;

    @Autowired
    private TribunalService tribunalService;

    @Test
    public void testFindAllTodos() {
        TribunalId tId = new TribunalId("12345678","T1","G",2023);
        Optional<TribunalEntity> trib = tribunalRepository.findById(tId);
        assertTrue(trib.isPresent());
        assertEquals(2, trib.get().getTitu().getCoords().size());
        assertTrue(trib.get().getTitu().getCoords().stream()
            .anyMatch(c -> c.getNombre().equals("Coord1") && c.getEmail().equals("email1@a.com")));

        trib.get().getTitu().getCoords().stream().forEach(System.err::println);
    }

    @Test
    public void testFindAlternative() {
        TribunalId tId = new TribunalId("12345678","T1","G",2023);
        Optional<TribunalAllEntity> trib = tribunalService.findById(tId);
        assertTrue(trib.isPresent());
        assertEquals(2, trib.get().getCoords().size());
        assertTrue(trib.get().getCoords().stream()
            .anyMatch(c -> c.getNombre().equals("Coord1") && c.getId().getEmail().equals("email1@a.com")));

        trib.get().getCoords().stream().forEach(System.err::println);
    }

}
