package Lab4;

public class City {
	private int lati;
	private int longi;
	private String name;
	public boolean isCapitalCity;
	
	City(String name){
		this.name = name;
		this.lati = 0;
		this.longi = 0;
	}
	
	City(String name, int lati, int longi){
		this.name = name;
		this.lati = lati;
		this.longi = longi;
	}
	
	City(String name, Boolean capitalCity){
		this.name = name;
		isCapitalCity = capitalCity;
	}
	
	public int getLati() {
		return lati;
	}
	
	public void setLati(int lati) {
		this.lati = lati;
	}
	
	public int getLongi() {
		return longi;
	}
	
	public void setLongi(int longi) {
		this.longi = longi;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "City{" + 
				"lati=" + lati +
				", longi=" + longi + 
				", name='" + name + '\'' +
				", isCapitalCity=" + isCapitalCity +
				'}';
	}
}
