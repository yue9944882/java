package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PersistentVolumeStatusFluent<A extends V1PersistentVolumeStatusFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeStatusFluent() {
  }
  
  public V1PersistentVolumeStatusFluent(V1PersistentVolumeStatus instance) {
    this.copyInstance(instance);
  }
  private String message;
  private String phase;
  private String reason;
  
  protected void copyInstance(V1PersistentVolumeStatus instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeStatus());
    if (instance != null) {
          this.withMessage(instance.getMessage());
          this.withPhase(instance.getPhase());
          this.withReason(instance.getReason());
        }
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeStatusFluent that = (V1PersistentVolumeStatusFluent) o;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(message,  phase,  reason,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  

}