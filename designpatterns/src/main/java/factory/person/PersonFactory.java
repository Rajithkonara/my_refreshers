package factory.person;

public class PersonFactory {

    public static Person getPerson(String type) {

        Person person = null;

        if ("male".equals(type)) {
            person = new Male();
        } else if ("female".equals(type)) {
            person = new FeMale();
        }

        return person;
    }
}
