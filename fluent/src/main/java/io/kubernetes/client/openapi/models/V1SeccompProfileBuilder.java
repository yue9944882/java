package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SeccompProfileBuilder extends V1SeccompProfileFluentImpl<V1SeccompProfileBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1SeccompProfile,io.kubernetes.client.openapi.models.V1SeccompProfileBuilder>{
  public V1SeccompProfileBuilder() {
    this(false);
  }
  public V1SeccompProfileBuilder(Boolean validationEnabled) {
    this(new V1SeccompProfile(), validationEnabled);
  }
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1SeccompProfile(), validationEnabled);
  }
  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this(fluent, instance, false);
  }
  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,io.kubernetes.client.openapi.models.V1SeccompProfile instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLocalhostProfile(instance.getLocalhostProfile());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this(instance,false);
  }
  public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfile instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1SeccompProfile build() {
    V1SeccompProfile buildable = new V1SeccompProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SeccompProfileBuilder that = (V1SeccompProfileBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}