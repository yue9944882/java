package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ResourceMetricStatusFluent<A extends V2beta2ResourceMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent();
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();
  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  public String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public interface CurrentNested<N> extends Nested<N>,V2beta2MetricValueStatusFluent<V2beta2ResourceMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  
}