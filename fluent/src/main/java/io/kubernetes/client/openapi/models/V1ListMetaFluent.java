package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ListMetaFluent<A extends V1ListMetaFluent<A>> extends Fluent<A>{
  public String getContinue();
  public A withContinue(java.lang.String _continue);
  public Boolean hasContinue();
  public Long getRemainingItemCount();
  public A withRemainingItemCount(java.lang.Long remainingItemCount);
  public java.lang.Boolean hasRemainingItemCount();
  public java.lang.String getResourceVersion();
  public A withResourceVersion(java.lang.String resourceVersion);
  public java.lang.Boolean hasResourceVersion();
  public java.lang.String getSelfLink();
  public A withSelfLink(java.lang.String selfLink);
  public java.lang.Boolean hasSelfLink();
  
}