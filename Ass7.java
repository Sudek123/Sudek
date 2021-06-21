class Customer{

  int age;
  String name;
  static String city;
  final  int maxlimit=50000;
  Customer(){
   this.age=45;
   this.name="Manager";
  }
  Customer(int a,String str){
   this.age=a;
   this.name=str;
  }
  static void setcity(String cityname){ 
       city=cityname;
   }
  void getcustomerinfo(){
     System.out.print(this.age+" ");
     System.out.print(this.name+" ");
     System.out.print(this.city+" ");
     System.out.print(this.maxlimit+" ");
  }
  

}

class Ass7{
  public static void main(String []args){
     Customer c1=new Customer();
     Customer c2=new Customer(22,"Sudek");
     Customer.setcity("Hyderabad");
     c1.getcustomerinfo();
     c2.getcustomerinfo();
}
}