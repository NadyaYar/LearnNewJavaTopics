package loops;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
        }
    }
}
