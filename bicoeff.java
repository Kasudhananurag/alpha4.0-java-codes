import java.util.*;
public class bicoeff {
    public static void bico(int a, int b){
        int n_fact = fact(a);
        int r_fact = fact(b);
        int nminusr_fact = fact(a-b);
        int bc = n_fact/(r_fact*nminusr_fact);
        System.out.println("Binomial coeffecient = "+bc);
    }
    public static int fact(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int r = sc.nextInt();

        bico(n, r);
    }
}
