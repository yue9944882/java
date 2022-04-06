package io.kubernetes.client.fluent;

import java.lang.Class;
import java.lang.Object;
import java.util.List;
public interface Visitable<T>{
  default <V>T accept(Class<V> type,Visitor<V> visitor) {
    return accept(new Visitor<V>() {
      @Override
      public Class<V> getType() {
        return type;
      }

      @Override
      public void visit(V element) {
        visitor.visit(element);
      }
    });
  }
  default T accept(io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(this)) {
        visitor.visit(this);
      }
    }
    return getTarget(this);
  }
  default T accept(List<Object> path,io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(this)) {
        visitor.visit(path, this);
      }
    }
    return getTarget(this);
  }
  default T getTarget(Visitable<T> visitable) {
    return (T) visitable;
  }
  
}