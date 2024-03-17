package ClassesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		String strone = "Java ";
		strone = strone + "programming";
		System.out.println("value of strone :" + strone);
		System.out.println("value of strone :" + strone.hashCode());
		//strone.concat("Language");
		strone = strone.concat("Language");
		
		System.out.println("Value after cancat : " +strone);
		//strone = strone.concat("Language");
		System.out.println("Value of strone : " +strone.hashCode());
		
		String strtwo = new String("Functional Programming ");
		strtwo.concat("Language");
		System.out.println("Value of strtwo :" + strtwo);
	}

}
