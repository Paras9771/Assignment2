import java.util.Arrays;

public class Boat_Question {
    public static int Maxinumpeople(int people[], int limit) {
        int boatcount = 0;
        int left = 0;
        int right = people.length-1;
        while (left<=right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            boatcount++;
        }
        return boatcount;
    }
    public static void main(String[] args) {
        int people[] = {1,2,2,3};
        Arrays.sort(people);
        int ans = Maxinumpeople(people,3);
        System.out.println(ans);
    }
}
