package Week_1;

import java.util.Scanner;

public class Calculate_Sales_By_my_sealf {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num ;
        int num2, num3, num4;
        final double taxAmount = 0.07;//when we put in "final" code when the number is do not chanchid like lot of times 

        System.out.println("WELCOM TO \"LOLA\" SHOP MARKET\n"
                + "Would you buy somthing?\n"
                + "and would you cheakout by your sealf\n"
                + "If \"YES\" push to \"1\" buton and START to cheak out by your sealf ");
        num = scan.nextInt();
        if (num == 1) {
            System.out.println("Choose bealow \"What iteams would you to buy\"\n"
                    + "1. Bread\n 2. Drinks\n 3. Fruts");
            num2 = scan.nextInt();
//IF - Nesting method T use 
            if (num2 == 1) {
                System.out.println("Choose \"What kinde bread would you like to buy?\"\n"
                        + "1. Black bread price is $5.99 \n "
                        + "2. White bread price is $4.99");
                num3 = scan.nextInt();

                if (num3 == 1) {
                    System.out.println("How many \"BLACK\" Bread would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item = (num4*5.99);
                    double total = item + (item * taxAmount);
                    System.out.println("Your pay costs with 7% tax is $" + total);
                    
                } else if (num3 == 2) {
                    System.out.println("How many \"WHITE\" Bread would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item =(num4*4.99);
                    double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                }
            }
            else if (num2 == 2) {
                System.out.println("Choose \"What kinde drink would you like to buy?\"\n"
                        + "1.  Drinks on the can price is $2.99 \n "
                        + "2. Drinks on the bottle price is $3.99\n"
                        + "3. Any kinde Juses price is $3.50\n");
                num3 = scan.nextInt();

                if (num3 == 1) {
                    System.out.println("How many \" Drinks on the can\" would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item =(num4*2.99);
                    double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                } else if (num3 == 2) {
                    System.out.println("How many \" Drinks on the bottle\" would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item = (num4*3.99);
                    double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                    
                } else if (num3 == 3) {
                    System.out.println("How many \" Juses\" would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item = (num4*3.50);
                   double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                }
            }
           else if (num2 == 3) {
                System.out.println("Choose \"What kinde frutes would you like to buy?\"\n"
                        + "1. Mix tropic fruts 4 lb's on the box price is $8.99 \n "
                        + "2. Any kind fruts price is $2.65");
                num3 = scan.nextInt();

                if (num3 == 1) {
                    System.out.println("How many \"Box a Frutes mix\" would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item = (num4*8.99);
                    double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                } else if (num3 == 2) {
                    System.out.println("How many \"Any kind Fruts\" would you like to buy?");
                    num4 = scan.nextInt();
                    
                    double item =(num4*2.65);
                   double total = item + (item * taxAmount);
                    System.out.println("Your pay coste with 7% tax is $" + total);
                }}
        } else {
            System.out.println("Look's like, you could not choose any product to"
                    + " buy in our store.\n\n Thank you for visiting our store\n");
        }

    }
}
