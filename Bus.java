public class Bus {  
    String house;
    Bus(String house){
    this.house=house;

    }
    void showhouse(){
    System.out.println(house);

    }
    public static void main(String[] args) {
        Bus j1 = new  Bus("baby");
        j1.showhouse();
    }
    }