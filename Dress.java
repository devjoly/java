public class Dress {
    String brand;
    String color;
   Dress(String brand,String color){
this.brand = brand;
this.color = color;
    }
    void showDetails(){
        System.out.println(brand);
      System.out.println(color);
}
public static void main(String[] args) {
    Dress d1 =  new Dress ("Sari","Red");
    Dress d2 = new Dress ("Sari","Red");

d1.showDetails();
d2.showDetails();
}
}

