import java.util.Scanner;
class division
{
    static int divide(int numerator, int denominator)
    {
        int sign = ((numerator < 0) ^
                   (denominator < 0)) ? -1 : 1;
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int quotient = 0;
         
        while (numerator >= denominator)
        {
            numerator -= denominator;
            ++quotient;
        }
     
        return sign * quotient;
    }   
     
    public static void main (String[] args)
    {
        Scanner reader1 = new Scanner(System.in);
        try{
            System.out.print("Numerator =  ");
            int n = reader1.nextInt();
            System.out.print("Denominator =  ");
            int d = reader1.nextInt();  
            System.out.println(divide(n, d));
        }
        finally{
            reader1.close();
        }
    }
}
