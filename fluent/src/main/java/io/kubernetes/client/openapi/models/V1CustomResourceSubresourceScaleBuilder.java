package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CustomResourceSubresourceScaleBuilder extends V1CustomResourceSubresourceScaleFluentImpl<V1CustomResourceSubresourceScaleBuilder> implements VisitableBuilder<V1CustomResourceSubresourceScale,io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder>{
  public V1CustomResourceSubresourceScaleBuilder() {
    this(false);
  }
  public V1CustomResourceSubresourceScaleBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceSubresourceScale(), validationEnabled);
  }
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresourceScale(), validationEnabled);
  }
  public V1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLabelSelectorPath(instance.getLabelSelectorPath());

    fluent.withSpecReplicasPath(instance.getSpecReplicasPath());

    fluent.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance) {
    this(instance,false);
  }
  public V1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale build() {
    V1CustomResourceSubresourceScale buildable = new V1CustomResourceSubresourceScale();
    buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
    buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
    buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceSubresourceScaleBuilder that = (V1CustomResourceSubresourceScaleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}