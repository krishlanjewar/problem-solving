public class Divisor {
    public static void main(String[] args) {
        int num =36 ;
        for (int index = 1; index <= Math.sqrt(num); index++) {
            if (num%index==0) {
                System.out.println(index);
                if (index != num/index) {
                     System.out.println(num/index);
                }
            }
        }
    }
}
