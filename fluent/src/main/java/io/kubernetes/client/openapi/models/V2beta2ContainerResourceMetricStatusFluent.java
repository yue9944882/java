package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ContainerResourceMetricStatusFluent<A extends V2beta2ContainerResourceMetricStatusFluent<A>> extends Fluent<A>{
  public String getContainer();
  public A withContainer(java.lang.String container);
  public Boolean hasContainer();
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent();
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();
  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);
  public java.lang.Boolean hasCurrent();
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public interface CurrentNested<N> extends Nested<N>,V2beta2MetricValueStatusFluent<V2beta2ContainerResourceMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  
}