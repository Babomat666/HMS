/*
 * @author Costa
 * 
 */

package ie.cct.objectorientedconstructs.s2018428s2016451s2017417;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {
	
	private String type;
	private double rate;
	private Map<String, boolean[]> availability;
	private int id;
	
	public Room(String type, double rate, int id){
	this.type = type;
	this.rate = rate;
	this.id = id;
	this.availability = new HashMap <String, boolean[]>();
	createAvailability();
	
	}
private void createAvailability() {
		
		availability.put("Jan", new boolean[31]);
		Arrays.fill(availability.get("Jan"), true);
		
		availability.put("Fev", new boolean[28]);
		Arrays.fill(availability.get("Fev"), true);
		
		availability.put("March", new boolean[31]);
		Arrays.fill(availability.get("March"), true);
		
		availability.put("Abril", new boolean[30]);
		Arrays.fill(availability.get("Abril"), true);
		
		availability.put("Maio", new boolean[31]);
		Arrays.fill(availability.get("Maio"), true);
		
		availability.put("June", new boolean[30]);
		Arrays.fill(availability.get("Jun"), true);
		
		availability.put("Jully", new boolean[31]);
		Arrays.fill(availability.get("Jully"), true);
		
		availability.put("Agust", new boolean[31]);
		Arrays.fill(availability.get("Agust"), true);
		
		availability.put("Sept", new boolean[30]);
		Arrays.fill(availability.get("Sept"), true);
		
		availability.put("Oct", new boolean[31]);
		Arrays.fill(availability.get("Oct"), true);
		
		availability.put("Nov", new boolean[30]);
		Arrays.fill(availability.get("Nov"), true);
		
		availability.put("Dec", new boolean[31]);
		Arrays.fill(availability.get("Dec"), true);
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;

	}

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return this.rate;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		this.rate =rate;
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
		return this.availability;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		this.availability = availability; 
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		//boolean[]monthAvailability = availability.get(month);
		//boolean dayAvailability = monthAvailability[day-1];
		// return dayAvailability;
		return availability.get(month)[day-1];
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		
		if (isAvailable(month, day)) {
			this.availability.get(month)[day-1]=false;
			return true;
		}
		
			return false;
	}

}
