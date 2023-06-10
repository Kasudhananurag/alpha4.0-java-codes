import java.util.*;
public class patterns {
    public static void hollow_Rectangle(int row, int col){
        for(int i = 1; i<=row;i++){
            for(int j = 1;j<=col;j++){
                if(i==1||i==row||j==1||j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void invertedRotatedPyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j= 1; j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidStars(int row){
        for(int i=1;i<=row;i++){
            for(int j= 1; j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 2;j<=i;j++){ // can also use int j = 1;j<i;j++
                System.out.print("*");
            }
            System.out.println();
        }
    }  
    
    public static void invertedHalfPyramidNumbers(int row){
        for(int i = row;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int row){
        int counter = 1;
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int row){
        int count = 1;
        for(int i = 1; i<= row; i++){
            for(int j = 1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
        }
    }

    public static void butterfly(int row){
        for(int i = 1;i<=row;i++){
                //stars - i
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces - 2*(row-i)
                for(int j = 1;j<=2*(row-i);j++){
                    System.out.print(" ");
                }
                //stars - i
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
        }
        for(int i = row;i>=1;i--){
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(row-i)
            for(int j = 1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }

    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        row = sc.nextInt();
        col = sc.nextInt();
        // hollow_Rectangle(row,col);
        // System.out.println();
        // invertedRotatedPyramid(row);
        // System.out.println();
        // pyramidStars(row);
        // System.out.println();
        // invertedHalfPyramidNumbers(row);
        // System.out.println();
        // floydTriangle(row);
        // zero_one_triangle(row);
        butterfly(row);
    }

}
