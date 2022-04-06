package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1KeyToPathFluent<A extends V1KeyToPathFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(java.lang.String key);
  public Boolean hasKey();
  public Integer getMode();
  public A withMode(java.lang.Integer mode);
  public java.lang.Boolean hasMode();
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
}