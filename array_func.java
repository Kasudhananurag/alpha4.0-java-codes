import java.util.*;

public class array_one {

    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {

        int marks[] = {97,95,99};
        System.out.println("array before updation");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        update(marks);
        System.out.println("array after updation");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
