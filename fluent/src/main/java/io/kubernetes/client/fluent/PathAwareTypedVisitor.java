package io.kubernetes.client.fluent;

import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.Boolean;
public class PathAwareTypedVisitor<V,P> extends TypedVisitor<V>{
  PathAwareTypedVisitor() {
    List<Class> args = Visitors.getTypeArguments(PathAwareTypedVisitor.class, getClass());
    if (args == null || args.isEmpty()) {
      throw new IllegalStateException("Could not determine type arguments for path aware typed visitor.");
    }
    this.type = (Class<V>) args.get(0);
    this.parentType = (Class<P>) args.get(1);
  }
  private final Class<V> type;
  private final java.lang.Class<P> parentType;
  public void visit(V element) {
    
  }
  public void visit(List<Object> path,V element) {
    
  }
  public <F>Boolean canVisit(F target) {
    if (target == null) {
      return false;
    }
    if (getType() == null) {
      return false;
    } else if (!getType().isAssignableFrom(target.getClass())) {
      return false;
    }
    return true;
  }
  public P getParent(java.util.List<java.lang.Object> path) {
    return path.size() - 1 >= 0 ? (P) path.get(path.size() - 1) : null;
  }
  public java.lang.Class<P> getParentType() {
    return parentType;
  }
  
}