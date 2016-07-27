package end.project;

import java.util.ArrayList;

public class TaxiFleet {
	private ArrayList<Taxi> taxis;
	private int num;

	public TaxiFleet() { // number of taxis in the fleet
		taxis = new ArrayList<Taxi>();

	}

	// get the fleet going. num is the number of taxis in the fleet.
	// Should be called once before any use of TaxiFleet
	public void start(int num) {
		this.num = num;
		for (int i = 0; i < num; i++) {
			taxis.add(new Taxi());
		}
	}

	// request a taxi for a user at a specific x,y location. Returns the id of a
	// taxi if
	// any found. Otherwise returns -1
	public int request(int userId, Location loc) {
	}

	// release a taxi. Returns the time for which the taxi was occupied (since
	// it wasrequested)
	public int release(int userId, Location loc) {
	}

	// get the list of taxis (with their current state)
	public ArrayList<Taxi> getTaxis() {
	}
}