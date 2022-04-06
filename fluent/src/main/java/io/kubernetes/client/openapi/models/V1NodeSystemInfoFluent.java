package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeSystemInfoFluent<A extends V1NodeSystemInfoFluent<A>> extends Fluent<A>{
  public String getArchitecture();
  public A withArchitecture(java.lang.String architecture);
  public Boolean hasArchitecture();
  public java.lang.String getBootID();
  public A withBootID(java.lang.String bootID);
  public java.lang.Boolean hasBootID();
  public java.lang.String getContainerRuntimeVersion();
  public A withContainerRuntimeVersion(java.lang.String containerRuntimeVersion);
  public java.lang.Boolean hasContainerRuntimeVersion();
  public java.lang.String getKernelVersion();
  public A withKernelVersion(java.lang.String kernelVersion);
  public java.lang.Boolean hasKernelVersion();
  public java.lang.String getKubeProxyVersion();
  public A withKubeProxyVersion(java.lang.String kubeProxyVersion);
  public java.lang.Boolean hasKubeProxyVersion();
  public java.lang.String getKubeletVersion();
  public A withKubeletVersion(java.lang.String kubeletVersion);
  public java.lang.Boolean hasKubeletVersion();
  public java.lang.String getMachineID();
  public A withMachineID(java.lang.String machineID);
  public java.lang.Boolean hasMachineID();
  public java.lang.String getOperatingSystem();
  public A withOperatingSystem(java.lang.String operatingSystem);
  public java.lang.Boolean hasOperatingSystem();
  public java.lang.String getOsImage();
  public A withOsImage(java.lang.String osImage);
  public java.lang.Boolean hasOsImage();
  public java.lang.String getSystemUUID();
  public A withSystemUUID(java.lang.String systemUUID);
  public java.lang.Boolean hasSystemUUID();
  
}