package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationStatusBuilder extends V1beta2PriorityLevelConfigurationStatusFluentImpl<V1beta2PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus,V1beta2PriorityLevelConfigurationStatusBuilder>{
  public V1beta2PriorityLevelConfigurationStatusBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatus build() {
    V1beta2PriorityLevelConfigurationStatus buildable = new V1beta2PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PriorityLevelConfigurationStatusBuilder that = (V1beta2PriorityLevelConfigurationStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}