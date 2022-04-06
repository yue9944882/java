package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HorizontalPodAutoscalerSpecFluent<A extends V1HorizontalPodAutoscalerSpecFluent<A>> extends Fluent<A>{
  public Integer getMaxReplicas();
  public A withMaxReplicas(java.lang.Integer maxReplicas);
  public Boolean hasMaxReplicas();
  public java.lang.Integer getMinReplicas();
  public A withMinReplicas(java.lang.Integer minReplicas);
  public java.lang.Boolean hasMinReplicas();
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CrossVersionObjectReference getScaleTargetRef();
  public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference buildScaleTargetRef();
  public A withScaleTargetRef(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference scaleTargetRef);
  public java.lang.Boolean hasScaleTargetRef();
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);
  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);
  public java.lang.Integer getTargetCPUUtilizationPercentage();
  public A withTargetCPUUtilizationPercentage(java.lang.Integer targetCPUUtilizationPercentage);
  public java.lang.Boolean hasTargetCPUUtilizationPercentage();
  public interface ScaleTargetRefNested<N> extends Nested<N>,V1CrossVersionObjectReferenceFluent<V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{
    public N and();
    public N endScaleTargetRef();
    
  }
  
}