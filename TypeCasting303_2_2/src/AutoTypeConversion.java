
public class AutoTypeConversion {
   public static void main(String[] args) {
       int x = 20;
       double y = 40.5;
       long p = 30;
       float q = 10.60f;
       // int z = x + y; (1) // Error; cannot convert from double to int.
       double z = x + y;
       System.out.println("Sum of two numbers: " + z);

    // long r = p - q; // (2) // Error; cannot convert from float to long.
       float r = p - q;
       System.out.println("Subtraction of two numbers: " + r);
       
       // ===============================================================================
       // Automatic Type Promotion 

       byte b = 42;
       char c = 'a'; // the a in this case is converted to binary via ASCII
       short s = 1024;
       int i = 50000;
       float f = 5.67f;
       double d = .1234;
// Expression:
       double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
       System.out.println("result = " + result);

   }
}

// type casting is taking one number type into and store it into another number type

//implicit: it converts on its own it's all about converting a data type to another only when the data type is small
// Explicit is when trying to convert a large data type to a smaller data type you must explicit that with () to perform the conversion
// or The process of converting lower data types into higher data types is called Widening or Narrowing conversion in Java.



//
//boolean: Represents true or false values.
//char: Represents a single Unicode character.
//byte: Represents a signed 8-bit integer.
//short: Represents a signed 16-bit integer.
//int: Represents a signed 32-bit integer.
//long: Represents a signed 64-bit integer.
//float: Represents a single-precision 32-bit floating-point number.
//double: Represents a double-precision 64-bit floating-point number.


//int and long are for storing whole numbers