package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerPortFluent<A extends V1ContainerPortFluent<A>> extends Fluent<A>{
  public Integer getContainerPort();
  public A withContainerPort(java.lang.Integer containerPort);
  public Boolean hasContainerPort();
  public String getHostIP();
  public A withHostIP(java.lang.String hostIP);
  public java.lang.Boolean hasHostIP();
  public java.lang.Integer getHostPort();
  public A withHostPort(java.lang.Integer hostPort);
  public java.lang.Boolean hasHostPort();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public V1ContainerPort.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  
}