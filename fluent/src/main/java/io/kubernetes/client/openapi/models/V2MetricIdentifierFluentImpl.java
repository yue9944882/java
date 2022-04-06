package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2MetricIdentifierFluentImpl<A extends V2MetricIdentifierFluent<A>> extends BaseFluent<A> implements V2MetricIdentifierFluent<A>{
  public V2MetricIdentifierFluentImpl() {
  }
  public V2MetricIdentifierFluentImpl(io.kubernetes.client.openapi.models.V2MetricIdentifier instance) {
    this.withName(instance.getName());

    this.withSelector(instance.getSelector());

  }
  private String name;
  private V1LabelSelectorBuilder selector;
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} return (A) this;
  }
  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }
  public V2MetricIdentifierFluent.SelectorNested<A> withNewSelector() {
    return new V2MetricIdentifierFluentImpl.SelectorNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V2MetricIdentifierFluentImpl.SelectorNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2MetricIdentifierFluentImpl that = (V2MetricIdentifierFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  selector,  super.hashCode());
  }
  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector); }
    sb.append("}");
    return sb.toString();
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V2MetricIdentifierFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V2MetricIdentifierFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}