package oop.polymorphism;

public interface EventType<T> {

  void event(String id, T event);

}
