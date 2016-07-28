package taxiservice;

public class Location {
	private int x, y;
	public Location(int xa, int ya) {
		x = xa;
		y = ya;
	}
	
	public void setPosition(int xa, int ya) {
		x = xa;
		y = ya;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// returns the "manhattan metric" distance
	public int getDistance(Location loc) {
		int dx = x - loc.x;
		int dy = y - loc.y;
		if(dx < 0)
			dx = -dx;
		if(dy < 0)
			dy = -dy;
		
		return dx + dy;
	}
	public String toString() {
		return "X: " + x + " Y: " +y;
		
	}
}

