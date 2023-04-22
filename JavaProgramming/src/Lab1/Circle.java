package Lab1;

public class Circle {
	double radius;
	
	Circle() {
		radius = 0.0;
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return Math.PI*radius*radius;
	}
	
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	void display() {
		System.out.println("radius = " + radius);
		System.out.println("Circle area = " + getArea());
		System.out.println("Circle perimeter = " + getPerimeter());
	}

}

// 1.คำสั่ง String name; และ public Sting name; มีความหมายแตกต่างกันหรือไม่ อย่างไร
//   ไม่ต่าง เป็นการกำหนดค่าตัวแปรเป็น String และเนื่องจากไม่ได้กำหนดว่าเป็น public หรือไม่ normal ของการตั้งค่าจึงเป็น public เหมือนกัน
// 2.คำสั่ง void printNamr(); และ public void printName() มีความหมายแตกต่างกันหรือไม่ อย่างไร
//   ไม่ได้เนื่องจาก void printName(); เป็นการกำหนด Method ไม่สามารถใช้แบบการกำหนดตัวแปรได้
// 3.การประกาศคลาสให้เป็น public ทำได้หรือไม่ และให้ผลลัพธ์เป็นอย่างไร
//   ทำได้ มีผลให้สามารถใช้ Method ได้โดยไม่จำกัดสิทธิ์ในการเข้าใช้
// 4.การสร้างวัตถุชนิด Person ขึ้นมาในคลาสที่อยู่คนละแพ็กเกจกับคลาส Person จะต้องทำอย่างไร
//   Person ps = new Person; เป็นการประกาศเรียกใช้ Person ให้เป็น ps กำหนดให้เป็น Person เพื่อเรียกใช้