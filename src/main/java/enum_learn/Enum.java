package enum_learn;

public enum Enum{
    CS,IT,ECE;

    private Enum(){
        System.out.println(this.name());
    }

    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }
}
