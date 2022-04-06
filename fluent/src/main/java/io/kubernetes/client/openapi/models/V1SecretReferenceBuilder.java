package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SecretReferenceBuilder extends V1SecretReferenceFluentImpl<V1SecretReferenceBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1SecretReference,V1SecretReferenceBuilder>{
  public V1SecretReferenceBuilder() {
    this(false);
  }
  public V1SecretReferenceBuilder(Boolean validationEnabled) {
    this(new V1SecretReference(), validationEnabled);
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1SecretReference(), validationEnabled);
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretReference instance) {
    this(fluent, instance, false);
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReference instance) {
    this(instance,false);
  }
  public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReference instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1SecretReference build() {
    V1SecretReference buildable = new V1SecretReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SecretReferenceBuilder that = (V1SecretReferenceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}