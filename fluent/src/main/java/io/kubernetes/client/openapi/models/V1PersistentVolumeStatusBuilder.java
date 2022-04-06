package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PersistentVolumeStatusBuilder extends V1PersistentVolumeStatusFluentImpl<V1PersistentVolumeStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeStatus,io.kubernetes.client.openapi.models.V1PersistentVolumeStatusBuilder>{
  public V1PersistentVolumeStatusBuilder() {
    this(false);
  }
  public V1PersistentVolumeStatusBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeStatus(), validationEnabled);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeStatus(), validationEnabled);
  }
  public V1PersistentVolumeStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeStatus instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withPhase(instance.getPhase());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus instance) {
    this(instance,false);
  }
  public V1PersistentVolumeStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withPhase(instance.getPhase());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PersistentVolumeStatus build() {
    V1PersistentVolumeStatus buildable = new V1PersistentVolumeStatus();
    buildable.setMessage(fluent.getMessage());
    buildable.setPhase(fluent.getPhase());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeStatusBuilder that = (V1PersistentVolumeStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}