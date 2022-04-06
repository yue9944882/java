package io.kubernetes.client.fluent;

import java.util.Collection;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Collections;
public final class VisitorWiretap<T> implements Visitor<T>{
  private VisitorWiretap(io.kubernetes.client.fluent.Visitor<T> delegate,Collection<VisitorListener> listeners) {
    this.delegate = delegate;
    this.listeners = listeners;
  }
  private final java.util.Collection<io.kubernetes.client.fluent.VisitorListener> listeners;
  private final io.kubernetes.client.fluent.Visitor<T> delegate;
  public static <T>VisitorWiretap<T> create(io.kubernetes.client.fluent.Visitor<T> visitor,java.util.Collection<io.kubernetes.client.fluent.VisitorListener> listeners) {
    if (visitor instanceof VisitorWiretap) {
      return (VisitorWiretap<T>) visitor;
    }
    return new VisitorWiretap<T>(visitor, listeners);
  }
  public Class<T> getType() {
    return delegate.getType();
  }
  public void visit(T target) {
    listeners.forEach(l -> l.beforeVisit(delegate, Collections.emptyList(), target));
    delegate.visit(target);
    listeners.forEach(l -> l.afterVisit(delegate, Collections.emptyList(), target));
  }
  public int order() {
    return delegate.order();
  }
  public void visit(List<Object> path,T target) {
    listeners.forEach(l -> l.beforeVisit(delegate, path, target));
    delegate.visit(path, target);
    listeners.forEach(l -> l.afterVisit(delegate, path, target));
  }
  public <F>Boolean canVisit(F target) {
    boolean canVisit = delegate.canVisit(target);
    listeners.forEach(l -> l.onCheck(delegate, canVisit, target));
    return canVisit;
  }
  
}