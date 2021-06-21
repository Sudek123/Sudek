public class Ass1{
    public static void main(String []args){
          int a=5,b=8;
          add(a,b);
          subtract(a,b);
          multiply(a,b);
          divide(a,b);
     }
    static void add(int a,int b){
       System.out.println(a+b);
    }
    static void subtract(int a,int b){
       System.out.println(a-b);
    }
    static void multiply(int a,int b){
       System.out.println(a*b);
    }
    static void divide(int a,int b){
       System.out.println(Math.max(a,b)/Math.min(a,b));
    }
}