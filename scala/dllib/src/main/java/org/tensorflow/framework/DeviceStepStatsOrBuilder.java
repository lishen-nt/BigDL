// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: step_stats.proto

package org.tensorflow.framework;

public interface DeviceStepStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DeviceStepStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string device = 1;</code>
   */
  java.lang.String getDevice();
  /**
   * <code>optional string device = 1;</code>
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <code>repeated .tensorflow.NodeExecStats node_stats = 2;</code>
   */
  java.util.List<org.tensorflow.framework.NodeExecStats> 
      getNodeStatsList();
  /**
   * <code>repeated .tensorflow.NodeExecStats node_stats = 2;</code>
   */
  org.tensorflow.framework.NodeExecStats getNodeStats(int index);
  /**
   * <code>repeated .tensorflow.NodeExecStats node_stats = 2;</code>
   */
  int getNodeStatsCount();
  /**
   * <code>repeated .tensorflow.NodeExecStats node_stats = 2;</code>
   */
  java.util.List<? extends org.tensorflow.framework.NodeExecStatsOrBuilder> 
      getNodeStatsOrBuilderList();
  /**
   * <code>repeated .tensorflow.NodeExecStats node_stats = 2;</code>
   */
  org.tensorflow.framework.NodeExecStatsOrBuilder getNodeStatsOrBuilder(
      int index);
}
