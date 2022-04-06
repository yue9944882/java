package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface CoreV1EndpointPortFluent<A extends CoreV1EndpointPortFluent<A>> extends Fluent<A>{
  public String getAppProtocol();
  public A withAppProtocol(java.lang.String appProtocol);
  public Boolean hasAppProtocol();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public CoreV1EndpointPort.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.CoreV1EndpointPort.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  
}