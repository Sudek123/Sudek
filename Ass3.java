class Ass3{
public static void main(String []args){
for(int i=1;i<=100;i++){
  if(i%2==0) System.out.print(i+" ");
}
System.out.println();


int i=1;
while(i<=100){
if(i%2!=0) System.out.print(i+" ");
i++;
}
System.out.println();


String str="yellow";
switch(str){
case red:System.out.println("Strawberry");
break;
case yellow:System.out.println("Banana");
break;
case black:System.out.println("Blackgrapes");
break;
case green:System.out.println("Greengrapes");
break;
default:System.out.println("Notknown");
}


int i=0;
do{
System.out.print("Hello"+" ");i++;
}
while(i<5);

}
}