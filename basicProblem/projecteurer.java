public class projecteurer {
    public static void main(String[] args) {
       
 
      
        for(int j=1;j<999990000;j++){
              int count= 0;
           for (int i=1 ; i<=20 ;i++) {          
            if (j%i==0) {                
                count++;
            }
        
            if(count==20){
                System.out.println(j);
                break;
            }
           
        }
   if(count==20){
                System.out.println(j);
                break;
        }
    }
}
}
