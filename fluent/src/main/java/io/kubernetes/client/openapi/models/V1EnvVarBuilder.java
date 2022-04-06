package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1EnvVarBuilder extends V1EnvVarFluentImpl<V1EnvVarBuilder> implements VisitableBuilder<V1EnvVar,io.kubernetes.client.openapi.models.V1EnvVarBuilder>{
  public V1EnvVarBuilder() {
    this(false);
  }
  public V1EnvVarBuilder(Boolean validationEnabled) {
    this(new V1EnvVar(), validationEnabled);
  }
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1EnvVar(), validationEnabled);
  }
  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(fluent, instance, false);
  }
  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,io.kubernetes.client.openapi.models.V1EnvVar instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    fluent.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled; 
  }
  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(instance,false);
  }
  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVar instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.getValueFrom());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarBuilder that = (V1EnvVarBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}