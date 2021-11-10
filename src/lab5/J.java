package lab5;

public class J extends I {
    protected String j;

    J (String s, X x) {
        super(s, x);
        this.j = "j!";
    }


    @Override
    public String toString() {
        return "J!!! \n" + super.toString() + //ive been a moroooooooooon
                "j = " + j + '\n'+ "";
                //"j.x = " + x.toString() + "\n";
    }
}
