package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1FlexPersistentVolumeSourceBuilder extends V1FlexPersistentVolumeSourceFluentImpl<V1FlexPersistentVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource,V1FlexPersistentVolumeSourceBuilder>{
  public V1FlexPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1FlexPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlexPersistentVolumeSource(), validationEnabled);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FlexPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1FlexPersistentVolumeSource(), validationEnabled);
  }
  public V1FlexPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FlexPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withOptions(instance.getOptions());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1FlexPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1FlexPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource build() {
    V1FlexPersistentVolumeSource buildable = new V1FlexPersistentVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1FlexPersistentVolumeSourceBuilder that = (V1FlexPersistentVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}