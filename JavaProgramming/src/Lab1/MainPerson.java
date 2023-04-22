package Lab1;

public class MainPerson {
	public static void main(String[] args) {
		Person boss = new Person("John Smith", "062-443-6279");
		Person clerk = new Person("John Doe", "077-018-5331");
		
		boss.printName();
		boss.printPhone();
		System.out.println();
		clerk.printName();
		clerk.printPhone();
	}
}

/* 1. คําสั่ง String name; และ public String name; มีความหมายแตกต่างกันหรือไม่ อย่างไร
 *    คำสั่ง String name; เป็นการประกาศตัวแปรชนิด String ชื่อ name แต่ไม่ได้กำหนด modifier การเข้าถึง (access modifier) ทำให้ตัวแปร name 
 *    มีการเข้าถึงเป็น default หรือ package-private ซึ่งหมายความว่าตัวแปร name สามารถเข้าถึงได้ภายในแพคเกจเดียวกันเท่านั้น

 *    ส่วนคำสั่ง public String name; เป็นการประกาศตัวแปรชนิด String ชื่อ name และกำหนด modifier การเข้าถึงเป็น public ซึ่งหมายความว่าตัวแปร name 
 *    สามารถเข้าถึงได้จากทุกที่ในโปรแกรม ไม่ว่าจะอยู่ในแพคเกจเดียวกันหรือไม่ก็ตาม
 * */

/* 2. คําสั่ง void printName( ); และ public void printName( ) มีความหมายแตกต่างกันหรือไม่ อย่างไร
 *    คำสั่ง void printName( ); และ public void printName( ) มีความหมายแตกต่างกันเพียงเล็กน้อย โดย void printName( ); 
 *    จะมีการกำหนด modifier เป็น private, protected หรือไม่มีเลย ซึ่งจะทำให้เมทอด printName() เป็น method ที่สามารถเข้าถึงได้เฉพาะภายในคลาสเท่านั้น 
 *    ในขณะที่ public void printName( ) จะทำให้เมทอด printName() เป็น method ที่สามารถเข้าถึงได้จากภายนอกคลาสด้วย สามารถเรียกใช้งานได้โดยใช้ชื่อ object 
 *    ของคลาส เช่น object.printName() โดย public เป็น access modifier ที่ใช้กำหนดความสามารถในการเข้าถึงของ method หรือ attribute ของคลาส 
 *    โดย public จะเป็นตัวกำหนดว่า method หรือ attribute นั้นสามารถเข้าถึงได้ทั้งภายในคลาสและภายนอกคลาส
 */

/* 3. การประกาศคลาสให้เป็น public ทําได้หรือไม่ และให้ผลลัพธ์เป็นอย่างไร
 *    การประกาศคลาสให้เป็น public ได้ แต่จะต้องมีไว้เพียงคลาสเดียวเท่านั้น เพราะคลาสที่เป็น public จะสามารถเข้าถึงได้จากทุกที่ในโปรแกรม ถ้ามีคลาสเดียวกันที่ประกาศให้เป็น public ในไฟล์เดียวกัน 
 *    หรือไฟล์อื่นที่ import คลาสนั้นเข้ามา เกิดข้อผิดพลาดขึ้นได้ว่า "public class มีมากกว่าหนึ่ง" (multiple public classes found) ซึ่งจะไม่สามารถ compile 
 *    ได้
 * */

/* 4. การสร้างวัตถุชนิด Person ขึ้นมาในคลาสที่อยู่คนละแพ็กเกจกับคลาส Person จะต้องทําอย่างไร
 *    สร้างวัตถุชนิด Person โดยใช้ constructors ตามที่ได้กำหนดไว้ในคลาส Person
 *    โดยที่ "Boss" และ "123456789" เป็นข้อมูลที่ใช้สร้างวัตถุชนิด Person แบบมีพารามิเตอร์สองตัว (name และ phone) และ "Clerk" เป็นข้อมูลที่ใช้สร้างวัตถุชนิด 
 *    Person แบบมีพารามิเตอร์เดียว (name) ตามลำดับ
 * */
