package taxiservice;

public class Taxi {
	private int taxiId;
	private Location loc;
	private boolean isBusy;
	private static int tId = 0;

	public Taxi() {
		taxiId = tId++; // change to start at id 0
		loc=new Location(0,0);
	}

	public Location getLocation() {
		return loc;
	}
	public int getTaxiId() {
		return taxiId;
	}
	public boolean isBusy() {
		return isBusy;
	}
	public void setIsBusy(boolean status) {
		isBusy = status;
	}
	public void setLocation(Location pos){
		loc.setPosition(pos.getX(), pos.getY());
		if((loc.getX() < 0) || (loc.getY() < 0)) {
			System.out.println("Wrong pos" + this);
		}
	}
	
	@Override
	public String toString() {
		return "Taxi [taxiId=" + taxiId + ", loc=" + loc + ", isBusy=" + isBusy
				+ "]";
	}

}
