package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ExternalMetricStatusFluent<A extends V2ExternalMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();
  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent();
  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.CurrentNested<A> editCurrent();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2MetricIdentifier getMetric();
  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();
  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);
  public java.lang.Boolean hasMetric();
  public V2ExternalMetricStatusFluent.MetricNested<A> withNewMetric();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.MetricNested<A> editMetric();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);
  public interface CurrentNested<N> extends Nested<N>,V2MetricValueStatusFluent<V2ExternalMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,V2MetricIdentifierFluent<V2ExternalMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}