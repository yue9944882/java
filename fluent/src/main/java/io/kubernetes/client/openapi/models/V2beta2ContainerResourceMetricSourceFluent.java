package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ContainerResourceMetricSourceFluent<A extends V2beta2ContainerResourceMetricSourceFluent<A>> extends Fluent<A>{
  public String getContainer();
  public A withContainer(java.lang.String container);
  public Boolean hasContainer();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricTarget getTarget();
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target);
  public java.lang.Boolean hasTarget();
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public interface TargetNested<N> extends Nested<N>,V2beta2MetricTargetFluent<V2beta2ContainerResourceMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}