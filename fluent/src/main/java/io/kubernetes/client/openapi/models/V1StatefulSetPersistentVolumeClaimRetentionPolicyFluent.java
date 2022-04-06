package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>> extends Fluent<A>{
  public String getWhenDeleted();
  public A withWhenDeleted(java.lang.String whenDeleted);
  public Boolean hasWhenDeleted();
  public java.lang.String getWhenScaled();
  public A withWhenScaled(java.lang.String whenScaled);
  public java.lang.Boolean hasWhenScaled();
  
}