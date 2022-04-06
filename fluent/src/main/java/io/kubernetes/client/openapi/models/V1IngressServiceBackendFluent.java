package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressServiceBackendFluent<A extends V1IngressServiceBackendFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildPort instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceBackendPort getPort();
  public io.kubernetes.client.openapi.models.V1ServiceBackendPort buildPort();
  public A withPort(io.kubernetes.client.openapi.models.V1ServiceBackendPort port);
  public java.lang.Boolean hasPort();
  public V1IngressServiceBackendFluent.PortNested<A> withNewPort();
  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> withNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);
  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editPort();
  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPort();
  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);
  public interface PortNested<N> extends Nested<N>,V1ServiceBackendPortFluent<V1IngressServiceBackendFluent.PortNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}