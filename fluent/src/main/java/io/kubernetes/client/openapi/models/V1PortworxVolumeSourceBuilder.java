package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PortworxVolumeSourceBuilder extends V1PortworxVolumeSourceFluentImpl<V1PortworxVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1PortworxVolumeSource,V1PortworxVolumeSourceBuilder>{
  public V1PortworxVolumeSourceBuilder() {
    this(false);
  }
  public V1PortworxVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PortworxVolumeSource(), validationEnabled);
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PortworxVolumeSource(), validationEnabled);
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
    this(instance,false);
  }
  public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource build() {
    V1PortworxVolumeSource buildable = new V1PortworxVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PortworxVolumeSourceBuilder that = (V1PortworxVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}