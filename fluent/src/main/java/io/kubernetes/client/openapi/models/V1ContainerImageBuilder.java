package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ContainerImageBuilder extends V1ContainerImageFluentImpl<V1ContainerImageBuilder> implements VisitableBuilder<V1ContainerImage,io.kubernetes.client.openapi.models.V1ContainerImageBuilder>{
  public V1ContainerImageBuilder() {
    this(false);
  }
  public V1ContainerImageBuilder(Boolean validationEnabled) {
    this(new V1ContainerImage(), validationEnabled);
  }
  public V1ContainerImageBuilder(V1ContainerImageFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ContainerImage(), validationEnabled);
  }
  public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerImage instance) {
    this(fluent, instance, false);
  }
  public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerImage instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNames(instance.getNames());

    fluent.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImage instance) {
    this(instance,false);
  }
  public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImage instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ContainerImage build() {
    V1ContainerImage buildable = new V1ContainerImage();
    buildable.setNames(fluent.getNames());
    buildable.setSizeBytes(fluent.getSizeBytes());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerImageBuilder that = (V1ContainerImageBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}