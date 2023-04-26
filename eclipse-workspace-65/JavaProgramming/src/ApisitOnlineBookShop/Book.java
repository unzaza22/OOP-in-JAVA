package ApisitOnlineBookShop;

public class Book extends Product {
	 private String title;
	 private String publisher;
	 private int yearPublished;
	 
	 Book(double regularPrice){
			super(regularPrice);
		}
	 
	 public Book(double regularPrice,String title, String publisher, int yearPublished) {
		 super(regularPrice);
		 this.title = title;
		 this.publisher = publisher;
		 this.yearPublished = yearPublished;
	 }
	 
	 public double computerSalePrice(){
		 return super.getRegularPrice()*0.5;
	 }
	 
	 public String getTitle() {
		 return title;
	 }
	 
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 
	 public String getPublisher() {
		 return publisher;
	 }
	 
	 public void setPublisher(String publisher) {
		 this.publisher = publisher;
	 }
	 
	 public int getYearPublished() {
		 return yearPublished;
	 }
	 
	 public void setYearPublished(int yearPublished) {
		 this.yearPublished = yearPublished;
	 }
	 
	 public void introduce() {
			System.out.print( "ชื่อหนังสือ : " + getTitle()
					+ "\nสำนักพิมพ์ : " + getPublisher()
					+ "\nปีที่ผลืด : " + getYearPublished()
					+ "\nราคา : " + computerSalePrice()
					+ "\n");
	}

}
