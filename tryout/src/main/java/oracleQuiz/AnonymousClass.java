package oracleQuiz;

class Handler {
    public void handle() {
        System.out.print("Standalone");
    }
}

public class AnonymousClass {

    public static void main(String[] args) {
        new AnonymousClass().doIt(new Handler() {
            public void process() {
                System.out.print("Inner");
            }
        });
    }

    public void doIt(Handler h) {
        h.handle();
    }

}
