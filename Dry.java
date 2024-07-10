class A {
    static int x = 100;
    int y;

    A() {
        x++;
    }

    void getint() {
        y = 3;
    }

    void show() {
        System.out.println(x+"\t\t" + y);
    }
}
public class Dry {
    public static void main(String[] args) {
        A[] ob = new A[50];
        System.out.println("\n\n");
        for (int i = 0; i < 5; ++i) {
            ob[i] = new A();
            ob[i].getint();
            ob[i].y = 300;
        }
        for (int i = 0; i < 5; ++i) {
            ob[i].show();
        }
    }
}
