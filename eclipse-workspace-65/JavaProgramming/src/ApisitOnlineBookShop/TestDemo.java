package ApisitOnlineBookShop;


public class TestDemo {

	public static void main(String[] args) {
		Product[] products = new Product[6];
		products[0] = new Book(250.0, "Basic Java Programming", "UTCC Publishing", 2006);
		products[1] = new Book(400.0, "Advanced Java Programming", "Long Publishing", 2010);
		products[2] = new Book(250.00, "Priniples of Objected-oriented Programming", "Star Publishing", 2010);
		products[3] = new ChildrenBook(90.00, "Java Programming for Kids", "ABC Publishing", 2015, 6);
		products[4] = new ChildrenBook(100.00, "Computer for Kindergarden", "ABC Publishing", 2014, 3);
		products[5] = new Cartoon(50.00, "Doreamon", "KFC Publishing", 2022, "Nobi Nobita");
		
		for (Product product : products) {
		    if (product instanceof Book) {
		        ((Book) product).introduce();
		        System.out.println();
		    }
		}
		
		for (Product product : products) {
		    if (product instanceof ChildrenBook) {
		        ((ChildrenBook) product).introduce();
		        System.out.println();
		    }
		}
		
		for (Product product : products) {
		    if (product instanceof Cartoon) {
		        ((Cartoon) product).introduce();
		        System.out.println();
		    }
		}
		
	}

}
