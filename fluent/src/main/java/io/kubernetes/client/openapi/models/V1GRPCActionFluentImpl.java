package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1GRPCActionFluentImpl<A extends V1GRPCActionFluent<A>> extends BaseFluent<A> implements V1GRPCActionFluent<A>{
  public V1GRPCActionFluentImpl() {
  }
  public V1GRPCActionFluentImpl(io.kubernetes.client.openapi.models.V1GRPCAction instance) {
    this.withPort(instance.getPort());

    this.withService(instance.getService());

  }
  private Integer port;
  private String service;
  public java.lang.Integer getPort() {
    return this.port;
  }
  public A withPort(java.lang.Integer port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public java.lang.String getService() {
    return this.service;
  }
  public A withService(java.lang.String service) {
    this.service=service; return (A) this;
  }
  public java.lang.Boolean hasService() {
    return this.service != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GRPCActionFluentImpl that = (V1GRPCActionFluentImpl) o;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (service != null ? !service.equals(that.service) :that.service != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(port,  service,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (service != null) { sb.append("service:"); sb.append(service); }
    sb.append("}");
    return sb.toString();
  }
  
}