package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceColumnDefinitionFluent<A extends V1CustomResourceColumnDefinitionFluent<A>> extends Fluent<A>{
  public String getDescription();
  public A withDescription(java.lang.String description);
  public Boolean hasDescription();
  public java.lang.String getFormat();
  public A withFormat(java.lang.String format);
  public java.lang.Boolean hasFormat();
  public java.lang.String getJsonPath();
  public A withJsonPath(java.lang.String jsonPath);
  public java.lang.Boolean hasJsonPath();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public Integer getPriority();
  public A withPriority(java.lang.Integer priority);
  public java.lang.Boolean hasPriority();
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
}