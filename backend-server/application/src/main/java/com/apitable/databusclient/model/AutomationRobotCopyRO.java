/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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

import com.apitable.databusclient.JSON;

/**
 * AutomationRobotCopyRO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationRobotCopyRO {
  public static final String SERIALIZED_NAME_AUTOMATION_NAME = "automation_name";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_NAME)
  private String automationName;

  public static final String SERIALIZED_NAME_ORIGINAL_RESOURCE_ID = "original_resource_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_RESOURCE_ID)
  private String originalResourceId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public AutomationRobotCopyRO() {
  }

  public AutomationRobotCopyRO automationName(String automationName) {
    
    this.automationName = automationName;
    return this;
  }

   /**
   * Get automationName
   * @return automationName
  **/
  @javax.annotation.Nullable
  public String getAutomationName() {
    return automationName;
  }


  public void setAutomationName(String automationName) {
    this.automationName = automationName;
  }


  public AutomationRobotCopyRO originalResourceId(String originalResourceId) {
    
    this.originalResourceId = originalResourceId;
    return this;
  }

   /**
   * Get originalResourceId
   * @return originalResourceId
  **/
  @javax.annotation.Nonnull
  public String getOriginalResourceId() {
    return originalResourceId;
  }


  public void setOriginalResourceId(String originalResourceId) {
    this.originalResourceId = originalResourceId;
  }


  public AutomationRobotCopyRO resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AutomationRobotCopyRO userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * minimum: 0
   * @return userId
  **/
  @javax.annotation.Nonnull
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRobotCopyRO automationRobotCopyRO = (AutomationRobotCopyRO) o;
    return Objects.equals(this.automationName, automationRobotCopyRO.automationName) &&
        Objects.equals(this.originalResourceId, automationRobotCopyRO.originalResourceId) &&
        Objects.equals(this.resourceId, automationRobotCopyRO.resourceId) &&
        Objects.equals(this.userId, automationRobotCopyRO.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(automationName, originalResourceId, resourceId, userId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRobotCopyRO {\n");
    sb.append("    automationName: ").append(toIndentedString(automationName)).append("\n");
    sb.append("    originalResourceId: ").append(toIndentedString(originalResourceId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("automation_name");
    openapiFields.add("original_resource_id");
    openapiFields.add("resource_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("original_resource_id");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutomationRobotCopyRO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutomationRobotCopyRO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationRobotCopyRO is not found in the empty JSON string", AutomationRobotCopyRO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutomationRobotCopyRO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutomationRobotCopyRO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutomationRobotCopyRO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("automation_name") != null && !jsonObj.get("automation_name").isJsonNull()) && !jsonObj.get("automation_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `automation_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("automation_name").toString()));
      }
      if (!jsonObj.get("original_resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_resource_id").toString()));
      }
      if (!jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationRobotCopyRO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationRobotCopyRO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationRobotCopyRO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationRobotCopyRO.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationRobotCopyRO>() {
           @Override
           public void write(JsonWriter out, AutomationRobotCopyRO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutomationRobotCopyRO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutomationRobotCopyRO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationRobotCopyRO
  * @throws IOException if the JSON string is invalid with respect to AutomationRobotCopyRO
  */
  public static AutomationRobotCopyRO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationRobotCopyRO.class);
  }

 /**
  * Convert an instance of AutomationRobotCopyRO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
