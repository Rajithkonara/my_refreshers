package factory.person;

public class FeMale implements Person {

    @Override
    public void wish(String mgs) {
        System.out.println(mgs);
    }
}
