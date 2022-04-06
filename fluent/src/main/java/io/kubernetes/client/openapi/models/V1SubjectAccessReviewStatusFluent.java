package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SubjectAccessReviewStatusFluent<A extends V1SubjectAccessReviewStatusFluent<A>> extends Fluent<A>{
  public Boolean getAllowed();
  public A withAllowed(java.lang.Boolean allowed);
  public java.lang.Boolean hasAllowed();
  public java.lang.Boolean getDenied();
  public A withDenied(java.lang.Boolean denied);
  public java.lang.Boolean hasDenied();
  public String getEvaluationError();
  public A withEvaluationError(java.lang.String evaluationError);
  public java.lang.Boolean hasEvaluationError();
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  public A withAllowed();
  public A withDenied();
  
}