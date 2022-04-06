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
public interface V1LimitRangeSpecFluent<A extends V1LimitRangeSpecFluent<A>> extends Fluent<A>{
  public A addToLimits(Integer index,V1LimitRangeItem item);
  public A setToLimits(java.lang.Integer index,io.kubernetes.client.openapi.models.V1LimitRangeItem item);
  public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
  public A addAllToLimits(Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);
  public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
  public A removeAllFromLimits(java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);
  public A removeMatchingFromLimits(Predicate<V1LimitRangeItemBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildLimits instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1LimitRangeItem> getLimits();
  public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> buildLimits();
  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLimit(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildFirstLimit();
  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLastLimit();
  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
  public Boolean hasMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
  public A withLimits(java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> limits);
  public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits);
  public java.lang.Boolean hasLimits();
  public V1LimitRangeSpecFluent.LimitsNested<A> addNewLimit();
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(io.kubernetes.client.openapi.models.V1LimitRangeItem item);
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1LimitRangeItem item);
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLimit(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editFirstLimit();
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLastLimit();
  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
  public interface LimitsNested<N> extends Nested<N>,V1LimitRangeItemFluent<V1LimitRangeSpecFluent.LimitsNested<N>>{
    public N and();
    public N endLimit();
    
  }
  
}