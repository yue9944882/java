package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NFSVolumeSourceFluent<A extends V1NFSVolumeSourceFluent<A>> extends Fluent<A>{
  public String getPath();
  public A withPath(java.lang.String path);
  public Boolean hasPath();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getServer();
  public A withServer(java.lang.String server);
  public java.lang.Boolean hasServer();
  public A withReadOnly();
  
}