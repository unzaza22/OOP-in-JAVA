package ApisitOnlineBookShop;

public class ChildrenBook extends Book {
	int age;
	
	ChildrenBook(double regularPrice){
		super(regularPrice);
	}
	
	ChildrenBook(double regularPrice, String title, String publisher, int yearPublished, int age){
		super(regularPrice, title, publisher, yearPublished);
		this.age = age;
	}
	
	public double computerSalePrice() {
		return super.getRegularPrice()*0.3;
	}
	
	 public void introduce() {
			System.out.print( "ชื่อหนังสือ : " + getTitle()
					+ "\nสำนักพิมพ์ : " + getPublisher()
					+ "\nปีที่ผลืด : " + getYearPublished()
					+ "\nราคา : " + computerSalePrice()
					+ "\nอายุ : " + age + " ปี\n");
	}
	
}
