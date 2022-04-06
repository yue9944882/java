package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PhotonPersistentDiskVolumeSourceFluent<A extends V1PhotonPersistentDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(java.lang.String fsType);
  public Boolean hasFsType();
  public java.lang.String getPdID();
  public A withPdID(java.lang.String pdID);
  public java.lang.Boolean hasPdID();
  
}