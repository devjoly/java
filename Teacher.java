class Teacher {
  String Name;
  int age;
  double id;
  Teacher(String Name,int age,double id)  {
    this.Name=Name;
    this.age=age;
    this.id=id;
  }
    void showdetails(){
        System.out.println("teacher Name:"+Name);
        System.out.println("Teacher Age:"+age);
        System.out.println("teacher id:"+id);
    }
    public static void main(String[] args) {
        Teacher t1=new Teacher(" joly",20, 71);
        t1.showdetails();
    }
}
