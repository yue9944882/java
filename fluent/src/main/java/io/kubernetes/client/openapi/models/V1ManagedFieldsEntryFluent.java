package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ManagedFieldsEntryFluent<A extends V1ManagedFieldsEntryFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getFieldsType();
  public A withFieldsType(java.lang.String fieldsType);
  public java.lang.Boolean hasFieldsType();
  public Object getFieldsV1();
  public A withFieldsV1(java.lang.Object fieldsV1);
  public java.lang.Boolean hasFieldsV1();
  public java.lang.String getManager();
  public A withManager(java.lang.String manager);
  public java.lang.Boolean hasManager();
  public java.lang.String getOperation();
  public A withOperation(java.lang.String operation);
  public java.lang.Boolean hasOperation();
  public java.lang.String getSubresource();
  public A withSubresource(java.lang.String subresource);
  public java.lang.Boolean hasSubresource();
  public OffsetDateTime getTime();
  public A withTime(java.time.OffsetDateTime time);
  public java.lang.Boolean hasTime();
  
}