package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TokenRequestStatusFluent<A extends V1TokenRequestStatusFluent<A>> extends Fluent<A>{
  public OffsetDateTime getExpirationTimestamp();
  public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp);
  public Boolean hasExpirationTimestamp();
  public String getToken();
  public A withToken(java.lang.String token);
  public java.lang.Boolean hasToken();
  
}