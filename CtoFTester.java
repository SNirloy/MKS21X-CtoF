/* These two functions should accept a double and return a double. This allows for 
more accurate conversions. Furthermore, there is a fraction involved : 9/5 and 5/9, but if 
they are written that way, as integers, the output will be 1 and 0 respectively. */
public class CtoFTester{
	public static double celsiusToFahrenheit(double celsius){
		double toFConvert = celsius * (9.0/5.0) + 32;
		return toFConvert;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		return 1.0;
	}
	
	public static void main(String[]args){
		System.out.println("Hello, world!");
		System.out.println(celsiusToFahrenheit(0));
		System.out.println(celsiusToFahrenheit(100));
	}
}