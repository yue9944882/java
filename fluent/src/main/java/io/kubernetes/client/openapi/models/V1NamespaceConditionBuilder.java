package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NamespaceConditionBuilder extends V1NamespaceConditionFluentImpl<V1NamespaceConditionBuilder> implements VisitableBuilder<V1NamespaceCondition,io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder>{
  public V1NamespaceConditionBuilder() {
    this(false);
  }
  public V1NamespaceConditionBuilder(Boolean validationEnabled) {
    this(new V1NamespaceCondition(), validationEnabled);
  }
  public V1NamespaceConditionBuilder(V1NamespaceConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceConditionBuilder(io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NamespaceCondition(), validationEnabled);
  }
  public V1NamespaceConditionBuilder(io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceCondition instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceConditionBuilder(io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceConditionBuilder(io.kubernetes.client.openapi.models.V1NamespaceCondition instance) {
    this(instance,false);
  }
  public V1NamespaceConditionBuilder(io.kubernetes.client.openapi.models.V1NamespaceCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NamespaceCondition build() {
    V1NamespaceCondition buildable = new V1NamespaceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamespaceConditionBuilder that = (V1NamespaceConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}