package Week_1;

public class CalculateSales {

    public static void main(String[] args) {
        // TODO code application logic here
        double item;
        final double taxAmount;// we are puting "final" code when the number is do not changed
        double total;
        
        item = 10;
        taxAmount = 0.07;
        total = item +(item * taxAmount);
        
        System.out.println("An item which costs $ " + item + " after PA tax "
                + "will cost a total of $" + total);
        
        
        
        
    }
    
}
