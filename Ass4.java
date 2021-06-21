class Ass4{
  public static void main(String []args){
    int a=4,b=8,c=2;
    System.out.println(max(c,max(a,b)));
}
static int max(int a,int b){
   int k=a;
   (k<b)&&(k=b);
   return k;
}
}
