package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodDNSConfigOptionFluent<A extends V1PodDNSConfigOptionFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
}