package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HTTPIngressPathFluent<A extends V1HTTPIngressPathFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildBackend instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressBackend getBackend();
  public io.kubernetes.client.openapi.models.V1IngressBackend buildBackend();
  public A withBackend(io.kubernetes.client.openapi.models.V1IngressBackend backend);
  public Boolean hasBackend();
  public V1HTTPIngressPathFluent.BackendNested<A> withNewBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);
  public String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  public java.lang.String getPathType();
  public A withPathType(java.lang.String pathType);
  public java.lang.Boolean hasPathType();
  public interface BackendNested<N> extends Nested<N>,V1IngressBackendFluent<V1HTTPIngressPathFluent.BackendNested<N>>{
    public N and();
    public N endBackend();
    
  }
  
}