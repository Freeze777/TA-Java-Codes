package end.project;
public class Taxi {
	private int taxiId;
	private Location loc;
	private boolean isBusy;
	private static int tId = 0;
	public Taxi() {
		taxiId = ++tId;
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
	public void setLocation(Location loc){
		this.loc.setPosition(loc.getX(), loc.getY());
	}
	@Override
	public String toString() {
		return "Taxi [taxiId=" + taxiId + ", loc=" + loc + ", isBusy=" + isBusy
				+ "]";
	}
	
}
