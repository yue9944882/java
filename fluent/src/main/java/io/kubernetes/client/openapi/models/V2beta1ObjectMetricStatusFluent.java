package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta1ObjectMetricStatusFluent<A extends V2beta1ObjectMetricStatusFluent<A>> extends Fluent<A>{
  public Quantity getAverageValue();
  public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue);
  public Boolean hasAverageValue();
  public A withNewAverageValue(String value);
  public io.kubernetes.client.custom.Quantity getCurrentValue();
  public A withCurrentValue(io.kubernetes.client.custom.Quantity currentValue);
  public java.lang.Boolean hasCurrentValue();
  public A withNewCurrentValue(java.lang.String value);
  public java.lang.String getMetricName();
  public A withMetricName(java.lang.String metricName);
  public java.lang.Boolean hasMetricName();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public V2beta1ObjectMetricStatusFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta1CrossVersionObjectReference getTarget();
  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference target);
  public java.lang.Boolean hasTarget();
  public V2beta1ObjectMetricStatusFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V2beta1ObjectMetricStatusFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,V2beta1CrossVersionObjectReferenceFluent<V2beta1ObjectMetricStatusFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}