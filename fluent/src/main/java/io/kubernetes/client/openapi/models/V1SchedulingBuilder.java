package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SchedulingBuilder extends V1SchedulingFluentImpl<V1SchedulingBuilder> implements VisitableBuilder<V1Scheduling,io.kubernetes.client.openapi.models.V1SchedulingBuilder>{
  public V1SchedulingBuilder() {
    this(false);
  }
  public V1SchedulingBuilder(Boolean validationEnabled) {
    this(new V1Scheduling(), validationEnabled);
  }
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SchedulingBuilder(io.kubernetes.client.openapi.models.V1SchedulingFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Scheduling(), validationEnabled);
  }
  public V1SchedulingBuilder(io.kubernetes.client.openapi.models.V1SchedulingFluent<?> fluent,io.kubernetes.client.openapi.models.V1Scheduling instance) {
    this(fluent, instance, false);
  }
  public V1SchedulingBuilder(io.kubernetes.client.openapi.models.V1SchedulingFluent<?> fluent,io.kubernetes.client.openapi.models.V1Scheduling instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled; 
  }
  public V1SchedulingBuilder(io.kubernetes.client.openapi.models.V1Scheduling instance) {
    this(instance,false);
  }
  public V1SchedulingBuilder(io.kubernetes.client.openapi.models.V1Scheduling instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withNodeSelector(instance.getNodeSelector());

    this.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SchedulingFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Scheduling build() {
    V1Scheduling buildable = new V1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.getTolerations());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SchedulingBuilder that = (V1SchedulingBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}