package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PersistentVolumeClaimVolumeSourceBuilder extends V1PersistentVolumeClaimVolumeSourceFluentImpl<V1PersistentVolumeClaimVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder>{
  public V1PersistentVolumeClaimVolumeSourceBuilder() {
    this(false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withClaimName(instance.getClaimName());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
    this(instance,false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withClaimName(instance.getClaimName());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource build() {
    V1PersistentVolumeClaimVolumeSource buildable = new V1PersistentVolumeClaimVolumeSource();
    buildable.setClaimName(fluent.getClaimName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimVolumeSourceBuilder that = (V1PersistentVolumeClaimVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}