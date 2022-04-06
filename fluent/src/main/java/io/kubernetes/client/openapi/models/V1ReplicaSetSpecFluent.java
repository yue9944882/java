package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ReplicaSetSpecFluent<A extends V1ReplicaSetSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(java.lang.Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  public java.lang.Integer getReplicas();
  public A withReplicas(java.lang.Integer replicas);
  public java.lang.Boolean hasReplicas();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodTemplateSpec getTemplate();
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
  public java.lang.Boolean hasTemplate();
  public V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1ReplicaSetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1PodTemplateSpecFluent<V1ReplicaSetSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}