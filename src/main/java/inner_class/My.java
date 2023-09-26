package inner_class;

abstract class My {
    abstract public void show();
}

class OuterAbs {
    public void display() {
        My m = new My() {
            @Override
            public void show() {
                System.out.println("Hello");
            }
        };
        m.show();
    }
}