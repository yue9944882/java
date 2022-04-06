package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WeightedPodAffinityTermFluent<A extends V1WeightedPodAffinityTermFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildPodAffinityTerm instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAffinityTerm getPodAffinityTerm();
  public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildPodAffinityTerm();
  public A withPodAffinityTerm(io.kubernetes.client.openapi.models.V1PodAffinityTerm podAffinityTerm);
  public Boolean hasPodAffinityTerm();
  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm();
  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm();
  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm();
  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
  public Integer getWeight();
  public A withWeight(java.lang.Integer weight);
  public java.lang.Boolean hasWeight();
  public interface PodAffinityTermNested<N> extends Nested<N>,V1PodAffinityTermFluent<V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>>{
    public N and();
    public N endPodAffinityTerm();
    
  }
  
}