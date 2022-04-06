package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TolerationFluent<A extends V1TolerationFluent<A>> extends Fluent<A>{
  public V1Toleration.EffectEnum getEffect();
  public A withEffect(io.kubernetes.client.openapi.models.V1Toleration.EffectEnum effect);
  public Boolean hasEffect();
  public String getKey();
  public A withKey(java.lang.String key);
  public java.lang.Boolean hasKey();
  public V1Toleration.OperatorEnum getOperator();
  public A withOperator(io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum operator);
  public java.lang.Boolean hasOperator();
  public Long getTolerationSeconds();
  public A withTolerationSeconds(java.lang.Long tolerationSeconds);
  public java.lang.Boolean hasTolerationSeconds();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
}