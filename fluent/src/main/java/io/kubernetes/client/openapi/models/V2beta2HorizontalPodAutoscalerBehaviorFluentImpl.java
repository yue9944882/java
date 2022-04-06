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
  public class V2beta2HorizontalPodAutoscalerBehaviorFluentImpl<A extends V2beta2HorizontalPodAutoscalerBehaviorFluent<A>> extends BaseFluent<A> implements V2beta2HorizontalPodAutoscalerBehaviorFluent<A>{
  public V2beta2HorizontalPodAutoscalerBehaviorFluentImpl() {
  }
  public V2beta2HorizontalPodAutoscalerBehaviorFluentImpl(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance) {
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

  }
  private V2beta2HPAScalingRulesBuilder scaleDown;
  private V2beta2HPAScalingRulesBuilder scaleUp;
  
  /**
   * This method has been deprecated, please use method buildScaleDown instead.
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules getScaleDown() {
    return this.scaleDown!=null ?this.scaleDown.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules buildScaleDown() {
    return this.scaleDown!=null ?this.scaleDown.build():null;
  }
  public A withScaleDown(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules scaleDown) {
    _visitables.get("scaleDown").remove(this.scaleDown);
    if (scaleDown!=null){ this.scaleDown= new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder(scaleDown); _visitables.get("scaleDown").add(this.scaleDown);} return (A) this;
  }
  public Boolean hasScaleDown() {
    return this.scaleDown != null;
  }
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDown() {
    return new V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.ScaleDownNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDownLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item) {
    return new V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.ScaleDownNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editScaleDown() {
    return withNewScaleDownLike(getScaleDown());
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDown() {
    return withNewScaleDownLike(getScaleDown() != null ? getScaleDown(): new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDownLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item) {
    return withNewScaleDownLike(getScaleDown() != null ? getScaleDown(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildScaleUp instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules getScaleUp() {
    return this.scaleUp!=null ?this.scaleUp.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules buildScaleUp() {
    return this.scaleUp!=null ?this.scaleUp.build():null;
  }
  public A withScaleUp(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules scaleUp) {
    _visitables.get("scaleUp").remove(this.scaleUp);
    if (scaleUp!=null){ this.scaleUp= new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder(scaleUp); _visitables.get("scaleUp").add(this.scaleUp);} return (A) this;
  }
  public java.lang.Boolean hasScaleUp() {
    return this.scaleUp != null;
  }
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUp() {
    return new V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.ScaleUpNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUpLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item) {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.ScaleUpNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editScaleUp() {
    return withNewScaleUpLike(getScaleUp());
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUp() {
    return withNewScaleUpLike(getScaleUp() != null ? getScaleUp(): new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUpLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item) {
    return withNewScaleUpLike(getScaleUp() != null ? getScaleUp(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HorizontalPodAutoscalerBehaviorFluentImpl that = (V2beta2HorizontalPodAutoscalerBehaviorFluentImpl) o;
    if (scaleDown != null ? !scaleDown.equals(that.scaleDown) :that.scaleDown != null) return false;
    if (scaleUp != null ? !scaleUp.equals(that.scaleUp) :that.scaleUp != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(scaleDown,  scaleUp,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (scaleDown != null) { sb.append("scaleDown:"); sb.append(scaleDown + ","); }
    if (scaleUp != null) { sb.append("scaleUp:"); sb.append(scaleUp); }
    sb.append("}");
    return sb.toString();
  }
  class ScaleDownNestedImpl<N> extends V2beta2HPAScalingRulesFluentImpl<V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<N>> implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<N>,Nested<N>{
    ScaleDownNestedImpl(V2beta2HPAScalingRules item) {
      this.builder = new V2beta2HPAScalingRulesBuilder(this, item);
    }
    ScaleDownNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder builder;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.this.withScaleDown(builder.build());
    }
    public N endScaleDown() {
      return and();
    }
    
  }
  class ScaleUpNestedImpl<N> extends V2beta2HPAScalingRulesFluentImpl<V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<N>> implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<N>,io.kubernetes.client.fluent.Nested<N>{
    ScaleUpNestedImpl(V2beta2HPAScalingRules item) {
      this.builder = new V2beta2HPAScalingRulesBuilder(this, item);
    }
    ScaleUpNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder builder;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerBehaviorFluentImpl.this.withScaleUp(builder.build());
    }
    public N endScaleUp() {
      return and();
    }
    
  }
  
}