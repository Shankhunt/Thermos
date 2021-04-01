public class Thermos {
	
	double qty;
	String brand;
	String liquid;
	
	Thermos(String liquid, double liters, String brand)
	{
		liters=0;
	}
	
	void add(double val)
	{
		qty = qty + val; 
	}
	
	void display()
	{
		System.out.println("Liquid is " + liquid);
	}
	
	public static void main(String [] args) {
		//Too auto generated method stub
		
		
	}

}
