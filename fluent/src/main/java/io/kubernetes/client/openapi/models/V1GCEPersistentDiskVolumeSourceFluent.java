package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GCEPersistentDiskVolumeSourceFluent<A extends V1GCEPersistentDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(java.lang.String fsType);
  public Boolean hasFsType();
  public Integer getPartition();
  public A withPartition(java.lang.Integer partition);
  public java.lang.Boolean hasPartition();
  public java.lang.String getPdName();
  public A withPdName(java.lang.String pdName);
  public java.lang.Boolean hasPdName();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public A withReadOnly();
  
}