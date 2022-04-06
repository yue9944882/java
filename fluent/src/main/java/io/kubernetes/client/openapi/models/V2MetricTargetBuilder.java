package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2MetricTargetBuilder extends V2MetricTargetFluentImpl<V2MetricTargetBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V2MetricTarget,io.kubernetes.client.openapi.models.V2MetricTargetBuilder>{
  public V2MetricTargetBuilder() {
    this(false);
  }
  public V2MetricTargetBuilder(Boolean validationEnabled) {
    this(new V2MetricTarget(), validationEnabled);
  }
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2MetricTarget(), validationEnabled);
  }
  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricTarget instance) {
    this(fluent, instance, false);
  }
  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricTarget instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTarget instance) {
    this(instance,false);
  }
  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTarget instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2MetricTarget build() {
    V2MetricTarget buildable = new V2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricTargetBuilder that = (V2MetricTargetBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}