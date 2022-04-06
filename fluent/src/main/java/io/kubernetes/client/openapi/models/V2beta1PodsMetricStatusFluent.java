package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta1PodsMetricStatusFluent<A extends V2beta1PodsMetricStatusFluent<A>> extends Fluent<A>{
  public Quantity getCurrentAverageValue();
  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);
  public Boolean hasCurrentAverageValue();
  public A withNewCurrentAverageValue(String value);
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
  public V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V2beta1PodsMetricStatusFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}