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
public interface V1ComponentStatusListFluent<A extends V1ComponentStatusListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,io.kubernetes.client.openapi.models.V1ComponentStatus item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ComponentStatus item);
  public A addToItems(io.kubernetes.client.openapi.models.V1ComponentStatus... items);
  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1ComponentStatus> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1ComponentStatus... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1ComponentStatus> items);
  public A removeMatchingFromItems(Predicate<V1ComponentStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ComponentStatus> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1ComponentStatus> buildItems();
  public io.kubernetes.client.openapi.models.V1ComponentStatus buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ComponentStatus buildFirstItem();
  public io.kubernetes.client.openapi.models.V1ComponentStatus buildLastItem();
  public io.kubernetes.client.openapi.models.V1ComponentStatus buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentStatusBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentStatusBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1ComponentStatus> items);
  public A withItems(io.kubernetes.client.openapi.models.V1ComponentStatus... items);
  public java.lang.Boolean hasItems();
  public V1ComponentStatusListFluent.ItemsNested<A> addNewItem();
  public V1ComponentStatusListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1ComponentStatus item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ComponentStatus item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentStatusBuilder> predicate);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ListMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
  public java.lang.Boolean hasMetadata();
  public V1ComponentStatusListFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1ComponentStatusFluent<V1ComponentStatusListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ListMetaFluent<V1ComponentStatusListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}