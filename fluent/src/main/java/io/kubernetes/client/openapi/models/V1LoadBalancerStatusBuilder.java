package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1LoadBalancerStatusBuilder extends V1LoadBalancerStatusFluentImpl<V1LoadBalancerStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1LoadBalancerStatus,V1LoadBalancerStatusBuilder>{
  public V1LoadBalancerStatusBuilder() {
    this(false);
  }
  public V1LoadBalancerStatusBuilder(Boolean validationEnabled) {
    this(new V1LoadBalancerStatus(), validationEnabled);
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1LoadBalancerStatus(), validationEnabled);
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance) {
    this(fluent, instance, false);
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled; 
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance) {
    this(instance,false);
  }
  public V1LoadBalancerStatusBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus build() {
    V1LoadBalancerStatus buildable = new V1LoadBalancerStatus();
    buildable.setIngress(fluent.getIngress());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LoadBalancerStatusBuilder that = (V1LoadBalancerStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}