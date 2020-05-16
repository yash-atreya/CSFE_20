import java.util.Scanner;
public class PalindromCheck {
    public static void main(String[] args) {
        String initialString;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter String :");

        initialString = myScanner.nextLine();

        String str = initialString.toLowerCase();

        char[] hexCharArray = str.toCharArray();

        int i = 0, j = hexCharArray.length - 1;
        int isPalindrom = 1;
        while(i < j) {
            if(hexCharArray[i] != hexCharArray[j]) {
                isPalindrom = 0;
                System.out.println("Not palindrome");
                break;
            }
            i++;
            j--;
        }

        if(isPalindrom == 1) {
            System.out.println("The String " + initialString + " is a palindrome");
        }

    }
}