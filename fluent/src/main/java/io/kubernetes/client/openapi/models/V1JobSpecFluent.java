package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobSpecFluent<A extends V1JobSpecFluent<A>> extends Fluent<A>{
  public Long getActiveDeadlineSeconds();
  public A withActiveDeadlineSeconds(java.lang.Long activeDeadlineSeconds);
  public Boolean hasActiveDeadlineSeconds();
  public Integer getBackoffLimit();
  public A withBackoffLimit(java.lang.Integer backoffLimit);
  public java.lang.Boolean hasBackoffLimit();
  public String getCompletionMode();
  public A withCompletionMode(java.lang.String completionMode);
  public java.lang.Boolean hasCompletionMode();
  public java.lang.Integer getCompletions();
  public A withCompletions(java.lang.Integer completions);
  public java.lang.Boolean hasCompletions();
  public java.lang.Boolean getManualSelector();
  public A withManualSelector(java.lang.Boolean manualSelector);
  public java.lang.Boolean hasManualSelector();
  public java.lang.Integer getParallelism();
  public A withParallelism(java.lang.Integer parallelism);
  public java.lang.Boolean hasParallelism();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public V1JobSpecFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public java.lang.Boolean getSuspend();
  public A withSuspend(java.lang.Boolean suspend);
  public java.lang.Boolean hasSuspend();
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodTemplateSpec getTemplate();
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
  public java.lang.Boolean hasTemplate();
  public V1JobSpecFluent.TemplateNested<A> withNewTemplate();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editTemplate();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editOrNewTemplate();
  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public java.lang.Integer getTtlSecondsAfterFinished();
  public A withTtlSecondsAfterFinished(java.lang.Integer ttlSecondsAfterFinished);
  public java.lang.Boolean hasTtlSecondsAfterFinished();
  public A withManualSelector();
  public A withSuspend();
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1JobSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1PodTemplateSpecFluent<V1JobSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}