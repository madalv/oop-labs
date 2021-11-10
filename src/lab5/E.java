package lab5;

public class E extends D {
    protected String e;

    E (String s, X x) {
        super(s, x);
        this.e = "e!";
    }

    @Override
    public String toString() {
        return super.toString() + //ive been a moroooooooooon
                "e = " + e + '\n' +
                "e.x = " + x.toString() + "\n";
    }
}
