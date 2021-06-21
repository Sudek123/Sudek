 import java.lang.*;
class Ass2{
  public static void main(String []args){
   Cls2 obj=new Cls2();
   obj.add(3,5);
   obj.subtract(8,3);
   obj.multiply(9,3);
   obj.divide(9,3);
}
}
 class Cls2{
   void add(int a,int b){System.out.print(a+b);
}
void subtract(int a,int b){System.out.print(a-b);
}
void multiply(int a,int b){System.out.print(a*b);
}
void divide(int a,int b){System.out.print(a/b);
}
}