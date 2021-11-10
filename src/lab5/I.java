package lab5;

public class I extends H {
    protected String i;

    I (String s, X x) {
        super(s, x);
        this.i = "i!";
    }

    @Override
    public String toString() {
        return super.toString() + //ive been a moroooooooooon
                "i = " + i + '\n' +"";
                //"i.x = " + x.toString() + "\n";

    }
}
