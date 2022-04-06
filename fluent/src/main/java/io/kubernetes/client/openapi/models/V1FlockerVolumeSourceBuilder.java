package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1FlockerVolumeSourceBuilder extends V1FlockerVolumeSourceFluentImpl<V1FlockerVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1FlockerVolumeSource,V1FlockerVolumeSourceBuilder>{
  public V1FlockerVolumeSourceBuilder() {
    this(false);
  }
  public V1FlockerVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlockerVolumeSource(), validationEnabled);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1FlockerVolumeSource(), validationEnabled);
  }
  public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDatasetName(instance.getDatasetName());

    fluent.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled; 
  }
  public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
    this(instance,false);
  }
  public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1FlockerVolumeSource build() {
    V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1FlockerVolumeSourceBuilder that = (V1FlockerVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}