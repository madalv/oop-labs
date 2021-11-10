package lab5;

public class C extends B{
    protected String c;

    C (String s, X x) {
        super(s, x);
        this.c = "c!";
    }

    @Override
    public String toString() {
        return super.toString() +
                "c = " + c + "\n" +
                "c.x = " + x.toString() + "\n";
    }
}
