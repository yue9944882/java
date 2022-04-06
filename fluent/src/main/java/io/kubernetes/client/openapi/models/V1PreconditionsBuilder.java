package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PreconditionsBuilder extends V1PreconditionsFluentImpl<V1PreconditionsBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1Preconditions,io.kubernetes.client.openapi.models.V1PreconditionsBuilder>{
  public V1PreconditionsBuilder() {
    this(false);
  }
  public V1PreconditionsBuilder(Boolean validationEnabled) {
    this(new V1Preconditions(), validationEnabled);
  }
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Preconditions(), validationEnabled);
  }
  public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Preconditions instance) {
    this(fluent, instance, false);
  }
  public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Preconditions instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1Preconditions instance) {
    this(instance,false);
  }
  public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1Preconditions instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Preconditions build() {
    V1Preconditions buildable = new V1Preconditions();
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PreconditionsBuilder that = (V1PreconditionsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}