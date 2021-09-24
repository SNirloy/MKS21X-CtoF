/* These two functions should accept a double and return a double. This allows for 
more accurate conversions. Furthermore, there is a fraction involved : 9/5 and 5/9, but if 
they are written that way, as integers, the output will be 1 and 0 respectively. */
public class CtoFTester{
	public static double celsiusToFahrenheit(double celsius){
		double toFConvert = celsius * (9.0/5.0) + 32;
		return toFConvert;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		double toCConvert = (fahrenheit - 32) * 5.0/9.0;
		return toCConvert;
	}
	
	public static void main(String[]args){
		System.out.println("Hello, world!");
		System.out.println(celsiusToFahrenheit(0));
		System.out.println(celsiusToFahrenheit(100));
		System.out.println(fahrenheitToCelsius(32));
		System.out.println(fahrenheitToCelsius(212));
		System.out.println(fahrenheitToCelsius(celsiusToFahrenheit(79.7)));
	}
}