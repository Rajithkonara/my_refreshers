package oop.polymorphism;

public abstract class AbstractEvent<T> implements EventType<T> {

  @Override
  public void event(String id, T event) {

    System.out.print("Executing the " + id + " event ..  " + event);

    Class<?> enclosingClass = getClass().getEnclosingClass();
    if (enclosingClass != null) {
      System.out.println(enclosingClass.getName());
    } else {
      System.out.println(getClass().getName());
    }

    handleAEvent(getClass().getName(), event);

  }


  protected abstract void handleAEvent(String id, T event);

  protected final void publishEvent(String id) {
    System.out.print("executing the handleAEvent :  " + id);
  }


}
