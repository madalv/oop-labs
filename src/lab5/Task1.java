package lab5;

public class Task1 {
    public static void main(String[] args) {

        String s = "a!";

        A a1 = new A(s, new X("i have a goddamn fever"));
        B b1 = new B(s, new X("this is just inhumane"));
        C c1 = new C(s, new X("i wanna sleep"));
        D d1 = new D(s, new X("how many more of these are there"));
        E e1 = new E(s, new X("come on man"));
        F f1 = new F(s, new X("put me out of my misery pls"));
        G g1 = new G(s, new X("i give up"));
        H h1 = new H(s, new X("hhh"));
        I i1 = new I(s, new X("iii"));
        J j1 = new J(s, new X("jjj"));

        Object[] letters = new Object[] {a1, b1, c1, d1, e1, f1, g1, h1, i1, j1};

        for (Object object : letters) {
            System.out.println(object.toString());
        }

    }
}
