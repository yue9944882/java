/*
Copyright 2024 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T01:56:23.031733Z[Etc/UTC]")
public class V1PodDisruptionBudget implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1PodDisruptionBudgetSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private V1PodDisruptionBudgetStatus status;

  public V1PodDisruptionBudget() {
  }

  public V1PodDisruptionBudget apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1PodDisruptionBudget kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1PodDisruptionBudget metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1PodDisruptionBudget spec(V1PodDisruptionBudgetSpec spec) {

    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  public V1PodDisruptionBudgetSpec getSpec() {
    return spec;
  }


  public void setSpec(V1PodDisruptionBudgetSpec spec) {
    this.spec = spec;
  }


  public V1PodDisruptionBudget status(V1PodDisruptionBudgetStatus status) {

    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  public V1PodDisruptionBudgetStatus getStatus() {
    return status;
  }


  public void setStatus(V1PodDisruptionBudgetStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDisruptionBudget v1PodDisruptionBudget = (V1PodDisruptionBudget) o;
    return Objects.equals(this.apiVersion, v1PodDisruptionBudget.apiVersion) &&
        Objects.equals(this.kind, v1PodDisruptionBudget.kind) &&
        Objects.equals(this.metadata, v1PodDisruptionBudget.metadata) &&
        Objects.equals(this.spec, v1PodDisruptionBudget.spec) &&
        Objects.equals(this.status, v1PodDisruptionBudget.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDisruptionBudget {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("spec");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodDisruptionBudget
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodDisruptionBudget.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodDisruptionBudget is not found in the empty JSON string", V1PodDisruptionBudget.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodDisruptionBudget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodDisruptionBudget` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        V1PodDisruptionBudgetSpec.validateJsonObject(jsonObj.getAsJsonObject("spec"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        V1PodDisruptionBudgetStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodDisruptionBudget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodDisruptionBudget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodDisruptionBudget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodDisruptionBudget.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodDisruptionBudget>() {
           @Override
           public void write(JsonWriter out, V1PodDisruptionBudget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodDisruptionBudget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodDisruptionBudget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodDisruptionBudget
  * @throws IOException if the JSON string is invalid with respect to V1PodDisruptionBudget
  */
  public static V1PodDisruptionBudget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodDisruptionBudget.class);
  }

 /**
  * Convert an instance of V1PodDisruptionBudget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
