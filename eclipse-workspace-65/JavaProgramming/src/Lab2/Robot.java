package Lab2;

public class Robot {
	private int ID;
	private String name;
	private char version;
	public int forward;
	public int backward;
	public int left;
	public int right;
	public static int numberOfRobot = 0;
	
	Robot(){
		this.ID = 0;
		this.name = "";
		this.version = 'I';
		this.forward = 0;
		this.backward = 0;
		this.left = 0;
		this.right = 0;
		numberOfRobot++;	
	}
	
	Robot(int newID, String newName){
		this.ID = newID;
		this.name = newName;
		this.version = 'I';
		this.forward = 0;
		this.backward = 0;
		this.left = 0;
		this.right = 0;
		numberOfRobot++;
	}
	
	Robot(int newID, String newName, char newVersion){
		this.ID = newID;
		this.name = newName;
		this.version = newVersion;
		this.forward = 0;
		this.backward = 0;
		this.left = 0;
		this.right = 0;
		numberOfRobot++;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setID(int newID) {
		this.ID = newID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public char getVersion() {
		return this.version;
	}
	
	public void setVersion(char newVersion) {
		this.version = newVersion;
	}
	
	public int goForwardN(int n) {
		this.forward += n;
		return this.forward;
	}
	
	public int goBackwardN(int n) {
		this.backward += n;
		return this.backward;
	}
	
	public int goLeftN(int n) {
		this.left += n;
		return this.left;
	}
	
	public int goRightN(int n) {
		this.right += n;
		return this.right;
	}
	
	public static int getNumberOfRobot() {
		return numberOfRobot;
	}

}