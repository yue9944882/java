package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GlusterfsVolumeSourceFluent<A extends V1GlusterfsVolumeSourceFluent<A>> extends Fluent<A>{
  public String getEndpoints();
  public A withEndpoints(java.lang.String endpoints);
  public Boolean hasEndpoints();
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public A withReadOnly();
  
}