import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketsManagerTest {

    Ticket one = new Ticket(1, 1299, "SVO", "KZN", 95);
    Ticket two = new Ticket(2, 1300, "VKO", "KZN", 120);
    Ticket three = new Ticket(3, 1298, "VOG", "DME", 100);
    Ticket four = new Ticket(4, 1400, "KZN", "DME", 30);

    TicketsManager manager = new TicketsManager();

    TicketsRepository repository = new TicketsRepository();


    @Test
    public void shouldFindTicket() {

        manager.addTicket(one);
        manager.addTicket(two);
        manager.addTicket(three);
        manager.addTicket(four);

        Ticket[] actual = manager.findAll("SVO", "KZN");
        Ticket[] expected = {one};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTicketAndSort() {
        Ticket one = new Ticket(1, 1299, "SVO", "KZN", 95);
        Ticket two = new Ticket(2, 1300, "SVO", "KZN", 120);
        Ticket three = new Ticket(3, 1200, "SVO", "KZN", 100);
        Ticket four = new Ticket(4, 1400, "SVO", "KZN", 30);

        manager.addTicket(one);
        manager.addTicket(two);
        manager.addTicket(three);
        manager.addTicket(four);

        Ticket[] actual = manager.findAll("SVO", "KZN");
        Ticket[] expected = {three, one, two, four};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTicket() {

        repository.saveTicket(one);
        repository.saveTicket(two);
        repository.saveTicket(three);

        Ticket[] actual = repository.findAll();
        Ticket[] expected = {one, two, three};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTicketId() {

        repository.saveTicket(one);
        repository.saveTicket(two);
        repository.saveTicket(three);

        repository.removeById(3);

        Ticket[] actual = repository.findAll();
        Ticket[] expected = {one, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getAllRepo() {

        repository.saveTicket(one);
        repository.saveTicket(two);
        repository.saveTicket(three);
        repository.saveTicket(four);

        Ticket[] actual = repository.findAll();
        Ticket[] expected = {one, two, three, four};

        assertArrayEquals(expected, actual);

    }
}