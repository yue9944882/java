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
public interface V1ServiceStatusFluent<A extends V1ServiceStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1Condition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1Condition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A addAllToConditions(Collection<io.kubernetes.client.openapi.models.V1Condition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items);
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1Condition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> buildConditions();
  public io.kubernetes.client.openapi.models.V1Condition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1Condition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1Condition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1Condition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  public Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1Condition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions);
  public java.lang.Boolean hasConditions();
  public V1ServiceStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1Condition item);
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1Condition item);
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1LoadBalancerStatus getLoadBalancer();
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus buildLoadBalancer();
  public A withLoadBalancer(io.kubernetes.client.openapi.models.V1LoadBalancerStatus loadBalancer);
  public java.lang.Boolean hasLoadBalancer();
  public V1ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.LoadBalancerNested<A> editLoadBalancer();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
  public io.kubernetes.client.openapi.models.V1ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);
  public interface ConditionsNested<N> extends Nested<N>,V1ConditionFluent<V1ServiceStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface LoadBalancerNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1LoadBalancerStatusFluent<V1ServiceStatusFluent.LoadBalancerNested<N>>{
    public N and();
    public N endLoadBalancer();
    
  }
  
}