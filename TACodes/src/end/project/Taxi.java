package end.project;

public class Taxi {
	Location loc;
	boolean busy;

	public Taxi() {
		int x = ((int) (Math.random() * 10113)) % 1001;
		int y = ((int) (Math.random() * 10113)) % 1001;
		loc = new Location(x, y);
		busy = false;
	}

	public Location getLocation() {
		return this.loc;
	}

	public boolean isBusy() {
		return this.busy;
	}
}