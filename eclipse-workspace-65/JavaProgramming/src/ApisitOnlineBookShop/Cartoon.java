package ApisitOnlineBookShop;

public class Cartoon extends Book {
	private String characterName;
	
	Cartoon(double regularPrice){
		super(regularPrice);
	}
	
	Cartoon(double regularPrice, String title, String publisher, int yearPublished, String characterName){
		super(regularPrice, title, publisher, yearPublished);
		this.characterName = characterName;
	}
	
	public double computerSalePrice() {
		return super.getRegularPrice()*0.4;
	}
	
	 public void introduce() {
			System.out.print( "ชื่อหนังสือ : " + getTitle()
					+ "\nสำนักพิมพ์ : " + getPublisher()
					+ "\nปีที่ผลืด : " + getYearPublished()
					+ "\nราคา : " + computerSalePrice()
					+ "\nตัวละครเอก : " + characterName + "\n");
	}
	
}
