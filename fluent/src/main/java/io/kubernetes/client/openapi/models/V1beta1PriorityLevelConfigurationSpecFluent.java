package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1PriorityLevelConfigurationSpecFluent<A extends V1beta1PriorityLevelConfigurationSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLimited instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1LimitedPriorityLevelConfiguration getLimited();
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration buildLimited();
  public A withLimited(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration limited);
  public Boolean hasLimited();
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited();
  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);
  public String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  public interface LimitedNested<N> extends Nested<N>,V1beta1LimitedPriorityLevelConfigurationFluent<V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<N>>{
    public N and();
    public N endLimited();
    
  }
  
}