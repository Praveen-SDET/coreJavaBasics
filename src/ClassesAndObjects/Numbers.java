package ClassesAndObjects;

import java.text.NumberFormat;
import java.util.Locale;

public class Numbers {

	public Numbers(double d) {
	
	}

	public static void main(String[] args) {
		Numbers currency = new Numbers (9876543.21);
		NumberFormat currencyFormatter;
		String currencyOut;
		
		currencyFormatter = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		currencyOut = currencyFormatter.format(currency);
		System.out.println(currencyOut + " "+ Locale.ENGLISH );

	}

}
