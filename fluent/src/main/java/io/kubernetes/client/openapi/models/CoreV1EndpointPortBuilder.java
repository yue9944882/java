package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class CoreV1EndpointPortBuilder extends CoreV1EndpointPortFluentImpl<CoreV1EndpointPortBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.CoreV1EndpointPort,io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>{
  public CoreV1EndpointPortBuilder() {
    this(false);
  }
  public CoreV1EndpointPortBuilder(Boolean validationEnabled) {
    this(new CoreV1EndpointPort(), validationEnabled);
  }
  public CoreV1EndpointPortBuilder(CoreV1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }
  public CoreV1EndpointPortBuilder(io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new CoreV1EndpointPort(), validationEnabled);
  }
  public CoreV1EndpointPortBuilder(io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.CoreV1EndpointPort instance) {
    this(fluent, instance, false);
  }
  public CoreV1EndpointPortBuilder(io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.CoreV1EndpointPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public CoreV1EndpointPortBuilder(io.kubernetes.client.openapi.models.CoreV1EndpointPort instance) {
    this(instance,false);
  }
  public CoreV1EndpointPortBuilder(io.kubernetes.client.openapi.models.CoreV1EndpointPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.CoreV1EndpointPort build() {
    CoreV1EndpointPort buildable = new CoreV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CoreV1EndpointPortBuilder that = (CoreV1EndpointPortBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}