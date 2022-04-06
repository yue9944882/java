package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SecretKeySelectorFluentImpl<A extends V1SecretKeySelectorFluent<A>> extends BaseFluent<A> implements V1SecretKeySelectorFluent<A>{
  public V1SecretKeySelectorFluentImpl() {
  }
  public V1SecretKeySelectorFluentImpl(io.kubernetes.client.openapi.models.V1SecretKeySelector instance) {
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

  }
  private String key;
  private java.lang.String name;
  private Boolean optional;
  public java.lang.String getKey() {
    return this.key;
  }
  public A withKey(java.lang.String key) {
    this.key=key; return (A) this;
  }
  public java.lang.Boolean hasKey() {
    return this.key != null;
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  public java.lang.Boolean getOptional() {
    return this.optional;
  }
  public A withOptional(java.lang.Boolean optional) {
    this.optional=optional; return (A) this;
  }
  public java.lang.Boolean hasOptional() {
    return this.optional != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecretKeySelectorFluentImpl that = (V1SecretKeySelectorFluentImpl) o;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  name,  optional,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  public A withOptional() {
    return withOptional(true);
  }
  
}