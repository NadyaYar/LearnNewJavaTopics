package lamda.ex2;

public class Demo {

    int temp = 10;
    public void method1() {

        MyLambdaEx2 m = () -> {
            System.out.println("Hi");
            System.out.println("Bye" + ++temp);
        };
        m.display();
    }
}
