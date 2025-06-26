import java.util.Scanner;
public class palindrome {  
    public static void main(String[] args){         
    Scanner ss = new Scanner(System.in);
    System.out.print("Enter num to check palindrom : ");
    int num = ss.nextInt();
    int tem = num ;
    int revDigit = 0 ;
    while (num > 0) {
        int remainder = num % 10 ;
        revDigit = revDigit*10+remainder ;
        num/=10;    
    }
    if (tem == revDigit) {
        System.out.println("It is a palindrom ");
    } else {
        System.out.println("Not a palindrom  ");
    }
    ss.close();
 }
}
