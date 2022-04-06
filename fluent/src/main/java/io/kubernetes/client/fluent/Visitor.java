package io.kubernetes.client.fluent;

import java.lang.Class;
import java.lang.FunctionalInterface;
import java.lang.Object;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.Boolean;
  @FunctionalInterface
  public interface Visitor<T>{
  default Class<T> getType() {
    List<Class> args = Visitors.getTypeArguments(Visitor.class, getClass());
    if (args == null || args.isEmpty()) {
      return null;
    }
    return (Class<T>) args.get(0);
  }
  void visit(T element);
  default int order() {
    return 0;
  }
  default void visit(List<Object> path,T element) {
    visit(element);
  }
  default <F>Boolean canVisit(F target) {
    if (target == null) {
      return false;
    }

    if (getType() == null) {
      return hasVisitMethodMatching(target);
    } else if (!getType().isAssignableFrom(target.getClass())) {
      return false;
    }
    return true;
  }
  default <F>java.lang.Boolean hasVisitMethodMatching(F target) {
    for (Method method : getClass().getMethods()) {
      if (!method.getName().equals("visit") || method.getParameterTypes().length != 1) {
        continue;
      }
      Class<?> visitorType = method.getParameterTypes()[0];
      if (visitorType.isAssignableFrom(target.getClass())) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }
  
}