package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ValidationRuleFluent<A extends V1ValidationRuleFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(java.lang.String message);
  public Boolean hasMessage();
  public java.lang.String getRule();
  public A withRule(java.lang.String rule);
  public java.lang.Boolean hasRule();
  
}