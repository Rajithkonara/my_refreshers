package oop.polymorphism;

import oop.polymorphism.types.UrgentEventType;

public class UrgentEvent extends AbstractEvent<UrgentEventType> {

  @Override
  protected void handleAEvent(String id, UrgentEventType event) {
    publishEvent(id);
  }
}
