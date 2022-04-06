package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1TokenRequestSpecBuilder extends V1TokenRequestSpecFluentImpl<V1TokenRequestSpecBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1TokenRequestSpec,V1TokenRequestSpecBuilder>{
  public V1TokenRequestSpecBuilder() {
    this(false);
  }
  public V1TokenRequestSpecBuilder(Boolean validationEnabled) {
    this(new V1TokenRequestSpec(), validationEnabled);
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1TokenRequestSpec(), validationEnabled);
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenRequestSpec instance) {
    this(fluent, instance, false);
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenRequestSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudiences(instance.getAudiences());

    fluent.withBoundObjectRef(instance.getBoundObjectRef());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpec instance) {
    this(instance,false);
  }
  public V1TokenRequestSpecBuilder(io.kubernetes.client.openapi.models.V1TokenRequestSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudiences(instance.getAudiences());

    this.withBoundObjectRef(instance.getBoundObjectRef());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1TokenRequestSpec build() {
    V1TokenRequestSpec buildable = new V1TokenRequestSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setBoundObjectRef(fluent.getBoundObjectRef());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TokenRequestSpecBuilder that = (V1TokenRequestSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}