package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ContainerPortBuilder extends V1ContainerPortFluentImpl<V1ContainerPortBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1ContainerPort,io.kubernetes.client.openapi.models.V1ContainerPortBuilder>{
  public V1ContainerPortBuilder() {
    this(false);
  }
  public V1ContainerPortBuilder(Boolean validationEnabled) {
    this(new V1ContainerPort(), validationEnabled);
  }
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ContainerPort(), validationEnabled);
  }
  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this(fluent, instance, false);
  }
  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerPort(instance.getContainerPort());

    fluent.withHostIP(instance.getHostIP());

    fluent.withHostPort(instance.getHostPort());

    fluent.withName(instance.getName());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this(instance,false);
  }
  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ContainerPort build() {
    V1ContainerPort buildable = new V1ContainerPort();
    buildable.setContainerPort(fluent.getContainerPort());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostPort(fluent.getHostPort());
    buildable.setName(fluent.getName());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerPortBuilder that = (V1ContainerPortBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}