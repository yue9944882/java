package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2MetricSpecBuilder extends V2MetricSpecFluentImpl<V2MetricSpecBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V2MetricSpec,io.kubernetes.client.openapi.models.V2MetricSpecBuilder>{
  public V2MetricSpecBuilder() {
    this(false);
  }
  public V2MetricSpecBuilder(Boolean validationEnabled) {
    this(new V2MetricSpec(), validationEnabled);
  }
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2MetricSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2MetricSpec(), validationEnabled);
  }
  public V2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricSpec instance) {
    this(fluent, instance, false);
  }
  public V2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2MetricSpec instance) {
    this(instance,false);
  }
  public V2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2MetricSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2MetricSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2MetricSpec build() {
    V2MetricSpec buildable = new V2MetricSpec();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricSpecBuilder that = (V2MetricSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}