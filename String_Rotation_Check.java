import java.util.Scanner;

public class String_Rotation_Check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
        } else {
            String combined = str1 + str1;
            if (combined.contains(str2)) {
                System.out.println("it's a rotation");
            } else {
                System.out.println("Not a rotation");
            }
        }
    }
}
