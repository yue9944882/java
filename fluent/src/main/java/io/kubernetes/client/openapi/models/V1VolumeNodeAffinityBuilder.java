package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1VolumeNodeAffinityBuilder extends V1VolumeNodeAffinityFluentImpl<V1VolumeNodeAffinityBuilder> implements VisitableBuilder<V1VolumeNodeAffinity,io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder>{
  public V1VolumeNodeAffinityBuilder() {
    this(false);
  }
  public V1VolumeNodeAffinityBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeAffinity(), validationEnabled);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeAffinity(), validationEnabled);
  }
  public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
    this(fluent, instance, false);
  }
  public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
    this(instance,false);
  }
  public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity build() {
    V1VolumeNodeAffinity buildable = new V1VolumeNodeAffinity();
    buildable.setRequired(fluent.getRequired());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeNodeAffinityBuilder that = (V1VolumeNodeAffinityBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}