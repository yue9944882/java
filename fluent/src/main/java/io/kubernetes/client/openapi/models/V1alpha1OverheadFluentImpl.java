package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1OverheadFluentImpl<A extends V1alpha1OverheadFluent<A>> extends BaseFluent<A> implements V1alpha1OverheadFluent<A>{
  public V1alpha1OverheadFluentImpl() {
  }
  public V1alpha1OverheadFluentImpl(io.kubernetes.client.openapi.models.V1alpha1Overhead instance) {
    this.withPodFixed(instance.getPodFixed());

  }
  private Map<String,Quantity> podFixed;
  public A addToPodFixed(java.lang.String key,io.kubernetes.client.custom.Quantity value) {
    if(this.podFixed == null && key != null && value != null) { this.podFixed = new LinkedHashMap(); }
    if(key != null && value != null) {this.podFixed.put(key, value);} return (A)this;
  }
  public A addToPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
    if(this.podFixed == null && map != null) { this.podFixed = new java.util.LinkedHashMap(); }
    if(map != null) { this.podFixed.putAll(map);} return (A)this;
  }
  public A removeFromPodFixed(java.lang.String key) {
    if(this.podFixed == null) { return (A) this; }
    if(key != null && this.podFixed != null) {this.podFixed.remove(key);} return (A)this;
  }
  public A removeFromPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
    if(this.podFixed == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.podFixed != null){this.podFixed.remove(key);}}} return (A)this;
  }
  public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getPodFixed() {
    return this.podFixed;
  }
  public <K,V>A withPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> podFixed) {
    if (podFixed == null) { this.podFixed =  null;} else {this.podFixed = new java.util.LinkedHashMap(podFixed);} return (A) this;
  }
  public Boolean hasPodFixed() {
    return this.podFixed != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1OverheadFluentImpl that = (V1alpha1OverheadFluentImpl) o;
    if (podFixed != null ? !podFixed.equals(that.podFixed) :that.podFixed != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(podFixed,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podFixed != null && !podFixed.isEmpty()) { sb.append("podFixed:"); sb.append(podFixed); }
    sb.append("}");
    return sb.toString();
  }
  
}