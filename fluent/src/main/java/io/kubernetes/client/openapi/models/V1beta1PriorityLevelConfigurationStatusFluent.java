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
public interface V1beta1PriorityLevelConfigurationStatusFluent<A extends V1beta1PriorityLevelConfigurationStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1beta1PriorityLevelConfigurationCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items);
  public A addAllToConditions(Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items);
  public A removeMatchingFromConditions(Predicate<V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
  public Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... conditions);
  public java.lang.Boolean hasConditions();
  public V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item);
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1beta1PriorityLevelConfigurationConditionFluent<V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}