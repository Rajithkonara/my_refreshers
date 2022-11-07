package techtalks.patternrevisited.lazy;

interface Pet {
}

interface Person {
    Pet getPet();

    default void play() {
        System.out.println("playing with " + getPet());
    }
}

class Dog implements Pet {
}

class Cat implements Pet {
}

class DogPerson implements Person {
    private Dog dog = new Dog();

    public Pet getPet() {
        return dog;
    }
}

class CatLover implements Person {
    private Cat cat = new Cat();

    public Pet getPet() {
        return cat;
    }
}

public class One {

    public static void call(Person person) {
        person.play();
    }

    public static void main(String[] args) {
        call(new DogPerson());
        call(new CatLover());
    }
}