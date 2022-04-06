package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeAddressFluent<A extends V1NodeAddressFluent<A>> extends Fluent<A>{
  public String getAddress();
  public A withAddress(java.lang.String address);
  public Boolean hasAddress();
  public V1NodeAddress.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type);
  public java.lang.Boolean hasType();
  
}