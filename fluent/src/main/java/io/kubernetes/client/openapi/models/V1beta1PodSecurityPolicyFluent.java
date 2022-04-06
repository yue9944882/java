package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1PodSecurityPolicyFluent<A extends V1beta1PodSecurityPolicyFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public V1beta1PodSecurityPolicyFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1PodSecurityPolicySpec getSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec spec);
  public java.lang.Boolean hasSpec();
  public V1beta1PodSecurityPolicyFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec item);
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1beta1PodSecurityPolicyFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1beta1PodSecurityPolicySpecFluent<V1beta1PodSecurityPolicyFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}