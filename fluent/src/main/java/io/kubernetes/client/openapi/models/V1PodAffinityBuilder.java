package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PodAffinityBuilder extends V1PodAffinityFluentImpl<V1PodAffinityBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1PodAffinity,io.kubernetes.client.openapi.models.V1PodAffinityBuilder>{
  public V1PodAffinityBuilder() {
    this(false);
  }
  public V1PodAffinityBuilder(Boolean validationEnabled) {
    this(new V1PodAffinity(), validationEnabled);
  }
  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodAffinity(), validationEnabled);
  }
  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAffinity instance) {
    this(fluent, instance, false);
  }
  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAffinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinity instance) {
    this(instance,false);
  }
  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PodAffinity build() {
    V1PodAffinity buildable = new V1PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodAffinityBuilder that = (V1PodAffinityBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}