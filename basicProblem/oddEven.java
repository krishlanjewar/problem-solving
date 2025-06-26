import java.util.Scanner;
public class oddEven {

    public static void main(String[] args) {      
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a +ve number: ");
        int num = ss.nextInt();
        if(0<num){
            if (num % 2 == 0) {
                System.out.println(num + " : is  even number ");
            } 
            else{
                System.out.println(num + " : is odd number");
            }
        }
        else{
            System.out.println("Enter a +ve number");
        }

        System.out.println("odd even in series");
         System.out.print("Enter a number ; ");
         int num2 = ss.nextInt();
         for (int i=1 ; i<= num2 ; i ++){
            if (i%2 == 0) {
                System.out.println("even :"+ i );
            }
           else{
            System.out.println("odd :" + i );
           }

         }


           ss.close();
    }
}