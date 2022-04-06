package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GRPCActionFluent<A extends V1GRPCActionFluent<A>> extends Fluent<A>{
  public Integer getPort();
  public A withPort(java.lang.Integer port);
  public Boolean hasPort();
  public String getService();
  public A withService(java.lang.String service);
  public java.lang.Boolean hasService();
  
}