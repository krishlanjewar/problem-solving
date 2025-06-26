import java.util.Scanner;
public class countReversSum {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a long number ");
        long num = ss.nextLong();
        int count = 0 ;
        long rev = 0 ;
        long sum = 0 ;

        while (num > 0 ) {
            long rem = num % 10 ;
            rev =  rev* 10  + rem ;
            sum = sum + rem ;
            count ++ ;
            num /= 10 ;
            }
            System.out.println("count of digit : "+ count );
            System.out.println("revers of num :" + rev );
            System.out.println("sum of digit :" + sum );
    }
}
