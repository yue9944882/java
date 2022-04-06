package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ScaleStatusBuilder extends V1ScaleStatusFluentImpl<V1ScaleStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1ScaleStatus,V1ScaleStatusBuilder>{
  public V1ScaleStatusBuilder() {
    this(false);
  }
  public V1ScaleStatusBuilder(Boolean validationEnabled) {
    this(new V1ScaleStatus(), validationEnabled);
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ScaleStatus(), validationEnabled);
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScaleStatus instance) {
    this(fluent, instance, false);
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScaleStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatus instance) {
    this(instance,false);
  }
  public V1ScaleStatusBuilder(io.kubernetes.client.openapi.models.V1ScaleStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ScaleStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ScaleStatus build() {
    V1ScaleStatus buildable = new V1ScaleStatus();
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ScaleStatusBuilder that = (V1ScaleStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}