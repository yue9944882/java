package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceSubresourceScaleFluent<A extends V1CustomResourceSubresourceScaleFluent<A>> extends Fluent<A>{
  public String getLabelSelectorPath();
  public A withLabelSelectorPath(java.lang.String labelSelectorPath);
  public Boolean hasLabelSelectorPath();
  public java.lang.String getSpecReplicasPath();
  public A withSpecReplicasPath(java.lang.String specReplicasPath);
  public java.lang.Boolean hasSpecReplicasPath();
  public java.lang.String getStatusReplicasPath();
  public A withStatusReplicasPath(java.lang.String statusReplicasPath);
  public java.lang.Boolean hasStatusReplicasPath();
  
}