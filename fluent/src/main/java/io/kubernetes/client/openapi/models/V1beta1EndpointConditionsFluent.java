package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1EndpointConditionsFluent<A extends V1beta1EndpointConditionsFluent<A>> extends Fluent<A>{
  public Boolean getReady();
  public A withReady(java.lang.Boolean ready);
  public java.lang.Boolean hasReady();
  public java.lang.Boolean getServing();
  public A withServing(java.lang.Boolean serving);
  public java.lang.Boolean hasServing();
  public java.lang.Boolean getTerminating();
  public A withTerminating(java.lang.Boolean terminating);
  public java.lang.Boolean hasTerminating();
  public A withReady();
  public A withServing();
  public A withTerminating();
  
}