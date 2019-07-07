package lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SimpleLambdas {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("dog1", 30, 6));
        dogs.add(new Dog("dog2", 31, 7));
        dogs.add(new Dog("dog3", 32, 8));
        dogs.add(new Dog("dog4", 33, 9));
        dogs.add(new Dog("dog5", 34, 10));
        dogs.add(new Dog("dog6", 35, 11));
        dogs.add(new Dog("dog7", 36, 12));

        System.out.println("all dogs  " + dogs);
        System.out.println("min age 7 " + minAge(dogs, 7).toString());
        System.out.println("max weight "+ maxWeight(dogs, 34).toString());

        //using
        System.out.println(dogQueries(dogs, dog -> dog.getAge() < 9));
        System.out.println("dogs max weigh " + dogQueries(dogs, dog -> dog.getWeight() > 34));
    }

    private static ArrayList<Dog> minAge(ArrayList<Dog> dogArrayList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>();
        for (Dog d: dogArrayList) {
            if (d.getAge() >= testFor) {
                result1.add(d);
            }
        }
        return result1;
    }


    private static ArrayList<Dog> maxWeight(ArrayList<Dog> dogArrayList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>();
        for (Dog d: dogArrayList) {
            if (d.getWeight() <= testFor) {
                result1.add(d);
            }
        }
        return result1;
    }

    //using lambdas
    private static ArrayList<Dog> dogQueries(ArrayList<Dog> dogArrayList, Predicate<Dog> expr) {
        ArrayList<Dog> result1 = new ArrayList<>();
        for (Dog d: dogArrayList)
            if (expr.test(d))   //key
                result1.add(d);
            return result1;
    }


}

class Dog {
    private String name;
    private int weight;
    private int age;

    Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    int getWeight() { return weight; }
    int getAge() { return age; }

    public String toString() {
        return name;
    }

}
