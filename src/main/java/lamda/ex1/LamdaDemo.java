package lamda.ex1;

public class LamdaDemo {
    public static void main(String[] args) {
     MyLamda m = (a,b) -> a + b;
        System.out.println(m.add(12,34));
    }
}

