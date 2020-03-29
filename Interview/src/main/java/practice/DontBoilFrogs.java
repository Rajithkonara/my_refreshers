package practice;

interface FrogBoilable {
    static int getCtoF(int cTemp) {
        return (cTemp * 9 / 5) + 32;
    }

    default String hop() {
        return "hopping";
    }
}


public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go() {
        System.out.print(hop());   //correct
        //System.out.println(getCtoF(100));  //wrong
        System.out.println(FrogBoilable.getCtoF(100)); //correct
        DontBoilFrogs dfb = new DontBoilFrogs();
        //System.out.println(dfb.getCtoF());  //wrong cannot create
    }
}
