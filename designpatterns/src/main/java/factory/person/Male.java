package factory.person;

public class Male implements Person {

    @Override
    public void wish(String mgs) {
        System.out.println(mgs);
    }
}
