package lab5;

public class D extends C{
    protected String d;
    protected X x = new X("just kill me"); // so the toString function takes the 'closer' value

    D (String s, X x) {
        super(s, x);
        this.d = "d!";
    }

    @Override
    public String toString() {
        return super.toString() +
                "d = " + d + "\n" +
                "d.x = " + x.toString() + "\n";
    }
}
