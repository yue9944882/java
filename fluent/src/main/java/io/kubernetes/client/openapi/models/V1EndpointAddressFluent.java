package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointAddressFluent<A extends V1EndpointAddressFluent<A>> extends Fluent<A>{
  public String getHostname();
  public A withHostname(java.lang.String hostname);
  public Boolean hasHostname();
  public java.lang.String getIp();
  public A withIp(java.lang.String ip);
  public java.lang.Boolean hasIp();
  public java.lang.String getNodeName();
  public A withNodeName(java.lang.String nodeName);
  public java.lang.Boolean hasNodeName();
  
  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef();
  public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef();
  public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef);
  public java.lang.Boolean hasTargetRef();
  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef();
  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editTargetRef();
  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef();
  public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
  public interface TargetRefNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1EndpointAddressFluent.TargetRefNested<N>>{
    public N and();
    public N endTargetRef();
    
  }
  
}