package Practices.SuperKeyword;










public class Lab001_Super_Prac {
    public static void main(String args[]){
        Twowheeler tw = new Twowheeler();



    }
}

class Vechicle {
    Vechicle(){
        System.out.println("Vehicle kkkClass");

    }
void display_vechile1(){
    System.out.println("Vechicle method Class");

}
void display_vechile2(int a){
    System.out.println("Vechicle "+ a +" speed Class");

}

}
class Car extends Vechicle{
   Car(){
       System.out.println("Hello");
   }

    void display_car1(){
        System.out.println("car Class");

    }
    void display_car2(int a){
        System.out.println("car "+ a +" speed Class");

    }
}
class Twowheeler extends Car{

    Twowheeler(){

        super();
        super.display_vechile1();
        super.display_vechile2(10);

        super.display_car1();
        super.display_car2(20);

        this.Result();



    }

   void Result(){
        System.out.println("Twowheeler Class");

    }

}