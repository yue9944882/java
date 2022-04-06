package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GroupVersionForDiscoveryFluent<A extends V1GroupVersionForDiscoveryFluent<A>> extends Fluent<A>{
  public String getGroupVersion();
  public A withGroupVersion(java.lang.String groupVersion);
  public Boolean hasGroupVersion();
  public java.lang.String getVersion();
  public A withVersion(java.lang.String version);
  public java.lang.Boolean hasVersion();
  
}