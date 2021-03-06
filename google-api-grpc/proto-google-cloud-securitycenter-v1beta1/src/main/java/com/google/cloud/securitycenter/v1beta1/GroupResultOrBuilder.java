// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface GroupResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.GroupResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getProperties();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  com.google.protobuf.Value getPropertiesOrDefault(
      java.lang.String key, com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  com.google.protobuf.Value getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Total count of resources for the given properties.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   */
  long getCount();
}
