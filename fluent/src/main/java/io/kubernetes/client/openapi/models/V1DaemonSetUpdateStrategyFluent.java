package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetUpdateStrategyFluent<A extends V1DaemonSetUpdateStrategyFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDaemonSet getRollingUpdate();
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet buildRollingUpdate();
  public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet rollingUpdate);
  public Boolean hasRollingUpdate();
  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item);
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item);
  public V1DaemonSetUpdateStrategy.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum type);
  public java.lang.Boolean hasType();
  public interface RollingUpdateNested<N> extends Nested<N>,V1RollingUpdateDaemonSetFluent<V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}