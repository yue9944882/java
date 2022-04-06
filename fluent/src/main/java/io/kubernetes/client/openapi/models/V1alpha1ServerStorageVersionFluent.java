package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1alpha1ServerStorageVersionFluent<A extends V1alpha1ServerStorageVersionFluent<A>> extends Fluent<A>{
  public String getApiServerID();
  public A withApiServerID(java.lang.String apiServerID);
  public Boolean hasApiServerID();
  public A addToDecodableVersions(Integer index,java.lang.String item);
  public A setToDecodableVersions(java.lang.Integer index,java.lang.String item);
  public A addToDecodableVersions(java.lang.String... items);
  public A addAllToDecodableVersions(Collection<java.lang.String> items);
  public A removeFromDecodableVersions(java.lang.String... items);
  public A removeAllFromDecodableVersions(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getDecodableVersions();
  public java.lang.String getDecodableVersion(java.lang.Integer index);
  public java.lang.String getFirstDecodableVersion();
  public java.lang.String getLastDecodableVersion();
  public java.lang.String getMatchingDecodableVersion(Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingDecodableVersion(java.util.function.Predicate<java.lang.String> predicate);
  public A withDecodableVersions(java.util.List<java.lang.String> decodableVersions);
  public A withDecodableVersions(java.lang.String... decodableVersions);
  public java.lang.Boolean hasDecodableVersions();
  public java.lang.String getEncodingVersion();
  public A withEncodingVersion(java.lang.String encodingVersion);
  public java.lang.Boolean hasEncodingVersion();
  
}