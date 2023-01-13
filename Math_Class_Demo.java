package Week_1;
public class Math_Class_Demo {

    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        double smallest;
        double x, y, z;
        int n1, n2, n3;
        
        //assing a to be 5
        a = 5;
        //What if I want to find a^2?
        System.out.println("a^2 = " + a * a);
        //or we can do with the Math class and see what we do (POW)
        System.out.println("a^2 using the Math class = " + Math.pow(a, 2));
        
        //We can also find the smallest or largest of 2 numbers
        a = 100;
        b = 500;
        System.out.println("\nThe smallest of the numbers " + a + " and " + b 
                + " is " + Math.min(a, b));
         System.out.println("The largest of the numbers " + a + " and " + b 
                + " is " + Math.max(a, b));
        
        //Random Numbers too we can creat easly with Math. class
        x = Math.random();
        y = Math.random();
        z = Math.random();
        
        System.out.println("\nThe value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);
        
        n1 = (int) (Math.random() * 10) + 1;//By adding 1 to our random number we no longer get 0 - 10. But instead 1 - 10.
        n2 = (int) (Math.random() * 10);        
        n3 = (int) (Math.random() * 10) + 1;        
                
        System.out.println("\nThe three random numbers are " + n1 + ", " + n2
        + ", " + n3
        );
        
    }
    
}
