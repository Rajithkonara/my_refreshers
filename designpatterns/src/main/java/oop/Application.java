package oop;

import oop.polymorphism.EventType;
import oop.polymorphism.NormalEvent;
import oop.polymorphism.UrgentEvent;
import oop.polymorphism.types.NormalEventType;
import oop.polymorphism.types.UrgentEventType;

public class Application {

  public static void main(String[] args) {

//    EventType<NormalEventType> eventType = new NormalEvent();

    EventType<UrgentEventType> eventType = new UrgentEvent();

    NormalEventType normalEventType = new NormalEventType();
    normalEventType.setEvent("A event");
    normalEventType.setId("001");

    UrgentEventType urgentEventType = new UrgentEventType();
    urgentEventType.setEvent("B Evetn");
    urgentEventType.setId("002");

//    eventType.event("1",  normalEventType);
    eventType.event("2",  urgentEventType);

  }

}

