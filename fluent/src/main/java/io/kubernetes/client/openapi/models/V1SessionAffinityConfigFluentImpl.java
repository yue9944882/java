package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SessionAffinityConfigFluentImpl<A extends V1SessionAffinityConfigFluent<A>> extends BaseFluent<A> implements V1SessionAffinityConfigFluent<A>{
  public V1SessionAffinityConfigFluentImpl() {
  }
  public V1SessionAffinityConfigFluentImpl(io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance) {
    this.withClientIP(instance.getClientIP());

  }
  private V1ClientIPConfigBuilder clientIP;
  
  /**
   * This method has been deprecated, please use method buildClientIP instead.
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ClientIPConfig getClientIP() {
    return this.clientIP!=null ?this.clientIP.build():null;
  }
  public io.kubernetes.client.openapi.models.V1ClientIPConfig buildClientIP() {
    return this.clientIP!=null ?this.clientIP.build():null;
  }
  public A withClientIP(io.kubernetes.client.openapi.models.V1ClientIPConfig clientIP) {
    _visitables.get("clientIP").remove(this.clientIP);
    if (clientIP!=null){ this.clientIP= new V1ClientIPConfigBuilder(clientIP); _visitables.get("clientIP").add(this.clientIP);} return (A) this;
  }
  public Boolean hasClientIP() {
    return this.clientIP != null;
  }
  public V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIP() {
    return new V1SessionAffinityConfigFluentImpl.ClientIPNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
    return new V1SessionAffinityConfigFluentImpl.ClientIPNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editClientIP() {
    return withNewClientIPLike(getClientIP());
  }
  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIP() {
    return withNewClientIPLike(getClientIP() != null ? getClientIP(): new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
    return withNewClientIPLike(getClientIP() != null ? getClientIP(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SessionAffinityConfigFluentImpl that = (V1SessionAffinityConfigFluentImpl) o;
    if (clientIP != null ? !clientIP.equals(that.clientIP) :that.clientIP != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(clientIP,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientIP != null) { sb.append("clientIP:"); sb.append(clientIP); }
    sb.append("}");
    return sb.toString();
  }
  class ClientIPNestedImpl<N> extends V1ClientIPConfigFluentImpl<V1SessionAffinityConfigFluent.ClientIPNested<N>> implements io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<N>,Nested<N>{
    ClientIPNestedImpl(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
      this.builder = new V1ClientIPConfigBuilder(this, item);
    }
    ClientIPNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder builder;
    public N and() {
      return (N) V1SessionAffinityConfigFluentImpl.this.withClientIP(builder.build());
    }
    public N endClientIP() {
      return and();
    }
    
  }
  
}