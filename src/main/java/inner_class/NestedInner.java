package inner_class;

public class NestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();

    }
}
