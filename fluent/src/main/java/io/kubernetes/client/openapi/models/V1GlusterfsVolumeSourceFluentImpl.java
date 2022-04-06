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
  public class V1GlusterfsVolumeSourceFluentImpl<A extends V1GlusterfsVolumeSourceFluent<A>> extends BaseFluent<A> implements V1GlusterfsVolumeSourceFluent<A>{
  public V1GlusterfsVolumeSourceFluentImpl() {
  }
  public V1GlusterfsVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
    this.withEndpoints(instance.getEndpoints());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

  }
  private String endpoints;
  private java.lang.String path;
  private Boolean readOnly;
  public java.lang.String getEndpoints() {
    return this.endpoints;
  }
  public A withEndpoints(java.lang.String endpoints) {
    this.endpoints=endpoints; return (A) this;
  }
  public java.lang.Boolean hasEndpoints() {
    return this.endpoints != null;
  }
  public java.lang.String getPath() {
    return this.path;
  }
  public A withPath(java.lang.String path) {
    this.path=path; return (A) this;
  }
  public java.lang.Boolean hasPath() {
    return this.path != null;
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
    V1GlusterfsVolumeSourceFluentImpl that = (V1GlusterfsVolumeSourceFluentImpl) o;
    if (endpoints != null ? !endpoints.equals(that.endpoints) :that.endpoints != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(endpoints,  path,  readOnly,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endpoints != null) { sb.append("endpoints:"); sb.append(endpoints + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}