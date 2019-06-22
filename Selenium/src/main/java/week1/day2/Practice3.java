package week1.day2;


public class Practice3 {

	static int[] num = {1,2,3,4,5,6,7,8,9,10};

	// calculate area of square, traingle for overloading

	public int calculateArea (int a) {
		return a*a;
	}

	public int calculateArea (int h, int b) {
		return ((h*b)/2);

	}

	public float calculateArea (float a) {
		return a*a;
	}

	public float calculateArea (float h, float b) {
		return ((h*b)/2);

	}

	// Constructor overloading

	public Practice3 () {
		System.out.println("no args");
	}

	public Practice3 (int a ) {
		System.out.println(" one args");
	}

	public Practice3 (float h, float b) {
		this();
		System.out.println("two args");
	}

	// print odd numbers using foreach

	public void printOddNum (int[] num1) {

		for (int newnum : num1) {
			if (newnum%2!=0) {
				System.out.println(newnum);
			}


		}


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice3 overload = new Practice3();
		System.out.println(overload.calculateArea(2f, 5f));
		// Practice3 overload1 = new Practice3(5f,10f);
		overload.printOddNum(num);



	}

}
