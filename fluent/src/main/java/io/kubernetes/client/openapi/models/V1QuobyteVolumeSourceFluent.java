package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1QuobyteVolumeSourceFluent<A extends V1QuobyteVolumeSourceFluent<A>> extends Fluent<A>{
  public String getGroup();
  public A withGroup(java.lang.String group);
  public Boolean hasGroup();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getRegistry();
  public A withRegistry(java.lang.String registry);
  public java.lang.Boolean hasRegistry();
  public java.lang.String getTenant();
  public A withTenant(java.lang.String tenant);
  public java.lang.Boolean hasTenant();
  public java.lang.String getUser();
  public A withUser(java.lang.String user);
  public java.lang.Boolean hasUser();
  public java.lang.String getVolume();
  public A withVolume(java.lang.String volume);
  public java.lang.Boolean hasVolume();
  public A withReadOnly();
  
}