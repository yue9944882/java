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
  public class V1beta1AllowedHostPathFluentImpl<A extends V1beta1AllowedHostPathFluent<A>> extends BaseFluent<A> implements V1beta1AllowedHostPathFluent<A>{
  public V1beta1AllowedHostPathFluentImpl() {
  }
  public V1beta1AllowedHostPathFluentImpl(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this.withPathPrefix(instance.getPathPrefix());

    this.withReadOnly(instance.getReadOnly());

  }
  private String pathPrefix;
  private Boolean readOnly;
  public java.lang.String getPathPrefix() {
    return this.pathPrefix;
  }
  public A withPathPrefix(java.lang.String pathPrefix) {
    this.pathPrefix=pathPrefix; return (A) this;
  }
  public java.lang.Boolean hasPathPrefix() {
    return this.pathPrefix != null;
  }
  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1AllowedHostPathFluentImpl that = (V1beta1AllowedHostPathFluentImpl) o;
    if (pathPrefix != null ? !pathPrefix.equals(that.pathPrefix) :that.pathPrefix != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(pathPrefix,  readOnly,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (pathPrefix != null) { sb.append("pathPrefix:"); sb.append(pathPrefix + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}