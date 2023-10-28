package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2PriorityLevelConfigurationSpecFluent<A extends V1beta2PriorityLevelConfigurationSpecFluent<A>> extends BaseFluent<A>{
  public V1beta2PriorityLevelConfigurationSpecFluent() {
  }
  
  public V1beta2PriorityLevelConfigurationSpecFluent(V1beta2PriorityLevelConfigurationSpec instance) {
    this.copyInstance(instance);
  }
  private V1beta2LimitedPriorityLevelConfigurationBuilder limited;
  private String type;
  
  protected void copyInstance(V1beta2PriorityLevelConfigurationSpec instance) {
    instance = (instance != null ? instance : new V1beta2PriorityLevelConfigurationSpec());
    if (instance != null) {
          this.withLimited(instance.getLimited());
          this.withType(instance.getType());
        }
  }
  
  public V1beta2LimitedPriorityLevelConfiguration buildLimited() {
    return this.limited != null ? this.limited.build() : null;
  }
  
  public A withLimited(V1beta2LimitedPriorityLevelConfiguration limited) {
    this._visitables.remove(this.limited);
    if (limited != null) {
        this.limited = new V1beta2LimitedPriorityLevelConfigurationBuilder(limited);
        this._visitables.get("limited").add(this.limited);
    } else {
        this.limited = null;
        this._visitables.get("limited").remove(this.limited);
    }
    return (A) this;
  }
  
  public boolean hasLimited() {
    return this.limited != null;
  }
  
  public LimitedNested<A> withNewLimited() {
    return new LimitedNested(null);
  }
  
  public LimitedNested<A> withNewLimitedLike(V1beta2LimitedPriorityLevelConfiguration item) {
    return new LimitedNested(item);
  }
  
  public LimitedNested<A> editLimited() {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(null));
  }
  
  public LimitedNested<A> editOrNewLimited() {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(new V1beta2LimitedPriorityLevelConfigurationBuilder().build()));
  }
  
  public LimitedNested<A> editOrNewLimitedLike(V1beta2LimitedPriorityLevelConfiguration item) {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(item));
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PriorityLevelConfigurationSpecFluent that = (V1beta2PriorityLevelConfigurationSpecFluent) o;
    if (!java.util.Objects.equals(limited, that.limited)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(limited,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limited != null) { sb.append("limited:"); sb.append(limited + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public class LimitedNested<N> extends V1beta2LimitedPriorityLevelConfigurationFluent<LimitedNested<N>> implements Nested<N>{
    LimitedNested(V1beta2LimitedPriorityLevelConfiguration item) {
      this.builder = new V1beta2LimitedPriorityLevelConfigurationBuilder(this, item);
    }
    V1beta2LimitedPriorityLevelConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta2PriorityLevelConfigurationSpecFluent.this.withLimited(builder.build());
    }
    
    public N endLimited() {
      return and();
    }
    
  
  }

}