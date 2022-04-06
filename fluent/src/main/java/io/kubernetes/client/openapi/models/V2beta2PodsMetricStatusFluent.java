package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2PodsMetricStatusFluent<A extends V2beta2PodsMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent();
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();
  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2beta2PodsMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A> editCurrent();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2MetricIdentifier getMetric();
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric();
  public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric);
  public java.lang.Boolean hasMetric();
  public V2beta2PodsMetricStatusFluent.MetricNested<A> withNewMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A> editMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
  public interface CurrentNested<N> extends Nested<N>,V2beta2MetricValueStatusFluent<V2beta2PodsMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,V2beta2MetricIdentifierFluent<V2beta2PodsMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}