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
// source: google/maps/fleetengine/v1/vehicle_api.proto

package google.maps.fleetengine.v1;

public interface VehicleMatchOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.VehicleMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A vehicle that matches the request.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Vehicle vehicle = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the vehicle field is set.
   */
  boolean hasVehicle();
  /**
   *
   *
   * <pre>
   * Required. A vehicle that matches the request.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Vehicle vehicle = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The vehicle.
   */
  google.maps.fleetengine.v1.Vehicle getVehicle();
  /**
   *
   *
   * <pre>
   * Required. A vehicle that matches the request.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Vehicle vehicle = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.maps.fleetengine.v1.VehicleOrBuilder getVehicleOrBuilder();

  /**
   *
   *
   * <pre>
   * The vehicle's driving ETA to the pickup point specified in the
   * request. An empty value indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_pickup_eta = 2;</code>
   *
   * @return Whether the vehiclePickupEta field is set.
   */
  boolean hasVehiclePickupEta();
  /**
   *
   *
   * <pre>
   * The vehicle's driving ETA to the pickup point specified in the
   * request. An empty value indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_pickup_eta = 2;</code>
   *
   * @return The vehiclePickupEta.
   */
  com.google.protobuf.Timestamp getVehiclePickupEta();
  /**
   *
   *
   * <pre>
   * The vehicle's driving ETA to the pickup point specified in the
   * request. An empty value indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_pickup_eta = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVehiclePickupEtaOrBuilder();

  /**
   *
   *
   * <pre>
   * The vehicle's driving distance to the pickup point specified in
   * the request, including any intermediate pickup or dropoff points for
   * an existing ride.  An empty value indicates a failure in calculating
   * distance for the vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_distance_meters = 3;</code>
   *
   * @return Whether the vehiclePickupDistanceMeters field is set.
   */
  boolean hasVehiclePickupDistanceMeters();
  /**
   *
   *
   * <pre>
   * The vehicle's driving distance to the pickup point specified in
   * the request, including any intermediate pickup or dropoff points for
   * an existing ride.  An empty value indicates a failure in calculating
   * distance for the vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_distance_meters = 3;</code>
   *
   * @return The vehiclePickupDistanceMeters.
   */
  com.google.protobuf.Int32Value getVehiclePickupDistanceMeters();
  /**
   *
   *
   * <pre>
   * The vehicle's driving distance to the pickup point specified in
   * the request, including any intermediate pickup or dropoff points for
   * an existing ride.  An empty value indicates a failure in calculating
   * distance for the vehicle.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_distance_meters = 3;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getVehiclePickupDistanceMetersOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The straight-line distance between the vehicle and the pickup
   * point specified in the request, including intermediate waypoints for
   * existing trips.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value vehicle_pickup_straight_line_distance_meters = 11 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the vehiclePickupStraightLineDistanceMeters field is set.
   */
  boolean hasVehiclePickupStraightLineDistanceMeters();
  /**
   *
   *
   * <pre>
   * Required. The straight-line distance between the vehicle and the pickup
   * point specified in the request, including intermediate waypoints for
   * existing trips.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value vehicle_pickup_straight_line_distance_meters = 11 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The vehiclePickupStraightLineDistanceMeters.
   */
  com.google.protobuf.Int32Value getVehiclePickupStraightLineDistanceMeters();
  /**
   *
   *
   * <pre>
   * Required. The straight-line distance between the vehicle and the pickup
   * point specified in the request, including intermediate waypoints for
   * existing trips.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value vehicle_pickup_straight_line_distance_meters = 11 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.Int32ValueOrBuilder getVehiclePickupStraightLineDistanceMetersOrBuilder();

  /**
   *
   *
   * <pre>
   * The complete vehicle's driving ETA to the drop off point
   * specified in the request. The ETA includes any required visits for active
   * trips that must be completed before the vehicle visits the dropoff_point
   * specified in the request. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the ETA for the vehicle to reach
   * the dropoff_point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_dropoff_eta = 4;</code>
   *
   * @return Whether the vehicleDropoffEta field is set.
   */
  boolean hasVehicleDropoffEta();
  /**
   *
   *
   * <pre>
   * The complete vehicle's driving ETA to the drop off point
   * specified in the request. The ETA includes any required visits for active
   * trips that must be completed before the vehicle visits the dropoff_point
   * specified in the request. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the ETA for the vehicle to reach
   * the dropoff_point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_dropoff_eta = 4;</code>
   *
   * @return The vehicleDropoffEta.
   */
  com.google.protobuf.Timestamp getVehicleDropoffEta();
  /**
   *
   *
   * <pre>
   * The complete vehicle's driving ETA to the drop off point
   * specified in the request. The ETA includes any required visits for active
   * trips that must be completed before the vehicle visits the dropoff_point
   * specified in the request. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the ETA for the vehicle to reach
   * the dropoff_point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_dropoff_eta = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVehicleDropoffEtaOrBuilder();

  /**
   *
   *
   * <pre>
   * The vehicle's driving distance (in meters) from the pickup point
   * to the drop off point specified in the request. The distance is only
   * between the two points and does not include the vehicle location or any
   * other points that must be visited before the vehicle visits either the
   * pickup point or dropoff point. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the distance from the pickup to
   * dropoff points specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_to_dropoff_distance_meters = 5;</code>
   *
   * @return Whether the vehiclePickupToDropoffDistanceMeters field is set.
   */
  boolean hasVehiclePickupToDropoffDistanceMeters();
  /**
   *
   *
   * <pre>
   * The vehicle's driving distance (in meters) from the pickup point
   * to the drop off point specified in the request. The distance is only
   * between the two points and does not include the vehicle location or any
   * other points that must be visited before the vehicle visits either the
   * pickup point or dropoff point. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the distance from the pickup to
   * dropoff points specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_to_dropoff_distance_meters = 5;</code>
   *
   * @return The vehiclePickupToDropoffDistanceMeters.
   */
  com.google.protobuf.Int32Value getVehiclePickupToDropoffDistanceMeters();
  /**
   *
   *
   * <pre>
   * The vehicle's driving distance (in meters) from the pickup point
   * to the drop off point specified in the request. The distance is only
   * between the two points and does not include the vehicle location or any
   * other points that must be visited before the vehicle visits either the
   * pickup point or dropoff point. The value will only be populated when a
   * dropoff_point is specified in the request. An empty value indicates
   * a failure in calculating the distance from the pickup to
   * dropoff points specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value vehicle_pickup_to_dropoff_distance_meters = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getVehiclePickupToDropoffDistanceMetersOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The trip type of the request that was used to calculate the ETA
   * to the pickup point.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TripType trip_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for tripType.
   */
  int getTripTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The trip type of the request that was used to calculate the ETA
   * to the pickup point.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TripType trip_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tripType.
   */
  google.maps.fleetengine.v1.TripType getTripType();

  /**
   *
   *
   * <pre>
   * The ordered list of waypoints used to calculate the ETA. The list
   * will include the vehicle location, the pickup/drop off points of active
   * trips for the vehicle and the pickup/dropoff points provided in the
   * request. An empty list indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Waypoint vehicle_trips_waypoints = 7;</code>
   */
  java.util.List<google.maps.fleetengine.v1.Waypoint> getVehicleTripsWaypointsList();
  /**
   *
   *
   * <pre>
   * The ordered list of waypoints used to calculate the ETA. The list
   * will include the vehicle location, the pickup/drop off points of active
   * trips for the vehicle and the pickup/dropoff points provided in the
   * request. An empty list indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Waypoint vehicle_trips_waypoints = 7;</code>
   */
  google.maps.fleetengine.v1.Waypoint getVehicleTripsWaypoints(int index);
  /**
   *
   *
   * <pre>
   * The ordered list of waypoints used to calculate the ETA. The list
   * will include the vehicle location, the pickup/drop off points of active
   * trips for the vehicle and the pickup/dropoff points provided in the
   * request. An empty list indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Waypoint vehicle_trips_waypoints = 7;</code>
   */
  int getVehicleTripsWaypointsCount();
  /**
   *
   *
   * <pre>
   * The ordered list of waypoints used to calculate the ETA. The list
   * will include the vehicle location, the pickup/drop off points of active
   * trips for the vehicle and the pickup/dropoff points provided in the
   * request. An empty list indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Waypoint vehicle_trips_waypoints = 7;</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.WaypointOrBuilder>
      getVehicleTripsWaypointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The ordered list of waypoints used to calculate the ETA. The list
   * will include the vehicle location, the pickup/drop off points of active
   * trips for the vehicle and the pickup/dropoff points provided in the
   * request. An empty list indicates a failure in calculating ETA for the
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Waypoint vehicle_trips_waypoints = 7;</code>
   */
  google.maps.fleetengine.v1.WaypointOrBuilder getVehicleTripsWaypointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Type of the vehicle match.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleMatch.VehicleMatchType vehicle_match_type = 8;</code>
   *
   * @return The enum numeric value on the wire for vehicleMatchType.
   */
  int getVehicleMatchTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the vehicle match.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleMatch.VehicleMatchType vehicle_match_type = 8;</code>
   *
   * @return The vehicleMatchType.
   */
  google.maps.fleetengine.v1.VehicleMatch.VehicleMatchType getVehicleMatchType();

  /**
   *
   *
   * <pre>
   * The method the caller requested for sorting vehicle matches.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder requested_ordered_by = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for requestedOrderedBy.
   */
  int getRequestedOrderedByValue();
  /**
   *
   *
   * <pre>
   * The method the caller requested for sorting vehicle matches.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder requested_ordered_by = 9;
   * </code>
   *
   * @return The requestedOrderedBy.
   */
  google.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder getRequestedOrderedBy();

  /**
   *
   *
   * <pre>
   * The actual method that is used to order this vehicle. In normal cases this
   * will match the 'order_by' field from the request, however in certain
   * circumstances such as a failure of google maps backends, a different method
   * may be used (such as PICKUP_POINT_STRAIGHT_DISTANCE).
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder ordered_by = 10;</code>
   *
   * @return The enum numeric value on the wire for orderedBy.
   */
  int getOrderedByValue();
  /**
   *
   *
   * <pre>
   * The actual method that is used to order this vehicle. In normal cases this
   * will match the 'order_by' field from the request, however in certain
   * circumstances such as a failure of google maps backends, a different method
   * may be used (such as PICKUP_POINT_STRAIGHT_DISTANCE).
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder ordered_by = 10;</code>
   *
   * @return The orderedBy.
   */
  google.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder getOrderedBy();
}
