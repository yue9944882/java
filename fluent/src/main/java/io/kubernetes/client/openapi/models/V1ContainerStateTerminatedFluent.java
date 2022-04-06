package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStateTerminatedFluent<A extends V1ContainerStateTerminatedFluent<A>> extends Fluent<A>{
  public String getContainerID();
  public A withContainerID(java.lang.String containerID);
  public Boolean hasContainerID();
  public Integer getExitCode();
  public A withExitCode(java.lang.Integer exitCode);
  public java.lang.Boolean hasExitCode();
  public OffsetDateTime getFinishedAt();
  public A withFinishedAt(java.time.OffsetDateTime finishedAt);
  public java.lang.Boolean hasFinishedAt();
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  public java.lang.Integer getSignal();
  public A withSignal(java.lang.Integer signal);
  public java.lang.Boolean hasSignal();
  public java.time.OffsetDateTime getStartedAt();
  public A withStartedAt(java.time.OffsetDateTime startedAt);
  public java.lang.Boolean hasStartedAt();
  
}