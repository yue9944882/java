package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1ReplicationControllerSpecFluent<A extends V1ReplicationControllerSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(java.lang.Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  public java.lang.Integer getReplicas();
  public A withReplicas(java.lang.Integer replicas);
  public java.lang.Boolean hasReplicas();
  public A addToSelector(String key,java.lang.String value);
  public A addToSelector(Map<java.lang.String,java.lang.String> map);
  public A removeFromSelector(java.lang.String key);
  public A removeFromSelector(java.util.Map<java.lang.String,java.lang.String> map);
  public java.util.Map<java.lang.String,java.lang.String> getSelector();
  public <K,V>A withSelector(java.util.Map<java.lang.String,java.lang.String> selector);
  public java.lang.Boolean hasSelector();
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
  public java.lang.Boolean hasTemplate();
  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate();
  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1ReplicationControllerSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}