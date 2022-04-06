package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VsphereVirtualDiskVolumeSourceFluent<A extends V1VsphereVirtualDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(java.lang.String fsType);
  public Boolean hasFsType();
  public java.lang.String getStoragePolicyID();
  public A withStoragePolicyID(java.lang.String storagePolicyID);
  public java.lang.Boolean hasStoragePolicyID();
  public java.lang.String getStoragePolicyName();
  public A withStoragePolicyName(java.lang.String storagePolicyName);
  public java.lang.Boolean hasStoragePolicyName();
  public java.lang.String getVolumePath();
  public A withVolumePath(java.lang.String volumePath);
  public java.lang.Boolean hasVolumePath();
  
}