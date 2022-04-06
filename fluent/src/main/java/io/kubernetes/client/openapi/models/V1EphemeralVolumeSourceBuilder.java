package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1EphemeralVolumeSourceBuilder extends V1EphemeralVolumeSourceFluentImpl<V1EphemeralVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1EphemeralVolumeSource,V1EphemeralVolumeSourceBuilder>{
  public V1EphemeralVolumeSourceBuilder() {
    this(false);
  }
  public V1EphemeralVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1EphemeralVolumeSource(), validationEnabled);
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1EphemeralVolumeSource(), validationEnabled);
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance) {
    this(instance,false);
  }
  public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource build() {
    V1EphemeralVolumeSource buildable = new V1EphemeralVolumeSource();
    buildable.setVolumeClaimTemplate(fluent.getVolumeClaimTemplate());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EphemeralVolumeSourceBuilder that = (V1EphemeralVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}