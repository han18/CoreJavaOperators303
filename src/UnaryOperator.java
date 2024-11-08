public class UnaryOperator {
   public static void main(String[] args)
   {
       int sum = +1;
       // sum is now 1
       System.out.println(sum);

       sum--;
       // sum is now 0
       System.out.println(sum);

       sum++;
       // sum is now 1
       System.out.println(sum);

       sum = -sum;
       // sum is now -1
       System.out.println(sum);

       boolean result = false;
       // false
       System.out.println(result);
       // true
       System.out.println(!result);
       
    // extra info 
     //3. Increment Operator (++):
     //This operator increments the value of the operand by 1.
     //There are two versions:
     //Pre-increment (++x): Increments the value before using it in the expression.
     //Post-increment (x++): Increments the value after using it in the expression.

     //int x = 5;
     //int y = ++x; // x is 6, y is 6
     //int z = x++; // x is 7, z is 6
       
       int x = 10;
//       the operand before the variable increment the value
//       the operand after returns the value
       int y = x++;
       System.out.println(y);

   }
}





