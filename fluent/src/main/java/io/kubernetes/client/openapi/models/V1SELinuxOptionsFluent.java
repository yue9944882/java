package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SELinuxOptionsFluent<A extends V1SELinuxOptionsFluent<A>> extends Fluent<A>{
  public String getLevel();
  public A withLevel(java.lang.String level);
  public Boolean hasLevel();
  public java.lang.String getRole();
  public A withRole(java.lang.String role);
  public java.lang.Boolean hasRole();
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  public java.lang.String getUser();
  public A withUser(java.lang.String user);
  public java.lang.Boolean hasUser();
  
}