package singelton;

public class Main {
    public static void main(String[] args) {
        Singleton.addSugar(12f);

       Singleton  s1 =  Singleton.getInstance();
       Singleton s2 = Singleton.getInstance();
       
        System.out.println(s1 + " " + s2);
    }
}
