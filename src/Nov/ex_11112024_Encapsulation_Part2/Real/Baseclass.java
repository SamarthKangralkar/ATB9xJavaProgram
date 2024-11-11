package Nov.ex_11112024_Encapsulation_Part2.Real;

public class Baseclass {


    private  String browser ;

    Baseclass(){
        System.out.println("DD_BaseClass");
    }

    Baseclass(String b){
        System.out.println("CC_BaseClass");

    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {

        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

        void openBrowser() {
            System.out.println("Opening Browser");
        }
        void closeBrowser() {
            System.out.println("Closing Browser");
        }


    }

