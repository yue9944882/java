package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface VersionInfoFluent<A extends VersionInfoFluent<A>> extends Fluent<A>{
  public String getBuildDate();
  public A withBuildDate(java.lang.String buildDate);
  public Boolean hasBuildDate();
  public java.lang.String getCompiler();
  public A withCompiler(java.lang.String compiler);
  public java.lang.Boolean hasCompiler();
  public java.lang.String getGitCommit();
  public A withGitCommit(java.lang.String gitCommit);
  public java.lang.Boolean hasGitCommit();
  public java.lang.String getGitTreeState();
  public A withGitTreeState(java.lang.String gitTreeState);
  public java.lang.Boolean hasGitTreeState();
  public java.lang.String getGitVersion();
  public A withGitVersion(java.lang.String gitVersion);
  public java.lang.Boolean hasGitVersion();
  public java.lang.String getGoVersion();
  public A withGoVersion(java.lang.String goVersion);
  public java.lang.Boolean hasGoVersion();
  public java.lang.String getMajor();
  public A withMajor(java.lang.String major);
  public java.lang.Boolean hasMajor();
  public java.lang.String getMinor();
  public A withMinor(java.lang.String minor);
  public java.lang.Boolean hasMinor();
  public java.lang.String getPlatform();
  public A withPlatform(java.lang.String platform);
  public java.lang.Boolean hasPlatform();
  
}