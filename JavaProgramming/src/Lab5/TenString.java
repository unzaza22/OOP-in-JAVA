package Lab5;

public class TenString {
	String str1 = "";
	int x;
	int i;
	
	TenString(String str1){
		this.str1 = str1;
	}
	
	// คืนค่าจำนวนตัวอักษรในสตริง
	public int getLength() {
		int len = str1.length();
		
		return len;
	}
	
	// คืนค่าตัวอักษรในสตริงที่อยู่ในตำแหน่ง index ที่กำหนด
	public void getCharAt() {
		for (i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
	}
	
	// สร้างสตริงใหม่จากสตริงเติมโดยคัดลอกตั้งแต่ตำแหน่ง beginindex ถึง endindex-1
	public String getSubString(int x) {
		String substr1 = str1.substring(x);
		
		return substr1;
	}
	
	public void getEquals() {
		if (str1.equals("Hello")) {
			System.out.println("Right String Hello");
		} else if(str1.equals("World")){
			System.out.println("Right String World");
		} else {
			System.out.println("Not Found");
		}
	}

}
