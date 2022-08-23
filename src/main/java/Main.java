import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TicketsManager manager = new TicketsManager();

        TicketsRepository repository = new TicketsRepository();

        Ticket one = new Ticket(1, 1299, "SVO", "KZN", 95);
        Ticket two = new Ticket(2, 1300, "VKO", "KZN", 120);
        Ticket three = new Ticket(3, 1298, "VOG", "DME", 100);
        Ticket four = new Ticket(4, 1400, "KZN", "DME", 30);

        int result = three.compareTo(one);

        System.out.println(result);

        repository.saveTicket(one);
        repository.saveTicket(two);
        repository.saveTicket(three);
        repository.saveTicket(four);

        System.out.println(Arrays.toString(repository.findAll()));
        Arrays.sort(repository.findAll());
        System.out.println(Arrays.toString(repository.findAll()));
    }
}