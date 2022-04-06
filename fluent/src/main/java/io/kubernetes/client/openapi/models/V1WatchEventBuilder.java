package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1WatchEventBuilder extends V1WatchEventFluentImpl<V1WatchEventBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1WatchEvent,V1WatchEventBuilder>{
  public V1WatchEventBuilder() {
    this(false);
  }
  public V1WatchEventBuilder(Boolean validationEnabled) {
    this(new V1WatchEvent(), validationEnabled);
  }
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent) {
    this(fluent, false);
  }
  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1WatchEvent(), validationEnabled);
  }
  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,io.kubernetes.client.openapi.models.V1WatchEvent instance) {
    this(fluent, instance, false);
  }
  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,io.kubernetes.client.openapi.models.V1WatchEvent instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withObject(instance.getObject());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEvent instance) {
    this(instance,false);
  }
  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEvent instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withObject(instance.getObject());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1WatchEvent build() {
    V1WatchEvent buildable = new V1WatchEvent();
    buildable.setObject(fluent.getObject());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WatchEventBuilder that = (V1WatchEventBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}