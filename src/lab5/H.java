package lab5;

public class H extends G {
    protected String h;
    protected X x = new X("im confused as hell");

    H (String s, X x) {
        super(s, x);
        this.h = "h!";
    }

    @Override
    public String toString() {
        return super.toString() + //ive been a moroooooooooon
                "h = " + h + '\n' +
                "h.x = " + x.toString() + "\n";
    }
}
