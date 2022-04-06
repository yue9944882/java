package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SeccompProfileFluent<A extends V1SeccompProfileFluent<A>> extends Fluent<A>{
  public String getLocalhostProfile();
  public A withLocalhostProfile(java.lang.String localhostProfile);
  public Boolean hasLocalhostProfile();
  public V1SeccompProfile.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type);
  public java.lang.Boolean hasType();
  
}