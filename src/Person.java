class Person {
    protected String firstName;
    protected String lastName;
    protected int ticketAmount;

    protected Person(String FirstName, String LastName, int TicketAmount) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.ticketAmount = TicketAmount;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void decreaseTicketAmount() {
        ticketAmount--;
    }
}