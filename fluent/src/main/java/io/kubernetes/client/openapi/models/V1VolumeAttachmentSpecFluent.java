package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentSpecFluent<A extends V1VolumeAttachmentSpecFluent<A>> extends Fluent<A>{
  public String getAttacher();
  public A withAttacher(java.lang.String attacher);
  public Boolean hasAttacher();
  public java.lang.String getNodeName();
  public A withNodeName(java.lang.String nodeName);
  public java.lang.Boolean hasNodeName();
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSource getSource();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource buildSource();
  public A withSource(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource source);
  public java.lang.Boolean hasSource();
  public V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editSource();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item);
  public interface SourceNested<N> extends Nested<N>,V1VolumeAttachmentSourceFluent<V1VolumeAttachmentSpecFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}