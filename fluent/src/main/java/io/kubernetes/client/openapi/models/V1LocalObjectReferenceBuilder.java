package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1LocalObjectReferenceBuilder extends V1LocalObjectReferenceFluentImpl<V1LocalObjectReferenceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1LocalObjectReference,V1LocalObjectReferenceBuilder>{
  public V1LocalObjectReferenceBuilder() {
    this(false);
  }
  public V1LocalObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1LocalObjectReference(), validationEnabled);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1LocalObjectReference(), validationEnabled);
  }
  public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalObjectReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReference instance) {
    this(instance,false);
  }
  public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1LocalObjectReference build() {
    V1LocalObjectReference buildable = new V1LocalObjectReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LocalObjectReferenceBuilder that = (V1LocalObjectReferenceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}