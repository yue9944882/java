package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NamespaceStatusBuilder extends V1NamespaceStatusFluentImpl<V1NamespaceStatusBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1NamespaceStatus,V1NamespaceStatusBuilder>{
  public V1NamespaceStatusBuilder() {
    this(false);
  }
  public V1NamespaceStatusBuilder(Boolean validationEnabled) {
    this(new V1NamespaceStatus(), validationEnabled);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NamespaceStatus(), validationEnabled);
  }
  public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceStatus instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatus instance) {
    this(instance,false);
  }
  public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NamespaceStatus build() {
    V1NamespaceStatus buildable = new V1NamespaceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamespaceStatusBuilder that = (V1NamespaceStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}