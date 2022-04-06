package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricIdentifierFluent<A extends V2MetricIdentifierFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public V2MetricIdentifierFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V2MetricIdentifierFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}