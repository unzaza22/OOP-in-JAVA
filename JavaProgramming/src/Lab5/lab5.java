package Lab5;

public class lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		
		for (int i = 0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println();
		/////////////////////////////////////////////////////////
		
		String str2 = "Java is very easy";
		String[] words = str2.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////
		
		String str3 = "Welcome to Thailand, the land of smile, Thailand is the best place to visit at the summer season.";
		String newStr3 = str3.replaceAll("Thailand", "THAILAND");
		System.out.println(newStr3);
		
		/////////////////////////////////////////////////////////
			
	}

}
