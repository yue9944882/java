package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStateWaitingFluent<A extends V1ContainerStateWaitingFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(java.lang.String message);
  public Boolean hasMessage();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
}