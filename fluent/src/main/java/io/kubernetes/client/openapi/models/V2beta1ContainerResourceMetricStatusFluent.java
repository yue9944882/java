package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta1ContainerResourceMetricStatusFluent<A extends V2beta1ContainerResourceMetricStatusFluent<A>> extends Fluent<A>{
  public String getContainer();
  public A withContainer(java.lang.String container);
  public Boolean hasContainer();
  public Integer getCurrentAverageUtilization();
  public A withCurrentAverageUtilization(java.lang.Integer currentAverageUtilization);
  public java.lang.Boolean hasCurrentAverageUtilization();
  public Quantity getCurrentAverageValue();
  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);
  public java.lang.Boolean hasCurrentAverageValue();
  public A withNewCurrentAverageValue(java.lang.String value);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
}