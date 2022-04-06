package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AzureDiskVolumeSourceFluent<A extends V1AzureDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getCachingMode();
  public A withCachingMode(java.lang.String cachingMode);
  public Boolean hasCachingMode();
  public java.lang.String getDiskName();
  public A withDiskName(java.lang.String diskName);
  public java.lang.Boolean hasDiskName();
  public java.lang.String getDiskURI();
  public A withDiskURI(java.lang.String diskURI);
  public java.lang.Boolean hasDiskURI();
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public A withReadOnly();
  
}