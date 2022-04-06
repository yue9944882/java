package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1OverheadBuilder extends V1OverheadFluentImpl<V1OverheadBuilder> implements VisitableBuilder<V1Overhead,io.kubernetes.client.openapi.models.V1OverheadBuilder>{
  public V1OverheadBuilder() {
    this(false);
  }
  public V1OverheadBuilder(Boolean validationEnabled) {
    this(new V1Overhead(), validationEnabled);
  }
  public V1OverheadBuilder(V1OverheadFluent<?> fluent) {
    this(fluent, false);
  }
  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Overhead(), validationEnabled);
  }
  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,io.kubernetes.client.openapi.models.V1Overhead instance) {
    this(fluent, instance, false);
  }
  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,io.kubernetes.client.openapi.models.V1Overhead instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled; 
  }
  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1Overhead instance) {
    this(instance,false);
  }
  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1Overhead instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Overhead build() {
    V1Overhead buildable = new V1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1OverheadBuilder that = (V1OverheadBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}