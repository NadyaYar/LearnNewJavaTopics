package lamda.ex3;

public class LambdaDemo {

    public LambdaDemo(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        MyLambdaI my = String::compareTo;
        System.out.println(my.display("hello","hello"));
    }
}
