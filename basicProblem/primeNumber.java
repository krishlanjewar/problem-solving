import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = ss.nextInt();
        int count = 0 ;
    if (num==1 || num == 0  ) {
        System.out.println(num +" is nor composite nor prime ");
    }
    else if (num<0) {
        System.out.println("enter positive number ");
    }
    else {
        for (int i= 2 ; i <= Math.sqrt(num) ; i++ ) {
        if (num%i==0) {
            count ++ ;
            break;
        }  
      }      
    }
    if (count<1) {
        System.out.println("prime");    
    } else {
        System.out.println("not prime");
    }
ss.close();
    }

}
