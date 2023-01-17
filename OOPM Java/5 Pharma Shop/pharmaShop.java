import java.util.*;
 
public class pharmaShop {
    public static void main(String args[]) {
        String finaltable = new String();
        Scanner sc = new Scanner(System.in);
        finaltable = "";
        String medname;
        int rate, quantity, total = 0, rupee;
        int n, i;
        System.out.println("Enter the number of medicines you want to enter: ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Enter the medicine name: ");
            medname = sc.next();
            System.out.println("Enter it's rate: ");
            rate = sc.nextInt();
            System.out.println("Enter the quantity: ");
            quantity = sc.nextInt();
            rupee = rate * quantity;
            total += rupee;
            finaltable += "\nNo. " + (i + 1) + "\nName: " + medname + "\nQuantity: " + quantity + "\nRate: " + rate
                    + "\nRupees:" + rupee;
 
        }
        finaltable += "\n----------------------------------------\nTotal:" + total;
        System.out.println(finaltable);
 
    }
}
 
