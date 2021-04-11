package oop.polymorphism;

import oop.polymorphism.types.NormalEventType;

public class NormalEvent extends AbstractEvent<NormalEventType> {


  @Override
  protected void handleAEvent(String id, NormalEventType event) {
    publishEvent(id);
  }
}
