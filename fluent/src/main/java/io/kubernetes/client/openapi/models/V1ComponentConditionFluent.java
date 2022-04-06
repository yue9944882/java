package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ComponentConditionFluent<A extends V1ComponentConditionFluent<A>> extends Fluent<A>{
  public String getError();
  public A withError(java.lang.String error);
  public Boolean hasError();
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  public java.lang.String getStatus();
  public A withStatus(java.lang.String status);
  public java.lang.Boolean hasStatus();
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
}