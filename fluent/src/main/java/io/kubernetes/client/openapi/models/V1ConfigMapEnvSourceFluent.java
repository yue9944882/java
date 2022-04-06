package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapEnvSourceFluent<A extends V1ConfigMapEnvSourceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  public java.lang.Boolean getOptional();
  public A withOptional(java.lang.Boolean optional);
  public java.lang.Boolean hasOptional();
  public A withOptional();
  
}