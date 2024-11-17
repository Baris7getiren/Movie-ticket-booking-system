package deneme2;

public class TicketBooking {
	
	
	private String movieName;
	private String showDate;
	private String showTime;
	private int ticketPrice;
	private int ticketCount;
	private SeatType seatType;
	
	public enum SeatType{
		Regular, Premium, VIP;
	}
	public TicketBooking(String movieName,String showDate,String showTime,int ticketPrice,int ticketCount,SeatType seatType) {
		this.movieName = movieName;
		this.showDate = showDate;
		this.showTime = showTime;
		this.ticketPrice = ticketPrice;
		this.ticketCount = ticketCount;
		this.seatType = seatType;
		
	}
	
	 public String getMovieName() {
	        return movieName;
	    }

	    public String getShowDate() {
	        return showDate;
	    }

	    public String getShowTime() {
	        return showTime;
	    }

	    public int getTicketPrice() {
	        return ticketPrice;
	    }

	    public int getTicketCount() {
	        return ticketCount;
	        
	    }

	    
	    public SeatType getSeatType() {
	    	
	    	return seatType;
	    }

	   
	    public int calculateTotalPrice() {
	        return ticketPrice * ticketCount;
	    }

	    
	    public void displayInfo() {
	        System.out.println("Movie Name: " + getMovieName());
	        System.out.println("Show Date: " + getShowDate());
	        System.out.println("Show Time: " + getShowTime());
	        System.out.println("Ticket Price: $" + getTicketPrice());
	        System.out.println("Ticket Count: " + getTicketCount());
	        System.out.println("Seat Type: " + getSeatType());
	        System.out.println("Total Price: $" + calculateTotalPrice());
	        System.out.println("_____________________________________");
	    }
	
	
}
