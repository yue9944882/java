package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2beta1HorizontalPodAutoscalerSpecBuilder extends V2beta1HorizontalPodAutoscalerSpecFluentImpl<V2beta1HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V2beta1HorizontalPodAutoscalerSpec,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecBuilder>{
  public V2beta1HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(Boolean validationEnabled) {
    this(new V2beta1HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMetrics(instance.getMetrics());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance) {
    this(instance,false);
  }
  public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec build() {
    V2beta1HorizontalPodAutoscalerSpec buildable = new V2beta1HorizontalPodAutoscalerSpec();
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.getMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta1HorizontalPodAutoscalerSpecBuilder that = (V2beta1HorizontalPodAutoscalerSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}