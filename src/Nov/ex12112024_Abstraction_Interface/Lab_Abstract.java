package Nov.ex12112024_Abstraction_Interface;

public class Lab_Abstract {

}
abstract class loan{
    abstract void loan50k();

    void loan(){
        System.out.println("1l loan is there");
    }



}
class Self extends loan{


    @Override
    void loan50k() {
        System.out.println("Loan");
    }
}