import java.util.*;

public class array_one {
    public static void main(String[] args) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("sub1 = "+marks[0]+" sub2 = "+marks[1]+" sub3 = "+marks[2]);
    }
}
