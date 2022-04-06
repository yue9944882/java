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
  public class V1SeccompProfileFluentImpl<A extends V1SeccompProfileFluent<A>> extends BaseFluent<A> implements V1SeccompProfileFluent<A>{
  public V1SeccompProfileFluentImpl() {
  }
  public V1SeccompProfileFluentImpl(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

  }
  private String localhostProfile;
  private V1SeccompProfile.TypeEnum type;
  public java.lang.String getLocalhostProfile() {
    return this.localhostProfile;
  }
  public A withLocalhostProfile(java.lang.String localhostProfile) {
    this.localhostProfile=localhostProfile; return (A) this;
  }
  public Boolean hasLocalhostProfile() {
    return this.localhostProfile != null;
  }
  public io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum getType() {
    return this.type;
  }
  public A withType(io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SeccompProfileFluentImpl that = (V1SeccompProfileFluentImpl) o;
    if (localhostProfile != null ? !localhostProfile.equals(that.localhostProfile) :that.localhostProfile != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(localhostProfile,  type,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (localhostProfile != null) { sb.append("localhostProfile:"); sb.append(localhostProfile + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}