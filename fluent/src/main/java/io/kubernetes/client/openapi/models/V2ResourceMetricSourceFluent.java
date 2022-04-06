package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ResourceMetricSourceFluent<A extends V2ResourceMetricSourceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();
  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target);
  public java.lang.Boolean hasTarget();
  public V2ResourceMetricSourceFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);
  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);
  public interface TargetNested<N> extends Nested<N>,V2MetricTargetFluent<V2ResourceMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}