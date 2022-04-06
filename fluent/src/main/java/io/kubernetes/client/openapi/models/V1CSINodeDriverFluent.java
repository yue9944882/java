package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSINodeDriverFluent<A extends V1CSINodeDriverFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAllocatable instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeResources getAllocatable();
  public io.kubernetes.client.openapi.models.V1VolumeNodeResources buildAllocatable();
  public A withAllocatable(io.kubernetes.client.openapi.models.V1VolumeNodeResources allocatable);
  public Boolean hasAllocatable();
  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatable();
  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item);
  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A> editAllocatable();
  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatable();
  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item);
  public String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.String getNodeID();
  public A withNodeID(java.lang.String nodeID);
  public java.lang.Boolean hasNodeID();
  public A addToTopologyKeys(Integer index,java.lang.String item);
  public A setToTopologyKeys(java.lang.Integer index,java.lang.String item);
  public A addToTopologyKeys(java.lang.String... items);
  public A addAllToTopologyKeys(Collection<java.lang.String> items);
  public A removeFromTopologyKeys(java.lang.String... items);
  public A removeAllFromTopologyKeys(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getTopologyKeys();
  public java.lang.String getTopologyKey(java.lang.Integer index);
  public java.lang.String getFirstTopologyKey();
  public java.lang.String getLastTopologyKey();
  public java.lang.String getMatchingTopologyKey(Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingTopologyKey(java.util.function.Predicate<java.lang.String> predicate);
  public A withTopologyKeys(java.util.List<java.lang.String> topologyKeys);
  public A withTopologyKeys(java.lang.String... topologyKeys);
  public java.lang.Boolean hasTopologyKeys();
  public interface AllocatableNested<N> extends Nested<N>,V1VolumeNodeResourcesFluent<V1CSINodeDriverFluent.AllocatableNested<N>>{
    public N and();
    public N endAllocatable();
    
  }
  
}