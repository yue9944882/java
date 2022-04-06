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
public interface V1NamespaceStatusFluent<A extends V1NamespaceStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1NamespaceCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
  public A addAllToConditions(Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
  public A removeMatchingFromConditions(Predicate<V1NamespaceConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1NamespaceCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions);
  public java.lang.Boolean hasConditions();
  public V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public V1NamespaceStatus.PhaseEnum getPhase();
  public A withPhase(io.kubernetes.client.openapi.models.V1NamespaceStatus.PhaseEnum phase);
  public java.lang.Boolean hasPhase();
  public interface ConditionsNested<N> extends Nested<N>,V1NamespaceConditionFluent<V1NamespaceStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}