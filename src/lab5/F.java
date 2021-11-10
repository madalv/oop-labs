package lab5;

public class F extends E{
    protected String f;

    F (String s, X x) {
        super(s, x);
        this.f = "f!";
    }

    @Override
    public String toString() {
        return super.toString() + //ive been a moroooooooooon
                "f = " + f + '\n' +
                "f.x = " + x.toString() + "\n";
    }
}
