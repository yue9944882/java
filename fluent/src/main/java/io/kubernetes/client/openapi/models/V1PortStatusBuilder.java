package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PortStatusBuilder extends V1PortStatusFluentImpl<V1PortStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1PortStatus,io.kubernetes.client.openapi.models.V1PortStatusBuilder>{
  public V1PortStatusBuilder() {
    this(false);
  }
  public V1PortStatusBuilder(Boolean validationEnabled) {
    this(new V1PortStatus(), validationEnabled);
  }
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PortStatus(), validationEnabled);
  }
  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortStatus instance) {
    this(fluent, instance, false);
  }
  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withError(instance.getError());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatus instance) {
    this(instance,false);
  }
  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PortStatusBuilder that = (V1PortStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}