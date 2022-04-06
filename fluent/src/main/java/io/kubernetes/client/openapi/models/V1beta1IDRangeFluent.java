package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1IDRangeFluent<A extends V1beta1IDRangeFluent<A>> extends Fluent<A>{
  public Long getMax();
  public A withMax(java.lang.Long max);
  public Boolean hasMax();
  public java.lang.Long getMin();
  public A withMin(java.lang.Long min);
  public java.lang.Boolean hasMin();
  
}