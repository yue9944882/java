package io.kubernetes.client.fluent;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.ArrayList;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class BaseFluent<F extends Fluent<F>> implements io.kubernetes.client.fluent.Fluent<F>,Visitable<F>{
  public static final String VISIT = "visit";
  public final VisitableMap _visitables = new VisitableMap();
  public static <T>VisitableBuilder<T,?> builderOf(T item) {
    if (item instanceof Editable) {
      Object editor = ((Editable) item).edit();
      if (editor instanceof VisitableBuilder) {
        return (VisitableBuilder<T, ?>) editor;
      }
    }

    try {
      return (VisitableBuilder<T, ?>) Class.forName(item.getClass().getName() + "Builder").getConstructor(item.getClass())
          .newInstance(item);
    } catch (Exception e) {
      throw new IllegalStateException("Failed to create builder for: " + item.getClass(), e);
    }
  }
  public static <T>List<T> build(java.util.List<? extends io.kubernetes.client.fluent.Builder<? extends T>> list) {
    return list == null ? null : new ArrayList<T>(list.stream().map(Builder::build).collect(Collectors.toList()));
  }
  public static <T>java.util.List<T> build(Set<? extends io.kubernetes.client.fluent.Builder<? extends T>> set) {
    return set == null ? null : new ArrayList<T>(set.stream().map(Builder::build).collect(Collectors.toList()));
  }
  public static <T>java.util.List<T> aggregate(java.util.List<? extends T>... lists) {
    return new ArrayList(Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
  }
  public static <T>java.util.Set<T> aggregate(java.util.Set<? extends T>... sets) {
    return new LinkedHashSet(Arrays.stream(sets).filter(Objects::nonNull).collect(Collectors.toSet()));
  }
  public F accept(Visitor... visitors) {
    return accept(Collections.emptyList(), visitors);
  }
  public <V>F accept(Class<V> type,io.kubernetes.client.fluent.Visitor<V> visitor) {
    return accept(Collections.emptyList(), new Visitor<V>() {
      @Override
      public Class<V> getType() {
        return type;
      }

      @Override
      public void visit(List<Object> path, V element) {
        visitor.visit(path, element);
      }

      @Override
      public void visit(V element) {
        visitor.visit(element);
      }
    });
  }
  public F accept(java.util.List<Object> path,io.kubernetes.client.fluent.Visitor... visitors) {
    Arrays.stream(visitors)
        .map(v -> VisitorListener.wrap(v))
        .filter(v -> ((Visitor) v).canVisit(this)).sorted((l, r) -> ((Visitor) r).order() - ((Visitor) l).order())
        .forEach(v -> {
          ((Visitor) v).visit(path, this);
        });

    List<Object> copyOfPath = path != null ? new ArrayList(path) : new ArrayList<>();
    copyOfPath.add(this);
    List<Object> newPath = Collections.unmodifiableList(copyOfPath);

    for (Visitable visitable : _visitables) {
      Arrays.stream(visitors).filter(v -> v.getType() != null && v.getType().isAssignableFrom(visitable.getClass()))
          .forEach(v -> visitable.accept(newPath, v));
      Arrays.stream(visitors).filter(v -> v.getType() == null || !v.getType().isAssignableFrom(visitable.getClass()))
          .forEach(v -> visitable.accept(newPath, v));
    }
    return (F) this;
  }
  
}