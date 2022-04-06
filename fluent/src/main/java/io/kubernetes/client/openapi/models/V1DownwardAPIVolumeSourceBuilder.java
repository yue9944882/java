package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1DownwardAPIVolumeSourceBuilder extends V1DownwardAPIVolumeSourceFluentImpl<V1DownwardAPIVolumeSourceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder>{
  public V1DownwardAPIVolumeSourceBuilder() {
    this(false);
  }
  public V1DownwardAPIVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1DownwardAPIVolumeSource(), validationEnabled);
  }
  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DownwardAPIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIVolumeSource(), validationEnabled);
  }
  public V1DownwardAPIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1DownwardAPIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withItems(instance.getItems());

    this.validationEnabled = validationEnabled; 
  }
  public V1DownwardAPIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource instance) {
    this(instance,false);
  }
  public V1DownwardAPIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource build() {
    V1DownwardAPIVolumeSource buildable = new V1DownwardAPIVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.getItems());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DownwardAPIVolumeSourceBuilder that = (V1DownwardAPIVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}