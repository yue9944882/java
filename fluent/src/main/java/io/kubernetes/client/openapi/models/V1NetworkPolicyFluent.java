package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NetworkPolicyFluent<A extends V1NetworkPolicyFluent<A>> extends Fluent<A>{
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
  public V1NetworkPolicyFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1NetworkPolicySpec getSpec();
  public io.kubernetes.client.openapi.models.V1NetworkPolicySpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1NetworkPolicySpec spec);
  public java.lang.Boolean hasSpec();
  public V1NetworkPolicyFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1NetworkPolicySpec item);
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1NetworkPolicyFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1NetworkPolicySpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1NetworkPolicyFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1NetworkPolicySpecFluent<V1NetworkPolicyFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}