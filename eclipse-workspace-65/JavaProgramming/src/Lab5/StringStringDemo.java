package Lab5;

public class StringStringDemo {
	public static void main(String[] args) {
		String str = "Hello World!";
		String str1 = "Hello";
		String str2 = "World!";
		String str3;
		str3 = str1 + " " + str2;
		int i = 0;
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		// length(): คืนค่าจำนวนตัวอักษรในสตริง
		int len = str.length();
		System.out.println("length(): คืนค่าจำนวนตัวอักษรในสตริง");
		System.out.println("Length = " + len);
		System.out.println();
		
		// charAt(int index): คืนค่าตัวอักษรในสตริงที่อยู่ในตำแหน่ง index ที่กำหนด
		System.out.println("charAt(int index): คืนค่าตัวอักษรในสตริงที่อยู่ในตำแหน่ง index ที่กำหนด");
		for (i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		// substring(int beginIndex, int endIndex): สร้างสตริงใหม่จากสตริงเดิมโดยคัดลอกตั้งแต่ตำแหน่ง beginIndex ถึง endIndex-1
		String substr = str.substring(0, 6);
		String substr1 = str.substring(6);
		System.out.println("substring(int beginIndex, int endIndex): สร้างสตริงใหม่จากสตริงเดิมโดยคัดลอกตั้งแต่ตำแหน่ง beginIndex ถึง endIndex-1");
		System.out.println(substr);
		System.out.println(substr1);
		System.out.println();
		
		// equals(Object anObject): ตรวจสอบว่าสตริงที่เรียกใช้เท่ากับ Object ที่กำหนดหรือไม่ (return true ถ้าเท่ากันและ false ถ้าไม่เท่ากัน)
		System.out.println("equals(Object anObject): ตรวจสอบว่าสตริงที่เรียกใช้เท่ากับ Object ที่กำหนดหรือไม่ (return true ถ้าเท่ากันและ false ถ้าไม่เท่ากัน)");
		if (str.equals(str1)){ 
			System.out.println("str and str1 are equal");
		} else if (str1.equals(str2)) {
			System.out.println("str1 and str2 are equal");
		} else {
			System.out.println("str and str1 are not equal");
		}
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		StringBuffer strBuff = new StringBuffer("Hello World!");
		
		// append(String str): เพิ่มสตริง str ไปยังสตริงเดิม
		System.out.println("append(String str): เพิ่มสตริง str ไปยังสตริงเดิม");
		strBuff.append(" word");
		System.out.println(strBuff);
		System.out.println();
		
		// delete(int start, int end): ลบส่วนที่อยู่ระหว่าง start ถึง end-1 ออกจากสตริง
		System.out.println("delete(int start, int end): ลบส่วนที่อยู่ระหว่าง start ถึง end-1 ออกจากสตริง");
		System.out.println("Original StringBuffer: " + strBuff);
		
		strBuff.delete(5, 11);
		strBuff.delete(6, 11);
		System.out.println("Modified StringBuffer: " + strBuff);
		System.out.println();
		
		// insert(int offset, String str): แทรกสตริง str ในตำแหน่ง offset ของสตริง
		System.out.println("insert(int offset, String str): แทรกสตริง str ในตำแหน่ง offset ของสตริง");
		
		strBuff.insert(5, " World");
		System.out.println(strBuff);
		System.out.println();
		
		// reverse(): กลับด้านสตริง
		System.out.println("reverse(): กลับด้านสตริง");
		
		strBuff.reverse();
		System.out.println(strBuff);
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		StringBuilder strBuild = new StringBuilder("Hello");
		
		// append(String str): เพิ่มสตริง str ไปยังสตริงเดิม
		System.out.println("append(String str): เพิ่มสตริง str ไปยังสตริงเดิม");
		strBuild.append(" World!");
		
		System.out.println(strBuild.toString());
		System.out.println();
		
		
					
	}

}
