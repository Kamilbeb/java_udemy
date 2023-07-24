public class Student {
    public String name;
    public String surname;
    public String nick;
    public String email;
    public int indexNo;
    public static String nazwaUczelni = "AGH";


    public void introduceYour(){
        System.out.println("My names: "+name+" "+surname);
    }
    public void logIn(){
        System.out.println("I log in with: "+nick);
    }
    public void enterTheIndexNumber(){
        System.out.println("My index number: "+indexNo);
    }
    public  void enterEmail(){
        System.out.println("My email: "+email);
    }

    public  static  void infoUczelnia(){    //metoda statyczna
        System.out.println("Moja uczelnia to AGH");
    }
}
