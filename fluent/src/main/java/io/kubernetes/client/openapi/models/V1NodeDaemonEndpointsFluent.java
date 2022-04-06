package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeDaemonEndpointsFluent<A extends V1NodeDaemonEndpointsFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildKubeletEndpoint instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonEndpoint getKubeletEndpoint();
  public io.kubernetes.client.openapi.models.V1DaemonEndpoint buildKubeletEndpoint();
  public A withKubeletEndpoint(io.kubernetes.client.openapi.models.V1DaemonEndpoint kubeletEndpoint);
  public Boolean hasKubeletEndpoint();
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint();
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint();
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint();
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);
  public interface KubeletEndpointNested<N> extends Nested<N>,V1DaemonEndpointFluent<V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>>{
    public N and();
    public N endKubeletEndpoint();
    
  }
  
}