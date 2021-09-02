// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/fleetengine.proto

package google.maps.fleetengine.v1;

public interface TerminalLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.TerminalLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Denotes the actual location of a pickup or dropoff.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   *
   *
   * <pre>
   * Required. Denotes the actual location of a pickup or dropoff.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The point.
   */
  com.google.type.LatLng getPoint();
  /**
   *
   *
   * <pre>
   * Required. Denotes the actual location of a pickup or dropoff.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.LatLngOrBuilder getPointOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. ID of the terminal point.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalPointId terminal_point_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the terminalPointId field is set.
   */
  boolean hasTerminalPointId();
  /**
   *
   *
   * <pre>
   * Required. ID of the terminal point.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalPointId terminal_point_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The terminalPointId.
   */
  google.maps.fleetengine.v1.TerminalPointId getTerminalPointId();
  /**
   *
   *
   * <pre>
   * Required. ID of the terminal point.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalPointId terminal_point_id = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.maps.fleetengine.v1.TerminalPointIdOrBuilder getTerminalPointIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string access_point_id = 3 [deprecated = true];</code>
   *
   * @return The accessPointId.
   */
  @java.lang.Deprecated
  java.lang.String getAccessPointId();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string access_point_id = 3 [deprecated = true];</code>
   *
   * @return The bytes for accessPointId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getAccessPointIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. Use vehicle.waypoint instead.
   * </pre>
   *
   * <code>string trip_id = 4 [deprecated = true];</code>
   *
   * @return The tripId.
   */
  @java.lang.Deprecated
  java.lang.String getTripId();
  /**
   *
   *
   * <pre>
   * Deprecated. Use vehicle.waypoint instead.
   * </pre>
   *
   * <code>string trip_id = 4 [deprecated = true];</code>
   *
   * @return The bytes for tripId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getTripIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. Vehicle.waypoint will have this data.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.WaypointType terminal_location_type = 5 [deprecated = true];</code>
   *
   * @return The enum numeric value on the wire for terminalLocationType.
   */
  @java.lang.Deprecated
  int getTerminalLocationTypeValue();
  /**
   *
   *
   * <pre>
   * Deprecated. Vehicle.waypoint will have this data.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.WaypointType terminal_location_type = 5 [deprecated = true];</code>
   *
   * @return The terminalLocationType.
   */
  @java.lang.Deprecated
  google.maps.fleetengine.v1.WaypointType getTerminalLocationType();
}
