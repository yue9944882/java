package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TopologySpreadConstraintFluentImpl<A extends V1TopologySpreadConstraintFluent<A>> extends BaseFluent<A> implements V1TopologySpreadConstraintFluent<A>{
  public V1TopologySpreadConstraintFluentImpl() {
  }
  public V1TopologySpreadConstraintFluentImpl(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this.withLabelSelector(instance.getLabelSelector());

    this.withMaxSkew(instance.getMaxSkew());

    this.withTopologyKey(instance.getTopologyKey());

    this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

  }
  private V1LabelSelectorBuilder labelSelector;
  private Integer maxSkew;
  private String topologyKey;
  private V1TopologySpreadConstraint.WhenUnsatisfiableEnum whenUnsatisfiable;
  
  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector() {
    return this.labelSelector!=null ?this.labelSelector.build():null;
  }
  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector() {
    return this.labelSelector!=null ?this.labelSelector.build():null;
  }
  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector) {
    _visitables.get("labelSelector").remove(this.labelSelector);
    if (labelSelector!=null){ this.labelSelector= new V1LabelSelectorBuilder(labelSelector); _visitables.get("labelSelector").add(this.labelSelector);} return (A) this;
  }
  public Boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector() {
    return new V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector());
  }
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): item);
  }
  public java.lang.Integer getMaxSkew() {
    return this.maxSkew;
  }
  public A withMaxSkew(java.lang.Integer maxSkew) {
    this.maxSkew=maxSkew; return (A) this;
  }
  public java.lang.Boolean hasMaxSkew() {
    return this.maxSkew != null;
  }
  public java.lang.String getTopologyKey() {
    return this.topologyKey;
  }
  public A withTopologyKey(java.lang.String topologyKey) {
    this.topologyKey=topologyKey; return (A) this;
  }
  public java.lang.Boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.WhenUnsatisfiableEnum getWhenUnsatisfiable() {
    return this.whenUnsatisfiable;
  }
  public A withWhenUnsatisfiable(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.WhenUnsatisfiableEnum whenUnsatisfiable) {
    this.whenUnsatisfiable=whenUnsatisfiable; return (A) this;
  }
  public java.lang.Boolean hasWhenUnsatisfiable() {
    return this.whenUnsatisfiable != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TopologySpreadConstraintFluentImpl that = (V1TopologySpreadConstraintFluentImpl) o;
    if (labelSelector != null ? !labelSelector.equals(that.labelSelector) :that.labelSelector != null) return false;
    if (maxSkew != null ? !maxSkew.equals(that.maxSkew) :that.maxSkew != null) return false;
    if (topologyKey != null ? !topologyKey.equals(that.topologyKey) :that.topologyKey != null) return false;
    if (whenUnsatisfiable != null ? !whenUnsatisfiable.equals(that.whenUnsatisfiable) :that.whenUnsatisfiable != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  maxSkew,  topologyKey,  whenUnsatisfiable,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (maxSkew != null) { sb.append("maxSkew:"); sb.append(maxSkew + ","); }
    if (topologyKey != null) { sb.append("topologyKey:"); sb.append(topologyKey + ","); }
    if (whenUnsatisfiable != null) { sb.append("whenUnsatisfiable:"); sb.append(whenUnsatisfiable); }
    sb.append("}");
    return sb.toString();
  }
  class LabelSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1TopologySpreadConstraintFluent.LabelSelectorNested<N>> implements io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<N>,Nested<N>{
    LabelSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    LabelSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1TopologySpreadConstraintFluentImpl.this.withLabelSelector(builder.build());
    }
    public N endLabelSelector() {
      return and();
    }
    
  }
  
}