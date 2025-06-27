public class maxElement {

    public static void main(String[] args) {
        int[] arr = { 1 ,3, 5, 5, 6, 8,5};
        int max = arr[0];
       
        for (int index = 0; index < arr.length; index++) {

            if (max < arr[index]) {
                max = arr[index];
            }
        }
        System.out.println("max element " + max );
    }
}