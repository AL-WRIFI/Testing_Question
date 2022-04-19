public class RushHour {
    public String TrainTicketFare(float time){
        String ticketPrice="null";
        if(time<=0 || time>24)
            throw  new IllegalArgumentException("Ambiguas time enterd!!!");
        if ((time>=1 && time<=9.50) || (time>=16 && time<=19.50) )
            ticketPrice="Full Fare";
        if ((time>9.50 && time<16) || (time>19.50 && time<=24) )
            ticketPrice="Saver Ticket ";

        return ticketPrice;

    }
}
