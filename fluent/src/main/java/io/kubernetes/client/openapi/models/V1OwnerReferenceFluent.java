package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1OwnerReferenceFluent<A extends V1OwnerReferenceFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.Boolean getBlockOwnerDeletion();
  public A withBlockOwnerDeletion(java.lang.Boolean blockOwnerDeletion);
  public java.lang.Boolean hasBlockOwnerDeletion();
  public java.lang.Boolean getController();
  public A withController(java.lang.Boolean controller);
  public java.lang.Boolean hasController();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  public A withBlockOwnerDeletion();
  public A withController();
  
}