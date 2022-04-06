package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LoadBalancerIngressFluent<A extends V1LoadBalancerIngressFluent<A>> extends Fluent<A>{
  public String getHostname();
  public A withHostname(java.lang.String hostname);
  public Boolean hasHostname();
  public java.lang.String getIp();
  public A withIp(java.lang.String ip);
  public java.lang.Boolean hasIp();
  public A addToPorts(Integer index,V1PortStatus item);
  public A setToPorts(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PortStatus item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);
  public A addAllToPorts(Collection<io.kubernetes.client.openapi.models.V1PortStatus> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);
  public A removeAllFromPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1PortStatus> items);
  public A removeMatchingFromPorts(Predicate<V1PortStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1PortStatus> getPorts();
  public java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> buildPorts();
  public io.kubernetes.client.openapi.models.V1PortStatus buildPort(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1PortStatus buildFirstPort();
  public io.kubernetes.client.openapi.models.V1PortStatus buildLastPort();
  public io.kubernetes.client.openapi.models.V1PortStatus buildMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder> predicate);
  public java.lang.Boolean hasMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder> predicate);
  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports);
  public java.lang.Boolean hasPorts();
  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPort();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> addNewPortLike(io.kubernetes.client.openapi.models.V1PortStatus item);
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> setNewPortLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PortStatus item);
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editPort(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editFirstPort();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editLastPort();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder> predicate);
  public interface PortsNested<N> extends Nested<N>,V1PortStatusFluent<V1LoadBalancerIngressFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}