package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatusCauseFluent<A extends V1StatusCauseFluent<A>> extends Fluent<A>{
  public String getField();
  public A withField(java.lang.String field);
  public Boolean hasField();
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
}