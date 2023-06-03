import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void shouldSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket5, ticket7, ticket2, ticket1, ticket6};
        Ticket[] actual = manager.search("NYC", "CHI");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTicketsWhenZero() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("NYC", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTicketsWhenSingle() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket8};
        Ticket[] actual = manager.search("CHI", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6, ticket1, ticket5, ticket2, ticket7};
        Ticket[] actual = manager.search("NYC", "CHI", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTicketsWhenZeroWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("NYC", "LA", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTicketsWhenSingleWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "CHI", 800, 10, 12);
        Ticket ticket2 = new Ticket("NYC", "CHI", 600, 11, 14);
        Ticket ticket3 = new Ticket("NYC", "MSK", 1500, 10, 22);
        Ticket ticket4 = new Ticket("MSK", "CHI", 1900, 7, 23);
        Ticket ticket5 = new Ticket("NYC", "CHI", 300, 21, 23);
        Ticket ticket6 = new Ticket("NYC", "CHI", 1700, 6, 7);
        Ticket ticket7 = new Ticket("NYC", "CHI", 500, 15, 18);
        Ticket ticket8 = new Ticket("CHI", "LA", 600, 7, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket8};
        Ticket[] actual = manager.search("CHI", "LA", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}