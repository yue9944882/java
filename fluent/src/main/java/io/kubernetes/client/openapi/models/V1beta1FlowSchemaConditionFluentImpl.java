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
  public class V1beta1FlowSchemaConditionFluentImpl<A extends V1beta1FlowSchemaConditionFluent<A>> extends BaseFluent<A> implements V1beta1FlowSchemaConditionFluent<A>{
  public V1beta1FlowSchemaConditionFluentImpl() {
  }
  public V1beta1FlowSchemaConditionFluentImpl(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition instance) {
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private OffsetDateTime lastTransitionTime;
  private String message;
  private java.lang.String reason;
  private java.lang.String status;
  private java.lang.String type;
  public java.time.OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime=lastTransitionTime; return (A) this;
  }
  public Boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  public java.lang.String getMessage() {
    return this.message;
  }
  public A withMessage(java.lang.String message) {
    this.message=message; return (A) this;
  }
  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }
  public java.lang.String getReason() {
    return this.reason;
  }
  public A withReason(java.lang.String reason) {
    this.reason=reason; return (A) this;
  }
  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }
  public java.lang.String getStatus() {
    return this.status;
  }
  public A withStatus(java.lang.String status) {
    this.status=status; return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1FlowSchemaConditionFluentImpl that = (V1beta1FlowSchemaConditionFluentImpl) o;
    if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  message,  reason,  status,  type,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}