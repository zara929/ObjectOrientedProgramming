import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //doLogin();
        LoginModel loginModel = new LoginModel();

        //we can make more simple code and you can copy LoginModel to your android application
        loginModel.doLoginInfinite();
    }

    //what do you want to make project?
    //user can find hotel
    //good place for traveling
    //recomended hotel , how to use transportation and good food

    // 1. you should make "Object"
    // try to make evething object
    // what is object? its kind of noun
    // User, Hotel, Restanraut, TransPortation, Food, Login
    //

    // 2. you should make some element and fuction
    // User : name, age, mobile
    // Hotel: name, address, ..
    // Restanraut

    // 3. try to make some senario
    // we make login senario
    // 1. user enter app
    // 2. checking is user loggin
    // 3. user input id and password
    // 4. checking validate
    // 5. checking database exist user
    // 6. finish

    //now we make login function
    // try to make Object
    // element: password, id
    // Object: LoginModel

    public static class LoginModel {
        String id;
        String password;

        public void setId(String id) {
            this.id = id;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        //checking validate
        boolean validate() {
            //check validate
            if (id.length() <= 0) {
                System.out.println("error empty id");
                return false;
            }

            if (id.length() <= 0) {
                System.out.println("error empty password");
                return false;
            }
            return true;
        }


        public void askId() {
            Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성

            System.out.println("please input id");

            id = scan.nextLine();            // 키보드 문자 입력

            System.out.println("your input: \"" + id + "\"");
        }

        public void askPassword() {
            Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성

            System.out.println("please input password");

            password = scan.nextLine();            // 키보드 문자 입력

            System.out.println("your input: \"" + password + "\"");
        }



        public void doLoginInfinite() {
            askId();
            askPassword();
            if(!validate()){
                doLoginInfinite();
            }
        }
    }

    public void doLogin(String id, String password) {

    }


    //first i will make some wrong programming

    void function() {
        // first user enter this app
        // what user can do in main?

        //login()

        int chooseBtn = 0;
        switch (chooseBtn) {
            case 0:
                //searching()
                //Food hotel amunsement park rute bus maps about jkt
                //goRestaurnt()
                //goHotel()
                //goamunsement()
                //goBus()
                //goMaps()
                break;
        }

        // if he choose goRestanrt()
        // loadRestanrantData
        // php is server side langauge
        // php myadmin tools use control DBMS
        // DATABASE MANAGEMENT SYSTEM : mysql(paid) mariadb(free) oracle(expensive)
        // datas = loadRestanrantData();
        // setting your userInterface the datas
        // maybe the program line 1000++
        // it will be spagtti code
        // you cannot fix
        // when occur bug you cannot find the bug
        // because so complex
    }

    //you should make small code evething
    //dont over 50line code


}
