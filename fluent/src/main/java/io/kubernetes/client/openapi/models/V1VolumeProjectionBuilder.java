package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1VolumeProjectionBuilder extends V1VolumeProjectionFluentImpl<V1VolumeProjectionBuilder> implements VisitableBuilder<V1VolumeProjection,io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>{
  public V1VolumeProjectionBuilder() {
    this(false);
  }
  public V1VolumeProjectionBuilder(Boolean validationEnabled) {
    this(new V1VolumeProjection(), validationEnabled);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeProjectionBuilder(io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeProjection(), validationEnabled);
  }
  public V1VolumeProjectionBuilder(io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeProjection instance) {
    this(fluent, instance, false);
  }
  public V1VolumeProjectionBuilder(io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeProjection instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConfigMap(instance.getConfigMap());

    fluent.withDownwardAPI(instance.getDownwardAPI());

    fluent.withSecret(instance.getSecret());

    fluent.withServiceAccountToken(instance.getServiceAccountToken());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeProjectionBuilder(io.kubernetes.client.openapi.models.V1VolumeProjection instance) {
    this(instance,false);
  }
  public V1VolumeProjectionBuilder(io.kubernetes.client.openapi.models.V1VolumeProjection instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConfigMap(instance.getConfigMap());

    this.withDownwardAPI(instance.getDownwardAPI());

    this.withSecret(instance.getSecret());

    this.withServiceAccountToken(instance.getServiceAccountToken());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1VolumeProjection build() {
    V1VolumeProjection buildable = new V1VolumeProjection();
    buildable.setConfigMap(fluent.getConfigMap());
    buildable.setDownwardAPI(fluent.getDownwardAPI());
    buildable.setSecret(fluent.getSecret());
    buildable.setServiceAccountToken(fluent.getServiceAccountToken());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeProjectionBuilder that = (V1VolumeProjectionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}