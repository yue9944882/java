package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodReadinessGateFluent<A extends V1PodReadinessGateFluent<A>> extends Fluent<A>{
  public V1PodReadinessGate.ConditionTypeEnum getConditionType();
  public A withConditionType(io.kubernetes.client.openapi.models.V1PodReadinessGate.ConditionTypeEnum conditionType);
  public Boolean hasConditionType();
  
}