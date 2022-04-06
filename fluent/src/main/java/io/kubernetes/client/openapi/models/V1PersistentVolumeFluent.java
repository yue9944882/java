package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeFluent<A extends V1PersistentVolumeFluent<A>> extends Fluent<A>{
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
  public V1PersistentVolumeFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PersistentVolumeSpec getSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec spec);
  public java.lang.Boolean hasSpec();
  public V1PersistentVolumeFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PersistentVolumeStatus getStatus();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus status);
  public java.lang.Boolean hasStatus();
  public V1PersistentVolumeFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus item);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PersistentVolumeFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1PersistentVolumeSpecFluent<V1PersistentVolumeFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1PersistentVolumeStatusFluent<V1PersistentVolumeFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}