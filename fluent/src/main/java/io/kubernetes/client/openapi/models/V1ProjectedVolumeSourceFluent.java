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
public interface V1ProjectedVolumeSourceFluent<A extends V1ProjectedVolumeSourceFluent<A>> extends Fluent<A>{
  public Integer getDefaultMode();
  public A withDefaultMode(java.lang.Integer defaultMode);
  public Boolean hasDefaultMode();
  public A addToSources(java.lang.Integer index,V1VolumeProjection item);
  public A setToSources(java.lang.Integer index,io.kubernetes.client.openapi.models.V1VolumeProjection item);
  public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);
  public A addAllToSources(Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);
  public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);
  public A removeAllFromSources(java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);
  public A removeMatchingFromSources(Predicate<V1VolumeProjectionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSources instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1VolumeProjection> getSources();
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> buildSources();
  public io.kubernetes.client.openapi.models.V1VolumeProjection buildSource(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1VolumeProjection buildFirstSource();
  public io.kubernetes.client.openapi.models.V1VolumeProjection buildLastSource();
  public io.kubernetes.client.openapi.models.V1VolumeProjection buildMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
  public java.lang.Boolean hasMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
  public A withSources(java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> sources);
  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources);
  public java.lang.Boolean hasSources();
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource();
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeProjection item);
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1VolumeProjection item);
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editSource(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource();
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource();
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
  public interface SourcesNested<N> extends Nested<N>,V1VolumeProjectionFluent<V1ProjectedVolumeSourceFluent.SourcesNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}