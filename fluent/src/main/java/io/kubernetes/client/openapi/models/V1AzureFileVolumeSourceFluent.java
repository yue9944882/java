package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AzureFileVolumeSourceFluent<A extends V1AzureFileVolumeSourceFluent<A>> extends Fluent<A>{
  public Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public String getSecretName();
  public A withSecretName(java.lang.String secretName);
  public java.lang.Boolean hasSecretName();
  public java.lang.String getShareName();
  public A withShareName(java.lang.String shareName);
  public java.lang.Boolean hasShareName();
  public A withReadOnly();
  
}