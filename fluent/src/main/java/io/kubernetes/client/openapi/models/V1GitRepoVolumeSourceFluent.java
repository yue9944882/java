package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GitRepoVolumeSourceFluent<A extends V1GitRepoVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDirectory();
  public A withDirectory(java.lang.String directory);
  public Boolean hasDirectory();
  public java.lang.String getRepository();
  public A withRepository(java.lang.String repository);
  public java.lang.Boolean hasRepository();
  public java.lang.String getRevision();
  public A withRevision(java.lang.String revision);
  public java.lang.Boolean hasRevision();
  
}