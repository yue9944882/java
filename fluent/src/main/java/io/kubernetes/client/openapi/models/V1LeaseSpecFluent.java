package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LeaseSpecFluent<A extends V1LeaseSpecFluent<A>> extends Fluent<A>{
  public OffsetDateTime getAcquireTime();
  public A withAcquireTime(java.time.OffsetDateTime acquireTime);
  public Boolean hasAcquireTime();
  public String getHolderIdentity();
  public A withHolderIdentity(java.lang.String holderIdentity);
  public java.lang.Boolean hasHolderIdentity();
  public Integer getLeaseDurationSeconds();
  public A withLeaseDurationSeconds(java.lang.Integer leaseDurationSeconds);
  public java.lang.Boolean hasLeaseDurationSeconds();
  public java.lang.Integer getLeaseTransitions();
  public A withLeaseTransitions(java.lang.Integer leaseTransitions);
  public java.lang.Boolean hasLeaseTransitions();
  public java.time.OffsetDateTime getRenewTime();
  public A withRenewTime(java.time.OffsetDateTime renewTime);
  public java.lang.Boolean hasRenewTime();
  
}