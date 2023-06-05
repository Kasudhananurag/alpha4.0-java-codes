import java.util.*;
// import java.Math.*;
public class primesinrange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void  primesInRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit of the range : ");
        int range = sc.nextInt();
        primesInRange(range);
    }

}
