package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1HostPortRangeFluent<A extends V1beta1HostPortRangeFluent<A>> extends Fluent<A>{
  public Integer getMax();
  public A withMax(java.lang.Integer max);
  public Boolean hasMax();
  public java.lang.Integer getMin();
  public A withMin(java.lang.Integer min);
  public java.lang.Boolean hasMin();
  
}