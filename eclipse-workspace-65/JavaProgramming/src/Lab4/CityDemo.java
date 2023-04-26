package Lab4;

public class CityDemo {
	public static void main(String[] args) {
		City[] cities = new City[4];
		
		cities[0] = new City("Bangkok");
		cities[1] = new City("NewYork", 40, -74);
		cities[2] = new City("Sydney", 40, -74);
		cities[3] = new City("Paris", true);
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i].toString());
		}
		
		for (int i = 0; i < cities.length; i++) {
			for (int j = i+1; j < cities.length; j++) {
				if (cities[i].getLati() == cities[j].getLati() && cities[i].getLongi() == cities[j].getLongi()) {
					System.out.println("\nFound duplicate latitude and longtitude for " + cities[i].getName());
					
					cities[i].setLati(cities[i].getLati() + 1);
					cities[i].setLongi(cities[i].getLongi() + 1);
					System.out.println("Changed latitude and longitude for " + cities[i].getName() + "\n");
				}
			}
		}
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i].toString());
		}
		
	}
}
