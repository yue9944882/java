package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta1ResourceMetricSourceFluent<A extends V2beta1ResourceMetricSourceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  public Integer getTargetAverageUtilization();
  public A withTargetAverageUtilization(java.lang.Integer targetAverageUtilization);
  public java.lang.Boolean hasTargetAverageUtilization();
  public Quantity getTargetAverageValue();
  public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);
  public java.lang.Boolean hasTargetAverageValue();
  public A withNewTargetAverageValue(java.lang.String value);
  
}