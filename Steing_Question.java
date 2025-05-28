import java.util.Locale;
import java.util.Scanner;

public class Steing_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().toLowerCase();
        String revesed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revesed = revesed + str.charAt(i);
        }
        if (str.equals(revesed)) {
            System.out.println("String are pailndrome");
        } else {
            System.out.println("String are not pailndrome");
        }
    }
}
