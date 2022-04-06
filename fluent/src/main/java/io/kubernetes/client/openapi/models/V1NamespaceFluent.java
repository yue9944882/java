package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NamespaceFluent<A extends V1NamespaceFluent<A>> extends Fluent<A>{
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
  public V1NamespaceFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1NamespaceSpec getSpec();
  public io.kubernetes.client.openapi.models.V1NamespaceSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1NamespaceSpec spec);
  public java.lang.Boolean hasSpec();
  public V1NamespaceFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1NamespaceSpec item);
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1NamespaceSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1NamespaceStatus getStatus();
  public io.kubernetes.client.openapi.models.V1NamespaceStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1NamespaceStatus status);
  public java.lang.Boolean hasStatus();
  public V1NamespaceFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1NamespaceStatus item);
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1NamespaceFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1NamespaceStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1NamespaceFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1NamespaceSpecFluent<V1NamespaceFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1NamespaceStatusFluent<V1NamespaceFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}