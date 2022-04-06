package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1QueuingConfigurationFluent<A extends V1beta1QueuingConfigurationFluent<A>> extends Fluent<A>{
  public Integer getHandSize();
  public A withHandSize(java.lang.Integer handSize);
  public Boolean hasHandSize();
  public java.lang.Integer getQueueLengthLimit();
  public A withQueueLengthLimit(java.lang.Integer queueLengthLimit);
  public java.lang.Boolean hasQueueLengthLimit();
  public java.lang.Integer getQueues();
  public A withQueues(java.lang.Integer queues);
  public java.lang.Boolean hasQueues();
  
}