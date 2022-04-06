package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PreconditionsFluent<A extends V1PreconditionsFluent<A>> extends Fluent<A>{
  public String getResourceVersion();
  public A withResourceVersion(java.lang.String resourceVersion);
  public Boolean hasResourceVersion();
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  
}