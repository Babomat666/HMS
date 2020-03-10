package ie.cct.objectorientedconstructs.s2018428s2016451s2017417;

import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

}
