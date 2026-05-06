class Baby {
    String name;
    int age;
    Baby(String j,int z){
        name=j;
        age=z;
    }
void display(){
    System.out.println("Name:"+ name);
    System.out.println("Age:"+ age);
}
  public static void main(String[] args) {
    Baby b1=new Baby("joly",111);
    Baby b2=new Baby("poiy",222);
    b1.display();
    b2.display();
  }  
}