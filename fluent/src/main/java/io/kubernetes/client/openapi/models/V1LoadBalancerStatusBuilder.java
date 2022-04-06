/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1LoadBalancerStatusBuilder
    extends V1LoadBalancerStatusFluentImpl<V1LoadBalancerStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1LoadBalancerStatus, V1LoadBalancerStatusBuilder> {
  public V1LoadBalancerStatusBuilder() {
    this(false);
  }

  public V1LoadBalancerStatusBuilder(Boolean validationEnabled) {
    this(new V1LoadBalancerStatus(), validationEnabled);
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1LoadBalancerStatus(), validationEnabled);
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance) {
    this(fluent, instance, false);
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled;
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance) {
    this(instance, false);
  }

  public V1LoadBalancerStatusBuilder(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withIngress(instance.getIngress());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus build() {
    V1LoadBalancerStatus buildable = new V1LoadBalancerStatus();
    buildable.setIngress(fluent.getIngress());
    return buildable;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LoadBalancerStatusBuilder that = (V1LoadBalancerStatusBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
