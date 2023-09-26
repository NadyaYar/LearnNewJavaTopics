package thread.producer_consumer.practise;

public class Demo {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s = new Student("1. John",wb);
        Student s1 = new Student("2. Olha",wb);
        Student s2 = new Student("3. Olena",wb);
        Student s3 = new Student("4. Alex",wb);

        t.start();

        s.start();
        s1.start();
        s2.start();
        s3.start();

        System.out.println("Hello");
    }
}
