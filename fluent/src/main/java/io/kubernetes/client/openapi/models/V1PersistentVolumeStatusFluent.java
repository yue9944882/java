package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeStatusFluent<A extends V1PersistentVolumeStatusFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(java.lang.String message);
  public Boolean hasMessage();
  public V1PersistentVolumeStatus.PhaseEnum getPhase();
  public A withPhase(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus.PhaseEnum phase);
  public java.lang.Boolean hasPhase();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
}