package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LifecycleFluent<A extends V1LifecycleFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildPostStart instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LifecycleHandler getPostStart();
  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPostStart();
  public A withPostStart(io.kubernetes.client.openapi.models.V1LifecycleHandler postStart);
  public Boolean hasPostStart();
  public V1LifecycleFluent.PostStartNested<A> withNewPostStart();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> withNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editPostStart();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editOrNewPostStart();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);
  
  /**
   * This method has been deprecated, please use method buildPreStop instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LifecycleHandler getPreStop();
  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPreStop();
  public A withPreStop(io.kubernetes.client.openapi.models.V1LifecycleHandler preStop);
  public java.lang.Boolean hasPreStop();
  public V1LifecycleFluent.PreStopNested<A> withNewPreStop();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editPreStop();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStop();
  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);
  public interface PostStartNested<N> extends Nested<N>,V1LifecycleHandlerFluent<V1LifecycleFluent.PostStartNested<N>>{
    public N and();
    public N endPostStart();
    
  }
  public interface PreStopNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1LifecycleHandlerFluent<V1LifecycleFluent.PreStopNested<N>>{
    public N and();
    public N endPreStop();
    
  }
  
}