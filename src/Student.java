public class Student {
    public String name;
    public String surname;
    public String nick;
    public String email;
    public int indexNo;

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
}
