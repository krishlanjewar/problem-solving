public class SumSquareDifference {
    public static void main(String[] args) {
        int sum =0 ;
        int sqSum= 0 ;
        for (int i = 0; i <=100;i++) {
            sum += i;
            sqSum= sqSum +(i*i);
        }
        System.out.println((sum*sum) - sqSum );
    }
}
