public class Varargs{
    public static void main(String []args){ 
        System.out.println(add(1,2));
         System.out.println(add(9,6,19));
          System.out.println(add(15));
    }
   static int add(int ...k){
        int sum=0;
      for(int i:k) sum+=i;
     return sum;
    }
}