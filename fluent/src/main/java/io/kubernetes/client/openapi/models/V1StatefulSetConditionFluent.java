package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetConditionFluent<A extends V1StatefulSetConditionFluent<A>> extends Fluent<A>{
  public OffsetDateTime getLastTransitionTime();
  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime);
  public Boolean hasLastTransitionTime();
  public String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  public java.lang.String getStatus();
  public A withStatus(java.lang.String status);
  public java.lang.Boolean hasStatus();
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
}