package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WindowsSecurityContextOptionsFluent<A extends V1WindowsSecurityContextOptionsFluent<A>> extends Fluent<A>{
  public String getGmsaCredentialSpec();
  public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec);
  public Boolean hasGmsaCredentialSpec();
  public java.lang.String getGmsaCredentialSpecName();
  public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName);
  public java.lang.Boolean hasGmsaCredentialSpecName();
  public java.lang.Boolean getHostProcess();
  public A withHostProcess(java.lang.Boolean hostProcess);
  public java.lang.Boolean hasHostProcess();
  public java.lang.String getRunAsUserName();
  public A withRunAsUserName(java.lang.String runAsUserName);
  public java.lang.Boolean hasRunAsUserName();
  public A withHostProcess();
  
}