import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a number ;");
        int num = ss.nextInt();
        int tem = num ;
        int tem2 = num;
        int count = 0;
        while (num>0) {
             num /= 10;
            count++ ;
        }
        int digit = 0 ;
        while (tem>0) {
            int remainder =tem % 10 ;
            digit = digit + (int) ( Math.pow(remainder ,count ));
            // why  (int) ??
            tem /= 10 ;
        }
        if (tem2 == digit) {
            System.out.println("armstrong");
        } else {
            System.out.println("not  amstrong");
        }
    }
}
