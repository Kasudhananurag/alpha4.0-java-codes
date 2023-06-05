import java.util.*;
public class binarytodecimal {
    public static void binaryToDecimal(int biNum){
        int pow = 0;
        int deciNum = 0;
        while(biNum>0){
            int lastDigitOfBiNum = biNum % 10;
            deciNum = deciNum+(lastDigitOfBiNum*(int)Math.pow(2,pow));
            pow++;
            biNum/=10;
        }
        System.out.println("Decimal of given binary = "+deciNum);
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number to convert it to decimal(in forms of 0 and 1)");
        int binum = sc.nextInt();
        binaryToDecimal(binum);
    }
}
