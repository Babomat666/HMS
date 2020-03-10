package ie.cct.objectorientedconstructs.s2018428s2016451s2017417;

import java.util.List;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {
	private String name;
	private List<RoomInterface> rooms;
	
	public Hotel(String name, List rooms) {
		
		this.name = name;
		this.rooms = rooms;
	}

	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	@Override
	public void setRooms(List<RoomInterface> rooms) {
		// TODO Auto-generated method stub
		this.rooms = rooms;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	@Override
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		
			//if(RoomInterface room : rooms) {
			//for (RoomInterface room : rooms) {
		
		if(((RoomInterface) rooms).getType().equals(type)) {
			int finalday = day + lengthOfStay;
			
			do {	
			
			if (isAvailable(month, day)) {				
					return false;	
			}
			day++;
			}	while (day <= finalday);
				return true;
				
			}
		return false;
		}


	private boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfRooms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean bookRoom(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return false;
	}

}
