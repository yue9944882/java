package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ObjectFieldSelectorFluent<A extends V1ObjectFieldSelectorFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getFieldPath();
  public A withFieldPath(java.lang.String fieldPath);
  public java.lang.Boolean hasFieldPath();
  
}