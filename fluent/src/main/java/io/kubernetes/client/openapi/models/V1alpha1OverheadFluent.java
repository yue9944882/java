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
public interface V1alpha1OverheadFluent<A extends V1alpha1OverheadFluent<A>> extends Fluent<A>{
  public A addToPodFixed(String key,Quantity value);
  public A addToPodFixed(Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public A removeFromPodFixed(java.lang.String key);
  public A removeFromPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getPodFixed();
  public <K,V>A withPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> podFixed);
  public Boolean hasPodFixed();
  
}