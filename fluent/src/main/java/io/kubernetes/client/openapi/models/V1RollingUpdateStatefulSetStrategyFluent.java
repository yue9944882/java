package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RollingUpdateStatefulSetStrategyFluent<A extends V1RollingUpdateStatefulSetStrategyFluent<A>> extends Fluent<A>{
  public Integer getPartition();
  public A withPartition(java.lang.Integer partition);
  public Boolean hasPartition();
  
}