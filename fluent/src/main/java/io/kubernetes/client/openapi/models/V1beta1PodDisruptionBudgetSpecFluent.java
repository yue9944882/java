package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1PodDisruptionBudgetSpecFluent<A extends V1beta1PodDisruptionBudgetSpecFluent<A>> extends Fluent<A>{
  public IntOrString getMaxUnavailable();
  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable);
  public Boolean hasMaxUnavailable();
  public A withNewMaxUnavailable(int value);
  public A withNewMaxUnavailable(String value);
  public io.kubernetes.client.custom.IntOrString getMinAvailable();
  public A withMinAvailable(io.kubernetes.client.custom.IntOrString minAvailable);
  public java.lang.Boolean hasMinAvailable();
  public A withNewMinAvailable(int value);
  public A withNewMinAvailable(java.lang.String value);
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}