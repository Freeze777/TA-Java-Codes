package taxiservice;
/*@Author : Prof. Srikanth
@Tested : Freeze
3 bug fixes
*/
import java.util.ArrayList;

public class TaxiFleet {
	private ArrayList<Taxi> taxis;

	private static final int MAX_USER_ID = 200;
	private static final int CLOSE_DIST = 20;
	private static final int NUM_ITERATIONS = 10000;
	private static final int tock = 500; // millisecs per iteration

	private int lastTick; // local clock in msecs

	Thread animateThread;

	// helper class to keep track of usage of taxi by a user.
	private class TaxiUse {
		private Taxi taxi;
		private int startTime;

		TaxiUse(Taxi t, int s) {
			taxi = t;
			startTime = s;
		}
	}

	// non-null if user is currently occupying a car
	TaxiUse users[] = new TaxiUse[MAX_USER_ID];

	public TaxiFleet() {

	}

	// get the fleet going. num is the number of taxis in the fleet.
	// Should be called once before any use of TaxiFleet
	public void start(int num) {
		taxis = new ArrayList<Taxi>();
		for (int i = 0; i < num; i++) {
			Taxi t = new Taxi();
			taxis.add(t);
			t.setLocation(new Location((int) (Math.random() * 1000),
					(int) (Math.random() * 1000)));
		}
		animateThread = new Thread() {
			public void run() {
				animate();
			}
		};
		animateThread.start();
	}

	// request a taxi for a user at a specific x,y location. Returns the id of a
	// taxi if any found. Otherwise returns -1
	public int request(int userId, Location loc) {
		if (userId <= 0 || userId >= MAX_USER_ID) { // should throw an
													// exception?
			return -1;
		}
		int retId = -1;

		Taxi taxi = getClosest(loc);
		if (taxi != null) {
			taxi.setIsBusy(true);
			taxi.setLocation(loc);
			users[userId] = new TaxiUse(taxi, lastTick);
			retId = taxi.getTaxiId();
			System.out.println(taxi);
		}
		return retId;
	}

	// release a taxi. Returns the time for which the taxi was occupied (since
	// it was requested)
	public int release(int userId, Location loc) {
		if (userId <= 0 || userId >= MAX_USER_ID) { // should throw an
													// exception?
			return -1;
		}

		int time = 0;
		if (users[userId] != null) {
			time = lastTick - users[userId].startTime;
			users[userId].taxi.setIsBusy(false);
			users[userId].taxi.setLocation(loc);
		}
		return time / 1000;
	}

	// get the list of taxis (with their current state)
	public ArrayList<Taxi> getTaxis() {
		return new ArrayList<Taxi>(taxis);
	}

	private Taxi getClosest(Location loc) {

		for (Taxi t : taxis) {
			Location tloc = t.getLocation();
			if (loc.getDistance(tloc) < CLOSE_DIST)
				return t;
		}

		return null;
	}

	private void animate() {
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			for (Taxi t : taxis) {
				int dx = (int) Math.random() * 40 - 20;
				int dy = (int) Math.random() * 40 - 20;
				Location loc = t.getLocation();
				// System.out.println(loc);
				t.setLocation(new Location((loc.getX() + dx+1000)%1000, (loc.getY() + dy+1000)%1000));
			}
			lastTick += tock;
			try {
				Thread.sleep(tock);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TaxiFleet fleet = new TaxiFleet();
		fleet.start(25);
		ArrayList<Taxi> taxis = fleet.getTaxis();
		System.out.println(taxis);
		for(int i=0;i<50;i++) {
			// try to get a taxi. Start with a loc close to some taxi
			Taxi t = taxis.get(i/2);
			int ctId = fleet.request(17, t.getLocation());
			try {
				if(ctId >= 0) {
					Taxi myTaxi = taxis.get(ctId);
					System.out.println("Round " + i + " Found taxi: " + myTaxi);
					Thread.sleep(800);
					// drop off at a random location
					fleet.release(17, new Location(i*10, i*15));
				} else {
					Thread.sleep(800);	
				} 
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			System.out.println(fleet.getTaxis());
		}
	}
}
