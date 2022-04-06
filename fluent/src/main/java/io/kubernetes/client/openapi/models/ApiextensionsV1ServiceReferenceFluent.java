package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface ApiextensionsV1ServiceReferenceFluent<A extends ApiextensionsV1ServiceReferenceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  public Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  
}