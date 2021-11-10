package lab5;

public class A {
    protected String a;
    protected X x = new X("i want to dieeeeeeeee"); // well. its redundant. it does not

    A(String s, X x) {
        a = s;
        this.x = x;
    }


    @Override
    public String toString() {
        return "a = " + a + "\n" +
                "a.x = " + x.toString() + "\n";
    }
}
