import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = ss.nextInt();
        int flag = 0 ;
    
        for (int i= 1 ; i < num/2 ; i++ ) {
        if (num%i==0) {
            flag ++ ;
            System.out.println(i);
        }        
    }

    if (flag<1) {
        System.out.println("prime");    
    } else {
        System.out.println("not prime");
    }
ss.close();
    }

}
