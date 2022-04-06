package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceFieldSelectorFluent<A extends V1ResourceFieldSelectorFluent<A>> extends Fluent<A>{
  public String getContainerName();
  public A withContainerName(java.lang.String containerName);
  public Boolean hasContainerName();
  public Quantity getDivisor();
  public A withDivisor(io.kubernetes.client.custom.Quantity divisor);
  public java.lang.Boolean hasDivisor();
  public A withNewDivisor(java.lang.String value);
  public java.lang.String getResource();
  public A withResource(java.lang.String resource);
  public java.lang.Boolean hasResource();
  
}