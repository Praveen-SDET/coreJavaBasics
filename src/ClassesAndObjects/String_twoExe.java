package ClassesAndObjects;

public class String_twoExe {

	public static void main(String[] args) {
		// initializing name 
		String name = "Subramani Praveen";
		
		System.out.println("Full Name is.."+name);
		
		int total =name.length(); //to get length of the name 
		System.out.println("Length of the String is ..."+total);
		
		//short the name 
		name = name.trim();
		String s1 = "";
		for(int i=0;i<total;i++) {
			char c=name.charAt(i);
			
			if(c != ' ') {
				s1=s1+c;
			}
			else { System.out.println(Character.toUpperCase(s1.charAt(0))+ ",");}
		}
		String s2 =" ";
		for(int m=0;m<s2.length();m++) {
			if(m==0) {
				s2=s2+Character.toUpperCase(s1.charAt(0));
			}
			else { s2=s2+Character.toUpperCase(s1.charAt(m));}
			System.out.println(s2);
		}
	}

}
