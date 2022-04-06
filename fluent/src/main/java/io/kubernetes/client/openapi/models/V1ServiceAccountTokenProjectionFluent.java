package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceAccountTokenProjectionFluent<A extends V1ServiceAccountTokenProjectionFluent<A>> extends Fluent<A>{
  public String getAudience();
  public A withAudience(java.lang.String audience);
  public Boolean hasAudience();
  public Long getExpirationSeconds();
  public A withExpirationSeconds(java.lang.Long expirationSeconds);
  public java.lang.Boolean hasExpirationSeconds();
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
}