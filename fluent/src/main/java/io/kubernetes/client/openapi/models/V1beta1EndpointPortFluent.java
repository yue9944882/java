package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1EndpointPortFluent<A extends V1beta1EndpointPortFluent<A>> extends Fluent<A>{
  public String getAppProtocol();
  public A withAppProtocol(java.lang.String appProtocol);
  public Boolean hasAppProtocol();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public java.lang.String getProtocol();
  public A withProtocol(java.lang.String protocol);
  public java.lang.Boolean hasProtocol();
  
}