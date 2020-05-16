import java.util.Scanner;
public class VarReadAndExchange {
    public static void main(String[] args) {
        // a) 
        int x, y;
        // b)
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter x, y | sperate numbers using spaces");

        x = myScanner.nextInt();
        y = myScanner.nextInt();

        // c)
        System.out.println("x: " + x + " - y: " + y);
        int t = x;
        // d)
        x = y;
        y = t;
        System.out.println("x: " + x + " - y: " + y);
        // e)
        int max =  Math.max(x, y);
        System.out.println("The larger value is: " + max);

    }
}