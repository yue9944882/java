package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2LimitedPriorityLevelConfigurationFluent<A extends V1beta2LimitedPriorityLevelConfigurationFluent<A>> extends Fluent<A>{
  public Integer getAssuredConcurrencyShares();
  public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares);
  public Boolean hasAssuredConcurrencyShares();
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2LimitResponse getLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponse buildLimitResponse();
  public A withLimitResponse(io.kubernetes.client.openapi.models.V1beta2LimitResponse limitResponse);
  public java.lang.Boolean hasLimitResponse();
  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);
  public interface LimitResponseNested<N> extends Nested<N>,V1beta2LimitResponseFluent<V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>{
    public N and();
    public N endLimitResponse();
    
  }
  
}