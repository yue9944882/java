package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HorizontalPodAutoscalerStatusFluent<A extends V1HorizontalPodAutoscalerStatusFluent<A>> extends Fluent<A>{
  public Integer getCurrentCPUUtilizationPercentage();
  public A withCurrentCPUUtilizationPercentage(java.lang.Integer currentCPUUtilizationPercentage);
  public Boolean hasCurrentCPUUtilizationPercentage();
  public java.lang.Integer getCurrentReplicas();
  public A withCurrentReplicas(java.lang.Integer currentReplicas);
  public java.lang.Boolean hasCurrentReplicas();
  public java.lang.Integer getDesiredReplicas();
  public A withDesiredReplicas(java.lang.Integer desiredReplicas);
  public java.lang.Boolean hasDesiredReplicas();
  public OffsetDateTime getLastScaleTime();
  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime);
  public java.lang.Boolean hasLastScaleTime();
  public Long getObservedGeneration();
  public A withObservedGeneration(java.lang.Long observedGeneration);
  public java.lang.Boolean hasObservedGeneration();
  
}