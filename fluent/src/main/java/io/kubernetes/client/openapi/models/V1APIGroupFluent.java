package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIGroupFluent<A extends V1APIGroupFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildPreferredVersion instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GroupVersionForDiscovery getPreferredVersion();
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildPreferredVersion();
  public A withPreferredVersion(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery preferredVersion);
  public java.lang.Boolean hasPreferredVersion();
  public V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editPreferredVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public A addToServerAddressByClientCIDRs(Integer index,V1ServerAddressByClientCIDR item);
  public A setToServerAddressByClientCIDRs(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
  public A addToServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
  public A addAllToServerAddressByClientCIDRs(Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);
  public A removeFromServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
  public A removeAllFromServerAddressByClientCIDRs(java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);
  public A removeMatchingFromServerAddressByClientCIDRs(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs();
  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> buildServerAddressByClientCIDRs();
  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildServerAddressByClientCIDR(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildFirstServerAddressByClientCIDR();
  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildLastServerAddressByClientCIDR();
  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
  public java.lang.Boolean hasMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
  public A withServerAddressByClientCIDRs(java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> serverAddressByClientCIDRs);
  public A withServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... serverAddressByClientCIDRs);
  public java.lang.Boolean hasServerAddressByClientCIDRs();
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
  public A addToVersions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public A setToVersions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
  public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);
  public A removeFromVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
  public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);
  public A removeMatchingFromVersions(java.util.function.Predicate<V1GroupVersionForDiscoveryBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVersions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> getVersions();
  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> buildVersions();
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildVersion(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildFirstVersion();
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildLastVersion();
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
  public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
  public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> versions);
  public A withVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions);
  public java.lang.Boolean hasVersions();
  public V1APIGroupFluent.VersionsNested<A> addNewVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> setNewVersionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editVersion(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editFirstVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editLastVersion();
  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
  public interface PreferredVersionNested<N> extends Nested<N>,V1GroupVersionForDiscoveryFluent<V1APIGroupFluent.PreferredVersionNested<N>>{
    public N and();
    public N endPreferredVersion();
    
  }
  public interface ServerAddressByClientCIDRsNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ServerAddressByClientCIDRFluent<V1APIGroupFluent.ServerAddressByClientCIDRsNested<N>>{
    public N and();
    public N endServerAddressByClientCIDR();
    
  }
  public interface VersionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1GroupVersionForDiscoveryFluent<V1APIGroupFluent.VersionsNested<N>>{
    public N and();
    public N endVersion();
    
  }
  
}