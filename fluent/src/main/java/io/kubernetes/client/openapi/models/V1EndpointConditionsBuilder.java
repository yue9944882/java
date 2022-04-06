package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1EndpointConditionsBuilder extends V1EndpointConditionsFluentImpl<V1EndpointConditionsBuilder> implements VisitableBuilder<V1EndpointConditions,io.kubernetes.client.openapi.models.V1EndpointConditionsBuilder>{
  public V1EndpointConditionsBuilder() {
    this(false);
  }
  public V1EndpointConditionsBuilder(Boolean validationEnabled) {
    this(new V1EndpointConditions(), validationEnabled);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointConditionsBuilder(io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1EndpointConditions(), validationEnabled);
  }
  public V1EndpointConditionsBuilder(io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointConditions instance) {
    this(fluent, instance, false);
  }
  public V1EndpointConditionsBuilder(io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointConditions instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReady(instance.getReady());

    fluent.withServing(instance.getServing());

    fluent.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointConditionsBuilder(io.kubernetes.client.openapi.models.V1EndpointConditions instance) {
    this(instance,false);
  }
  public V1EndpointConditionsBuilder(io.kubernetes.client.openapi.models.V1EndpointConditions instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1EndpointConditions build() {
    V1EndpointConditions buildable = new V1EndpointConditions();
    buildable.setReady(fluent.getReady());
    buildable.setServing(fluent.getServing());
    buildable.setTerminating(fluent.getTerminating());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointConditionsBuilder that = (V1EndpointConditionsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}