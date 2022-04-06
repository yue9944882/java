package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1SubjectFluent<A extends V1beta1SubjectFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildGroup instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1GroupSubject getGroup();
  public io.kubernetes.client.openapi.models.V1beta1GroupSubject buildGroup();
  public A withGroup(io.kubernetes.client.openapi.models.V1beta1GroupSubject group);
  public Boolean hasGroup();
  public V1beta1SubjectFluent.GroupNested<A> withNewGroup();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> withNewGroupLike(io.kubernetes.client.openapi.models.V1beta1GroupSubject item);
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editGroup();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editOrNewGroup();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editOrNewGroupLike(io.kubernetes.client.openapi.models.V1beta1GroupSubject item);
  public String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1ServiceAccountSubject getServiceAccount();
  public io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject buildServiceAccount();
  public A withServiceAccount(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject serviceAccount);
  public java.lang.Boolean hasServiceAccount();
  public V1beta1SubjectFluent.ServiceAccountNested<A> withNewServiceAccount();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject item);
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A> editServiceAccount();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject item);
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1UserSubject getUser();
  public io.kubernetes.client.openapi.models.V1beta1UserSubject buildUser();
  public A withUser(io.kubernetes.client.openapi.models.V1beta1UserSubject user);
  public java.lang.Boolean hasUser();
  public V1beta1SubjectFluent.UserNested<A> withNewUser();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> withNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserSubject item);
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editUser();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editOrNewUser();
  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editOrNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserSubject item);
  public interface GroupNested<N> extends Nested<N>,V1beta1GroupSubjectFluent<V1beta1SubjectFluent.GroupNested<N>>{
    public N and();
    public N endGroup();
    
  }
  public interface ServiceAccountNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1beta1ServiceAccountSubjectFluent<V1beta1SubjectFluent.ServiceAccountNested<N>>{
    public N and();
    public N endServiceAccount();
    
  }
  public interface UserNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1beta1UserSubjectFluent<V1beta1SubjectFluent.UserNested<N>>{
    public N and();
    public N endUser();
    
  }
  
}