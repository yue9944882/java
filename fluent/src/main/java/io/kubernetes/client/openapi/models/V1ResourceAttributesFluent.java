package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceAttributesFluent<A extends V1ResourceAttributesFluent<A>> extends Fluent<A>{
  public String getGroup();
  public A withGroup(java.lang.String group);
  public Boolean hasGroup();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  public java.lang.String getResource();
  public A withResource(java.lang.String resource);
  public java.lang.Boolean hasResource();
  public java.lang.String getSubresource();
  public A withSubresource(java.lang.String subresource);
  public java.lang.Boolean hasSubresource();
  public java.lang.String getVerb();
  public A withVerb(java.lang.String verb);
  public java.lang.Boolean hasVerb();
  public java.lang.String getVersion();
  public A withVersion(java.lang.String version);
  public java.lang.Boolean hasVersion();
  
}