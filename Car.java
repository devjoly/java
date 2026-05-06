public class Car {
    String brand;
    Car(String brand){
       this.brand = brand;

    }
    void showBrand(){
    System.out.println(brand);
    }
     public static void main(String[] args) {
    Car jo = new Car ("bmw");
    jo.showBrand();
    }
}
