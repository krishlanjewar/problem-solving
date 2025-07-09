public class palindrom {
  public static void main(String[] args) {
    long a ;
    long remainder= 0 ;
    long newnum =0;
     long max = Integer.MIN_VALUE;
    
    for (long i = 100; i < 999 ; i++) {
        for (long j = 100; j < 999 ; j++) {
            a =i*j; 
            long oldnum = a;
            newnum = 0;
            while (a>0) {
             remainder = a % 10 ;
             newnum = newnum * 10 + remainder ;
                a /= 10;
            }
            if(oldnum==newnum){
            if(max < newnum){
                  max = newnum;
             }
            }
            }
         }
     System.out.println(max);
     }  
  }
