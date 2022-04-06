package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TaintFluentImpl<A extends V1TaintFluent<A>> extends BaseFluent<A> implements V1TaintFluent<A>{
  public V1TaintFluentImpl() {
  }
  public V1TaintFluentImpl(io.kubernetes.client.openapi.models.V1Taint instance) {
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withTimeAdded(instance.getTimeAdded());

    this.withValue(instance.getValue());

  }
  private V1Taint.EffectEnum effect;
  private String key;
  private OffsetDateTime timeAdded;
  private java.lang.String value;
  public io.kubernetes.client.openapi.models.V1Taint.EffectEnum getEffect() {
    return this.effect;
  }
  public A withEffect(io.kubernetes.client.openapi.models.V1Taint.EffectEnum effect) {
    this.effect=effect; return (A) this;
  }
  public Boolean hasEffect() {
    return this.effect != null;
  }
  public java.lang.String getKey() {
    return this.key;
  }
  public A withKey(java.lang.String key) {
    this.key=key; return (A) this;
  }
  public java.lang.Boolean hasKey() {
    return this.key != null;
  }
  public java.time.OffsetDateTime getTimeAdded() {
    return this.timeAdded;
  }
  public A withTimeAdded(java.time.OffsetDateTime timeAdded) {
    this.timeAdded=timeAdded; return (A) this;
  }
  public java.lang.Boolean hasTimeAdded() {
    return this.timeAdded != null;
  }
  public java.lang.String getValue() {
    return this.value;
  }
  public A withValue(java.lang.String value) {
    this.value=value; return (A) this;
  }
  public java.lang.Boolean hasValue() {
    return this.value != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TaintFluentImpl that = (V1TaintFluentImpl) o;
    if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (timeAdded != null ? !timeAdded.equals(that.timeAdded) :that.timeAdded != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(effect,  key,  timeAdded,  value,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (effect != null) { sb.append("effect:"); sb.append(effect + ","); }
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (timeAdded != null) { sb.append("timeAdded:"); sb.append(timeAdded + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  
}