package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AWSElasticBlockStoreVolumeSourceFluent<A extends V1AWSElasticBlockStoreVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(java.lang.String fsType);
  public Boolean hasFsType();
  public Integer getPartition();
  public A withPartition(java.lang.Integer partition);
  public java.lang.Boolean hasPartition();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getVolumeID();
  public A withVolumeID(java.lang.String volumeID);
  public java.lang.Boolean hasVolumeID();
  public A withReadOnly();
  
}