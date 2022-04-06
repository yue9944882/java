package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1EventSourceBuilder extends V1EventSourceFluentImpl<V1EventSourceBuilder> implements VisitableBuilder<V1EventSource,io.kubernetes.client.openapi.models.V1EventSourceBuilder>{
  public V1EventSourceBuilder() {
    this(false);
  }
  public V1EventSourceBuilder(Boolean validationEnabled) {
    this(new V1EventSource(), validationEnabled);
  }
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1EventSource(), validationEnabled);
  }
  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EventSource instance) {
    this(fluent, instance, false);
  }
  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EventSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withComponent(instance.getComponent());

    fluent.withHost(instance.getHost());

    this.validationEnabled = validationEnabled; 
  }
  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSource instance) {
    this(instance,false);
  }
  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EventSourceBuilder that = (V1EventSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}