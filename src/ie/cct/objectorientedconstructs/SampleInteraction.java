package ie.cct.objectorientedconstructs;

//change this to match your project package
import ie.cct.objectorientedconstructs.HotelManagementSystem;
import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.HotelManagementSystemInterface;

public class SampleInteraction {
	
	// hello
	
	public static void main(String[] args) {
    
		// create a new hotel management system
		HotelManagementSystemInterface hm = new HotelManagementSystem();
        // build the hotel 

		HotelInterface h = hm.setupHotel("mespil.txt");
        // try some bookings
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("February", 3, "Single", 10);
		h.bookRoom("February", 10, "Penthouse", 12);
		
        // see the calendar for January for single rooms
		System.out.println(hm.getCalendar("January", h));
		
	}
}
