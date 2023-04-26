package Lab3;

public class Point {
	
	public int x;
	public int y;
	
	Point(){
		this.x = 0;
		this.y = 0;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}

	
	void movePoint(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	Point copy(Point p) {
		return new Point(this.x, this.y);
	}
	
	double distance(Point p1, Point p2) {
		int xDiff = p2.x - p1.x;
		int yDiff = p2.y - p1.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	double distance(int x1, int y1, int x2, int y2) {
		int xDiff = x2 - x1;
		int yDiff = y2 - y1;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public String toString() {
		return "P[" + x + "," + y + "]";
	}
	
}
