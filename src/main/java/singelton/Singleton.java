package singelton;

public class Singleton {
    private static Singleton instance = null;

    private float sugar;
    private float coffee;
    private float water;

    private Singleton() {
        sugar = 0.01f;
        coffee = 0.02f;
        water = 0.5f;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void addSugar(float s) {
        System.out.println("Sugar: " + s + " was add");
    }
}
