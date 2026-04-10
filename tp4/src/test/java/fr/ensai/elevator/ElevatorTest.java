package fr.ensai.elevator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElevatorTest {
    @Test
    void isFull() {
        Elevator e = new Elevator(0, 0, 2);
        Person p1 = new Person(0);
        Person p2 = new Person(0);

        e.addPassenger(p1);
        assertFalse(e.isFull());

        e.addPassenger(p2);
        assertTrue(e.isFull());
    }

    @Test
    void addDestination() {
        Elevator e = new Elevator(0, 0, 12);

        assertEquals(0, e.getDestinationQueueSize());

        e.addDestination(3);
        assertEquals(1, e.getDestinationQueueSize());

        e.addDestination(0);
        assertEquals(2, e.getDestinationQueueSize());
    }
}
