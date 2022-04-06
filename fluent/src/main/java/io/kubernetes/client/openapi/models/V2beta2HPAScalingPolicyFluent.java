package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2HPAScalingPolicyFluent<A extends V2beta2HPAScalingPolicyFluent<A>> extends Fluent<A>{
  public Integer getPeriodSeconds();
  public A withPeriodSeconds(java.lang.Integer periodSeconds);
  public Boolean hasPeriodSeconds();
  public String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  public java.lang.Integer getValue();
  public A withValue(java.lang.Integer value);
  public java.lang.Boolean hasValue();
  
}