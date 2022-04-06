package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimVolumeSourceFluent<A extends V1PersistentVolumeClaimVolumeSourceFluent<A>> extends Fluent<A>{
  public String getClaimName();
  public A withClaimName(java.lang.String claimName);
  public Boolean hasClaimName();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public A withReadOnly();
  
}