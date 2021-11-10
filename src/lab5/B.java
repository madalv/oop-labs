package lab5;

public class B extends A{
    protected String b;

    B(String s, X x) {
        super(s, x);
        this.b = "b!";
    }

    @Override
    public String toString() {
        return super.toString() +
                "b = " + b + "\n" +
                "b.x = " + x.toString() + "\n";
    }
}
