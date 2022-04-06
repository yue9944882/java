package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RollingUpdateDaemonSetFluent<A extends V1RollingUpdateDaemonSetFluent<A>> extends Fluent<A>{
  public IntOrString getMaxSurge();
  public A withMaxSurge(io.kubernetes.client.custom.IntOrString maxSurge);
  public Boolean hasMaxSurge();
  public A withNewMaxSurge(int value);
  public A withNewMaxSurge(String value);
  public io.kubernetes.client.custom.IntOrString getMaxUnavailable();
  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable);
  public java.lang.Boolean hasMaxUnavailable();
  public A withNewMaxUnavailable(int value);
  public A withNewMaxUnavailable(java.lang.String value);
  
}