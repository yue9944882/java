package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DeploymentStrategyFluent<A extends V1DeploymentStrategyFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDeployment getRollingUpdate();
  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment buildRollingUpdate();
  public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment rollingUpdate);
  public Boolean hasRollingUpdate();
  public V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);
  public V1DeploymentStrategy.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1DeploymentStrategy.TypeEnum type);
  public java.lang.Boolean hasType();
  public interface RollingUpdateNested<N> extends Nested<N>,V1RollingUpdateDeploymentFluent<V1DeploymentStrategyFluent.RollingUpdateNested<N>>{
    public N and();
    public N endRollingUpdate();
    
  }
  
}