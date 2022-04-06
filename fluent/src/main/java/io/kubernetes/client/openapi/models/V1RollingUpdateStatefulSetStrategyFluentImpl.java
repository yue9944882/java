package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1RollingUpdateStatefulSetStrategyFluentImpl<A extends V1RollingUpdateStatefulSetStrategyFluent<A>> extends BaseFluent<A> implements V1RollingUpdateStatefulSetStrategyFluent<A>{
  public V1RollingUpdateStatefulSetStrategyFluentImpl() {
  }
  public V1RollingUpdateStatefulSetStrategyFluentImpl(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy instance) {
    this.withPartition(instance.getPartition());

  }
  private Integer partition;
  public java.lang.Integer getPartition() {
    return this.partition;
  }
  public A withPartition(java.lang.Integer partition) {
    this.partition=partition; return (A) this;
  }
  public Boolean hasPartition() {
    return this.partition != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RollingUpdateStatefulSetStrategyFluentImpl that = (V1RollingUpdateStatefulSetStrategyFluentImpl) o;
    if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(partition,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (partition != null) { sb.append("partition:"); sb.append(partition); }
    sb.append("}");
    return sb.toString();
  }
  
}