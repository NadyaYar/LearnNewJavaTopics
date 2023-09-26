package inner_class;
public class OuterLocal {

    public void display() {

        class Inner {

            public void show() {
                System.out.println("Hello");
            }
        }
        new Inner().show();
    }
}
