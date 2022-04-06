package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ResourceMetricSourceFluent<A extends V2beta2ResourceMetricSourceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricTarget getTarget();
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target);
  public java.lang.Boolean hasTarget();
  public V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public interface TargetNested<N> extends Nested<N>,V2beta2MetricTargetFluent<V2beta2ResourceMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}