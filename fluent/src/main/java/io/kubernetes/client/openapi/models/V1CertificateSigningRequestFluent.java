package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CertificateSigningRequestFluent<A extends V1CertificateSigningRequestFluent<A>> extends Fluent<A>{
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
  public V1CertificateSigningRequestFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1CertificateSigningRequestSpec getSpec();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec spec);
  public java.lang.Boolean hasSpec();
  public V1CertificateSigningRequestFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec item);
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1CertificateSigningRequestStatus getStatus();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus status);
  public java.lang.Boolean hasStatus();
  public V1CertificateSigningRequestFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus item);
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CertificateSigningRequestFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1CertificateSigningRequestSpecFluent<V1CertificateSigningRequestFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1CertificateSigningRequestStatusFluent<V1CertificateSigningRequestFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}