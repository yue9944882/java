package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PortStatusFluent<A extends V1PortStatusFluent<A>> extends Fluent<A>{
  public String getError();
  public A withError(java.lang.String error);
  public Boolean hasError();
  public Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public V1PortStatus.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.V1PortStatus.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  
}