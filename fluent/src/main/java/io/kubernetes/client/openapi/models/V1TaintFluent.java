package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TaintFluent<A extends V1TaintFluent<A>> extends Fluent<A>{
  public V1Taint.EffectEnum getEffect();
  public A withEffect(io.kubernetes.client.openapi.models.V1Taint.EffectEnum effect);
  public Boolean hasEffect();
  public String getKey();
  public A withKey(java.lang.String key);
  public java.lang.Boolean hasKey();
  public OffsetDateTime getTimeAdded();
  public A withTimeAdded(java.time.OffsetDateTime timeAdded);
  public java.lang.Boolean hasTimeAdded();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
}