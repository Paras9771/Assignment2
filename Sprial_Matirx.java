import java.util.Scanner;

public class Sprial_Matirx {
    public static void Sprial_Matrix(int arr[][], int r, int c){
        int toprow = 0;
        int bottomrom = r-1;
        int leftcolumn = 0;
        int rightcolumn = c-1;
        int totalElement = 0;
        int element = r*c;
        while (totalElement<=element) {
            for (int j = leftcolumn; j <= rightcolumn && totalElement<element ; j++) {
                System.out.print(arr[toprow][j]+" ");
                totalElement++;
            }
            toprow++;

            for (int i = toprow; i <= bottomrom && totalElement<element; i++) {
                System.out.print(arr[i][rightcolumn]+" ");
                totalElement++;
            }
            rightcolumn--;

            for (int j = rightcolumn; j >= leftcolumn && totalElement<element; j--) {
                System.out.print(arr[bottomrom][j]+" ");
                totalElement++;
            }
            bottomrom--;

            for (int i = bottomrom; i >= toprow && totalElement<element; i--) {
                System.out.print(arr[i][leftcolumn]+" ");
                totalElement++;
            }
            leftcolumn++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix");
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column");
        int c = sc.nextInt();
        System.out.println("Enter the "+r*c+" element ");
        int ans[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print Sprial Matrix");
        Sprial_Matrix(ans,r,c);
    }
}
