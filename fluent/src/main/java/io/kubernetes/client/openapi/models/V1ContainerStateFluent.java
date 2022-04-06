package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStateFluent<A extends V1ContainerStateFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRunning instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateRunning getRunning();
  public io.kubernetes.client.openapi.models.V1ContainerStateRunning buildRunning();
  public A withRunning(io.kubernetes.client.openapi.models.V1ContainerStateRunning running);
  public Boolean hasRunning();
  public V1ContainerStateFluent.RunningNested<A> withNewRunning();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> withNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item);
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editRunning();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editOrNewRunning();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editOrNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item);
  
  /**
   * This method has been deprecated, please use method buildTerminated instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ContainerStateTerminated getTerminated();
  public io.kubernetes.client.openapi.models.V1ContainerStateTerminated buildTerminated();
  public A withTerminated(io.kubernetes.client.openapi.models.V1ContainerStateTerminated terminated);
  public java.lang.Boolean hasTerminated();
  public V1ContainerStateFluent.TerminatedNested<A> withNewTerminated();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item);
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editTerminated();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminated();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item);
  
  /**
   * This method has been deprecated, please use method buildWaiting instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ContainerStateWaiting getWaiting();
  public io.kubernetes.client.openapi.models.V1ContainerStateWaiting buildWaiting();
  public A withWaiting(io.kubernetes.client.openapi.models.V1ContainerStateWaiting waiting);
  public java.lang.Boolean hasWaiting();
  public V1ContainerStateFluent.WaitingNested<A> withNewWaiting();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> withNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item);
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editWaiting();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editOrNewWaiting();
  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item);
  public interface RunningNested<N> extends Nested<N>,V1ContainerStateRunningFluent<V1ContainerStateFluent.RunningNested<N>>{
    public N and();
    public N endRunning();
    
  }
  public interface TerminatedNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ContainerStateTerminatedFluent<V1ContainerStateFluent.TerminatedNested<N>>{
    public N and();
    public N endTerminated();
    
  }
  public interface WaitingNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ContainerStateWaitingFluent<V1ContainerStateFluent.WaitingNested<N>>{
    public N and();
    public N endWaiting();
    
  }
  
}