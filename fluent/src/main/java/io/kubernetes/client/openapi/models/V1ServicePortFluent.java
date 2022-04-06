package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServicePortFluent<A extends V1ServicePortFluent<A>> extends Fluent<A>{
  public String getAppProtocol();
  public A withAppProtocol(java.lang.String appProtocol);
  public Boolean hasAppProtocol();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public Integer getNodePort();
  public A withNodePort(java.lang.Integer nodePort);
  public java.lang.Boolean hasNodePort();
  public java.lang.Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public V1ServicePort.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.V1ServicePort.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  public IntOrString getTargetPort();
  public A withTargetPort(io.kubernetes.client.custom.IntOrString targetPort);
  public java.lang.Boolean hasTargetPort();
  public A withNewTargetPort(int value);
  public A withNewTargetPort(java.lang.String value);
  
}