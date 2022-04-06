package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1ResourceRequirementsFluent<A extends V1ResourceRequirementsFluent<A>> extends Fluent<A>{
  public A addToLimits(String key,Quantity value);
  public A addToLimits(Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public A removeFromLimits(java.lang.String key);
  public A removeFromLimits(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getLimits();
  public <K,V>A withLimits(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> limits);
  public Boolean hasLimits();
  public A addToRequests(java.lang.String key,io.kubernetes.client.custom.Quantity value);
  public A addToRequests(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public A removeFromRequests(java.lang.String key);
  public A removeFromRequests(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getRequests();
  public <K,V>A withRequests(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> requests);
  public java.lang.Boolean hasRequests();
  
}