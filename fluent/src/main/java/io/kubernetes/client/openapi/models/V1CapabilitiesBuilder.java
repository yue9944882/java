package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CapabilitiesBuilder extends V1CapabilitiesFluentImpl<V1CapabilitiesBuilder> implements VisitableBuilder<V1Capabilities,io.kubernetes.client.openapi.models.V1CapabilitiesBuilder>{
  public V1CapabilitiesBuilder() {
    this(false);
  }
  public V1CapabilitiesBuilder(Boolean validationEnabled) {
    this(new V1Capabilities(), validationEnabled);
  }
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Capabilities(), validationEnabled);
  }
  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,io.kubernetes.client.openapi.models.V1Capabilities instance) {
    this(fluent, instance, false);
  }
  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,io.kubernetes.client.openapi.models.V1Capabilities instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAdd(instance.getAdd());

    fluent.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled; 
  }
  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1Capabilities instance) {
    this(instance,false);
  }
  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1Capabilities instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAdd(instance.getAdd());

    this.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Capabilities build() {
    V1Capabilities buildable = new V1Capabilities();
    buildable.setAdd(fluent.getAdd());
    buildable.setDrop(fluent.getDrop());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CapabilitiesBuilder that = (V1CapabilitiesBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}