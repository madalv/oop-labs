package lab5;

public class G extends F {
    protected String g;

    G (String s, X x) {
        super(s, x);
        this.g = "g!";
    }

    @Override
    public String toString() {
        return super.toString() + //ive been a moroooooooooon
                "g = " + g + '\n' +
                "g.x = " + x.toString() + "\n";
    }
}
