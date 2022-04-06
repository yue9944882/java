package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceSubresourceScaleFluentImpl<A extends V1CustomResourceSubresourceScaleFluent<A>> extends BaseFluent<A> implements V1CustomResourceSubresourceScaleFluent<A>{
  public V1CustomResourceSubresourceScaleFluentImpl() {
  }
  public V1CustomResourceSubresourceScaleFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance) {
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());

  }
  private String labelSelectorPath;
  private java.lang.String specReplicasPath;
  private java.lang.String statusReplicasPath;
  public java.lang.String getLabelSelectorPath() {
    return this.labelSelectorPath;
  }
  public A withLabelSelectorPath(java.lang.String labelSelectorPath) {
    this.labelSelectorPath=labelSelectorPath; return (A) this;
  }
  public Boolean hasLabelSelectorPath() {
    return this.labelSelectorPath != null;
  }
  public java.lang.String getSpecReplicasPath() {
    return this.specReplicasPath;
  }
  public A withSpecReplicasPath(java.lang.String specReplicasPath) {
    this.specReplicasPath=specReplicasPath; return (A) this;
  }
  public java.lang.Boolean hasSpecReplicasPath() {
    return this.specReplicasPath != null;
  }
  public java.lang.String getStatusReplicasPath() {
    return this.statusReplicasPath;
  }
  public A withStatusReplicasPath(java.lang.String statusReplicasPath) {
    this.statusReplicasPath=statusReplicasPath; return (A) this;
  }
  public java.lang.Boolean hasStatusReplicasPath() {
    return this.statusReplicasPath != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceSubresourceScaleFluentImpl that = (V1CustomResourceSubresourceScaleFluentImpl) o;
    if (labelSelectorPath != null ? !labelSelectorPath.equals(that.labelSelectorPath) :that.labelSelectorPath != null) return false;
    if (specReplicasPath != null ? !specReplicasPath.equals(that.specReplicasPath) :that.specReplicasPath != null) return false;
    if (statusReplicasPath != null ? !statusReplicasPath.equals(that.statusReplicasPath) :that.statusReplicasPath != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(labelSelectorPath,  specReplicasPath,  statusReplicasPath,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelectorPath != null) { sb.append("labelSelectorPath:"); sb.append(labelSelectorPath + ","); }
    if (specReplicasPath != null) { sb.append("specReplicasPath:"); sb.append(specReplicasPath + ","); }
    if (statusReplicasPath != null) { sb.append("statusReplicasPath:"); sb.append(statusReplicasPath); }
    sb.append("}");
    return sb.toString();
  }
  
}