package week1.day1;

public class Vehicle {
	
	// declaration of variables
	
	String model = "Shine";
	char firstCharOfLogo = 'H';
static boolean puncture = false ;	

static int a = 3;
static int b = 10;
static int c = 9;
//static int v = 2;


	// creation of methods
	
	public void applybreak () {
		System.out.println("Applied break");
	}
	
	public int getNumberOfWheels () {
		return 2; 
		
	}
public boolean isPunctured(boolean puncture) {
	return puncture;
	
}

public void findGreaterNumber (int a, int b, int c) {
	
	if ((a>b)&&(a>c))
			{
		System.out.println("greater number is "+ a);
			}
	else if ((b>c)&&(b>a))
	{
System.out.println("greater number is "+ b);
	}
	else
	{
		System.out.println("greater number is "+c);
	}
}
	
	
	public void findVehicleType (int v) 	{
		
		if (v == 2)
		{
			System.out.println("vehicle is two wheeler " );
		}
		
		else if (v == 4)
		{
			System.out.println("vehicle is Four wheeler " );
		}
		else {
			System.out.println("not listed");
		}
		
	}

	

// create main method

public static void main(String[] args) {
	Vehicle ve = new Vehicle();
	ve.applybreak();	
	int numberofwheels = ve.getNumberOfWheels();
	System.out.println("number of wheels ** "+ numberofwheels);
	boolean punctured = ve.isPunctured(puncture);
	System.out.println("is punctured ***" + punctured);
	ve.findGreaterNumber(a,b,c );
	ve.findVehicleType(2);
	
	
	
}

}
