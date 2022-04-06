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
  public class V1ServerAddressByClientCIDRFluentImpl<A extends V1ServerAddressByClientCIDRFluent<A>> extends BaseFluent<A> implements V1ServerAddressByClientCIDRFluent<A>{
  public V1ServerAddressByClientCIDRFluentImpl() {
  }
  public V1ServerAddressByClientCIDRFluentImpl(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());

  }
  private String clientCIDR;
  private java.lang.String serverAddress;
  public java.lang.String getClientCIDR() {
    return this.clientCIDR;
  }
  public A withClientCIDR(java.lang.String clientCIDR) {
    this.clientCIDR=clientCIDR; return (A) this;
  }
  public Boolean hasClientCIDR() {
    return this.clientCIDR != null;
  }
  public java.lang.String getServerAddress() {
    return this.serverAddress;
  }
  public A withServerAddress(java.lang.String serverAddress) {
    this.serverAddress=serverAddress; return (A) this;
  }
  public java.lang.Boolean hasServerAddress() {
    return this.serverAddress != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServerAddressByClientCIDRFluentImpl that = (V1ServerAddressByClientCIDRFluentImpl) o;
    if (clientCIDR != null ? !clientCIDR.equals(that.clientCIDR) :that.clientCIDR != null) return false;
    if (serverAddress != null ? !serverAddress.equals(that.serverAddress) :that.serverAddress != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(clientCIDR,  serverAddress,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientCIDR != null) { sb.append("clientCIDR:"); sb.append(clientCIDR + ","); }
    if (serverAddress != null) { sb.append("serverAddress:"); sb.append(serverAddress); }
    sb.append("}");
    return sb.toString();
  }
  
}