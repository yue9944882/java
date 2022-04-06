package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1beta1EndpointHintsFluent<A extends V1beta1EndpointHintsFluent<A>> extends Fluent<A>{
  public A addToForZones(Integer index,V1beta1ForZone item);
  public A setToForZones(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public A addToForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items);
  public A addAllToForZones(Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items);
  public A removeFromForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items);
  public A removeAllFromForZones(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items);
  public A removeMatchingFromForZones(Predicate<V1beta1ForZoneBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildForZones instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1beta1ForZone> getForZones();
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> buildForZones();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildForZone(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildFirstForZone();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildLastForZone();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public Boolean hasMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public A withForZones(java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> forZones);
  public A withForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... forZones);
  public java.lang.Boolean hasForZones();
  public V1beta1EndpointHintsFluent.ForZonesNested<A> addNewForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> addNewForZoneLike(io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> setNewForZoneLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editForZone(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editFirstForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editLastForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public interface ForZonesNested<N> extends Nested<N>,V1beta1ForZoneFluent<V1beta1EndpointHintsFluent.ForZonesNested<N>>{
    public N and();
    public N endForZone();
    
  }
  
}