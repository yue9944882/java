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
public interface V1beta1EventListFluent<A extends V1beta1EventListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,io.kubernetes.client.openapi.models.V1beta1Event item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1Event item);
  public A addToItems(io.kubernetes.client.openapi.models.V1beta1Event... items);
  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1beta1Event> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1beta1Event... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1Event> items);
  public A removeMatchingFromItems(Predicate<V1beta1EventBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1beta1Event> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1Event> buildItems();
  public io.kubernetes.client.openapi.models.V1beta1Event buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1Event buildFirstItem();
  public io.kubernetes.client.openapi.models.V1beta1Event buildLastItem();
  public io.kubernetes.client.openapi.models.V1beta1Event buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EventBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EventBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1beta1Event> items);
  public A withItems(io.kubernetes.client.openapi.models.V1beta1Event... items);
  public java.lang.Boolean hasItems();
  public V1beta1EventListFluent.ItemsNested<A> addNewItem();
  public V1beta1EventListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1beta1Event item);
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1Event item);
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EventBuilder> predicate);
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
  public V1beta1EventListFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1EventListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1beta1EventFluent<V1beta1EventListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ListMetaFluent<V1beta1EventListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}