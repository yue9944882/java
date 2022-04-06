package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeMountFluent<A extends V1VolumeMountFluent<A>> extends Fluent<A>{
  public String getMountPath();
  public A withMountPath(java.lang.String mountPath);
  public Boolean hasMountPath();
  public java.lang.String getMountPropagation();
  public A withMountPropagation(java.lang.String mountPropagation);
  public java.lang.Boolean hasMountPropagation();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getSubPath();
  public A withSubPath(java.lang.String subPath);
  public java.lang.Boolean hasSubPath();
  public java.lang.String getSubPathExpr();
  public A withSubPathExpr(java.lang.String subPathExpr);
  public java.lang.Boolean hasSubPathExpr();
  public A withReadOnly();
  
}