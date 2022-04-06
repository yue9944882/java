package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1VolumeNodeResourcesBuilder extends V1VolumeNodeResourcesFluentImpl<V1VolumeNodeResourcesBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeNodeResources,io.kubernetes.client.openapi.models.V1VolumeNodeResourcesBuilder>{
  public V1VolumeNodeResourcesBuilder() {
    this(false);
  }
  public V1VolumeNodeResourcesBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeResources(), validationEnabled);
  }
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeResources(), validationEnabled);
  }
  public V1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeResources instance) {
    this(fluent, instance, false);
  }
  public V1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeResources instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCount(instance.getCount());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeResources instance) {
    this(instance,false);
  }
  public V1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeResources instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCount(instance.getCount());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1VolumeNodeResources build() {
    V1VolumeNodeResources buildable = new V1VolumeNodeResources();
    buildable.setCount(fluent.getCount());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeNodeResourcesBuilder that = (V1VolumeNodeResourcesBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}