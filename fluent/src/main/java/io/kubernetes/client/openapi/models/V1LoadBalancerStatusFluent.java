package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1LoadBalancerStatusFluent<A extends V1LoadBalancerStatusFluent<A>> extends Fluent<A>{
  public A addToIngress(Integer index,V1LoadBalancerIngress item);
  public A setToIngress(java.lang.Integer index,io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);
  public A addToIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);
  public A addAllToIngress(Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items);
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);
  public A removeAllFromIngress(java.util.Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items);
  public A removeMatchingFromIngress(Predicate<V1LoadBalancerIngressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildIngress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> getIngress();
  public java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> buildIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildIngress(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildFirstIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildLastIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildMatchingIngress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> predicate);
  public Boolean hasMatchingIngress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> predicate);
  public A withIngress(java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> ingress);
  public A withIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... ingress);
  public java.lang.Boolean hasIngress();
  public V1LoadBalancerStatusFluent.IngressNested<A> addNewIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> editIngress(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> editFirstIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> editLastIngress();
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> predicate);
  public interface IngressNested<N> extends Nested<N>,V1LoadBalancerIngressFluent<V1LoadBalancerStatusFluent.IngressNested<N>>{
    public N and();
    public N endIngress();
    
  }
  
}