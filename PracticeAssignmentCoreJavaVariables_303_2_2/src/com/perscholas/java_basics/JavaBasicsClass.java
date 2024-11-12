package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program that declares two integer variables, 
//		assigns an integer to each, and adds them together. 
//		Assign the sum to a variable. Print out the result.

		int one = 10;
		int two = 20;
		
		int oneNtwo = one + two;
		
		System.out.println(oneNtwo);
		
		//============================
//		Write a program that declares two double variables, 
//		assigns a number to each, and adds them together. 
//		Assign the sum to a variable. Print out the result.
		
		double oneD = 2.25;
		double twoD = 55.3453;
		
		double oneDtwo = oneD + twoD;
		
		System.out.println(oneDtwo);
		
		//===============================
//		Write a program that declares an integer variable and a double variable, 
//		assigns numbers to each, and adds them together. Assign the sum to a variable. 
//		Print out the result. What variable type must the sum be?

		// in this case we need to explicit the conversion when finding the sum
		int oneInt = 10;
		double oneDouble = 10.567;
		
		// to find the sum it must be of double type because of type casting
		// double has a larger range and can store more digits as decimals 
		// it will cause and error if the type used it int
		
		double intNdouble = oneInt + oneDouble; 	
		System.out.println(intNdouble);
		
		//===============================
//		Write a program that declares two integer variables, 
//		assigns an integer to each, and divides the larger number by the smaller number. 
//		Assign the result to a variable. Print out the result. Now change the larger number
//		to a decimal. What happens? What corrections are needed?

		int oneA = 30;
		double oneB = 50.2;
		
		double aNb = oneB / oneA;
		double aNbb = oneA / oneB; // dividing it to smaller


		System.out.println(aNb); // there was an error when double wasn't assigned
		System.out.println(aNbb); // the correction that is needed is to change the int into a double

		//================================
//		Write a program that declares two double variables, 
//		assigns a number to each, and divides the larger by the smaller number. 
//		Assign the result to a variable. Print out the result. 
//		Now, cast the result to an integer. Print out the result again.
		
		double oneC = 23.450;
		double twoE = 15.99;
		
		double oneCEtwo = oneC / twoE;
		double castCE = (int) oneCEtwo; // this is casting changing from lower to higher and put it in a parentheses 
		System.out.println(oneCEtwo);
		
		//================================
//		Write a program that declares two integer variables, x and y, 
//		and assigns the number 5 to x and the number 6 to y. 
//		Declare a variable q and assign y/x to it and print q. 
//		Now, cast y to a double and assign it to q. Print q again.

		
		int x = 5;
		int y = 6;
		
		int q = y/x;
		
		// now casting y to a double
		double qCast = (double) y / x;
		
		System.out.println(qCast);
		
		// ============================
		
//		Write a program that declares a named constant and uses it in a calculation. 
//		Print the result.
		
//		named const means the value never changes it remains the same
		// make all const variables upper case is a java convention 
		// final comes before the type variable
		final double PI = 3.14;
		double radius = 10;
		
		double area  = PI * radius * radius;
		
		System.out.println(area);

		// Write a program where you create three variables that represent 
//		products at a cafe. The products could be beverages like coffee, 
//		cappuccino, espresso, green tea, etc. Assign prices to each product. 
//		Create two more variables called subtotal and totalSale and complete an 
//		“order” for three items of the first product, four items of the second product, 
//		and two items of the third product. Add them all together to calculate the 
//		subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to 
//		obtain the totalSale amount. Be sure to format the results to two decimal places.
		
		double javaCoffee = 5.99;
		double tea = 2.75;
		double decaf = 3.35;
		
		double subTotal = javaCoffee * 3 + tea * 4 + decaf * 2;
		
		System.out.println(subTotal);
		
		final double SALES_TAX = 8.02;
		
		double totalSale = subTotal + SALES_TAX;
		
		System.out.println(totalSale);


		
		
		
		
		
		
		

		


	}

}