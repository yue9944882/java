package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1RuleWithOperationsBuilder extends V1RuleWithOperationsFluentImpl<V1RuleWithOperationsBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1RuleWithOperations,io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>{
  public V1RuleWithOperationsBuilder() {
    this(false);
  }
  public V1RuleWithOperationsBuilder(Boolean validationEnabled) {
    this(new V1RuleWithOperations(), validationEnabled);
  }
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1RuleWithOperations(), validationEnabled);
  }
  public V1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,io.kubernetes.client.openapi.models.V1RuleWithOperations instance) {
    this(fluent, instance, false);
  }
  public V1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,io.kubernetes.client.openapi.models.V1RuleWithOperations instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withApiVersions(instance.getApiVersions());

    fluent.withOperations(instance.getOperations());

    fluent.withResources(instance.getResources());

    fluent.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  public V1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1RuleWithOperations instance) {
    this(instance,false);
  }
  public V1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1RuleWithOperations instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withApiVersions(instance.getApiVersions());

    this.withOperations(instance.getOperations());

    this.withResources(instance.getResources());

    this.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1RuleWithOperations build() {
    V1RuleWithOperations buildable = new V1RuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RuleWithOperationsBuilder that = (V1RuleWithOperationsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}