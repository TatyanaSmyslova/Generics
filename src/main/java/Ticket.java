import java.util.Objects;

public class Ticket implements Comparable<Ticket> {

    private int idTicket;
    private int priceTicket;
    private String airportDeparture;
    private String airportArrival;
    private int timeTravel;

    public Ticket(int idTicket, int priceTicket, String airportDeparture, String airportArrival, int timeTravel) {
        this.idTicket = idTicket;
        this.priceTicket = priceTicket;
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.timeTravel = timeTravel;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public void setAirportDeparture(String airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    public String getAirportArrival() {
        return airportArrival;
    }

    public void setAirportArrival(String airportArrival) {
        this.airportArrival = airportArrival;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    @Override
    public String toString() {
        return airportDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return idTicket == ticket.idTicket && priceTicket == ticket.priceTicket && timeTravel == ticket.timeTravel && Objects.equals(airportDeparture, ticket.airportDeparture) && Objects.equals(airportArrival, ticket.airportArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, priceTicket, airportDeparture, airportArrival, timeTravel);
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        if (priceTicket < otherTicket.priceTicket) {
            return -1;
        }
        if (priceTicket > otherTicket.priceTicket) {
            return 1;
        }
        return 0;
    }
}