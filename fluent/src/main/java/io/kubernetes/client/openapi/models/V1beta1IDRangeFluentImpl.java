package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta1IDRangeFluentImpl<A extends V1beta1IDRangeFluent<A>> extends BaseFluent<A> implements V1beta1IDRangeFluent<A>{
  public V1beta1IDRangeFluentImpl() {
  }
  public V1beta1IDRangeFluentImpl(io.kubernetes.client.openapi.models.V1beta1IDRange instance) {
    this.withMax(instance.getMax());

    this.withMin(instance.getMin());

  }
  private Long max;
  private java.lang.Long min;
  public java.lang.Long getMax() {
    return this.max;
  }
  public A withMax(java.lang.Long max) {
    this.max=max; return (A) this;
  }
  public Boolean hasMax() {
    return this.max != null;
  }
  public java.lang.Long getMin() {
    return this.min;
  }
  public A withMin(java.lang.Long min) {
    this.min=min; return (A) this;
  }
  public java.lang.Boolean hasMin() {
    return this.min != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1IDRangeFluentImpl that = (V1beta1IDRangeFluentImpl) o;
    if (max != null ? !max.equals(that.max) :that.max != null) return false;
    if (min != null ? !min.equals(that.min) :that.min != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(max,  min,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (max != null) { sb.append("max:"); sb.append(max + ","); }
    if (min != null) { sb.append("min:"); sb.append(min); }
    sb.append("}");
    return sb.toString();
  }
  
}