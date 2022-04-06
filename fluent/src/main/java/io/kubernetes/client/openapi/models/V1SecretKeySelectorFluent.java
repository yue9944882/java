package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SecretKeySelectorFluent<A extends V1SecretKeySelectorFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(java.lang.String key);
  public Boolean hasKey();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.Boolean getOptional();
  public A withOptional(java.lang.Boolean optional);
  public java.lang.Boolean hasOptional();
  public A withOptional();
  
}