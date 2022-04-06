package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TypedLocalObjectReferenceFluent<A extends V1TypedLocalObjectReferenceFluent<A>> extends Fluent<A>{
  public String getApiGroup();
  public A withApiGroup(java.lang.String apiGroup);
  public Boolean hasApiGroup();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
}