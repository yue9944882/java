package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1AllowedHostPathFluent<A extends V1beta1AllowedHostPathFluent<A>> extends Fluent<A>{
  public String getPathPrefix();
  public A withPathPrefix(java.lang.String pathPrefix);
  public Boolean hasPathPrefix();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public A withReadOnly();
  
}