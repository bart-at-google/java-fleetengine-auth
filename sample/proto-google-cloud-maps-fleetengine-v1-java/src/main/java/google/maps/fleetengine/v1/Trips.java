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
// source: google/maps/fleetengine/v1/trips.proto

package google.maps.fleetengine.v1;

public final class Trips {
  private Trips() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_v1_Trip_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_Trip_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_v1_StopLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_StopLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "&google/maps/fleetengine/v1/trips.proto"
          + "\022\023maps.fleetengine.v1\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032,google/maps/fleetengine/v1/fleetengin"
          + "e.proto\032\036google/protobuf/duration.proto\032"
          + "\037google/protobuf/timestamp.proto\032\036google"
          + "/protobuf/wrappers.proto\032\030google/type/latlng.proto\"\350\r\n"
          + "\004Trip\022\014\n"
          + "\004name\030\001 \001(\t\022\022\n\n"
          + "vehicle_id\030\002 \001(\t\0224\n"
          + "\013trip_status\030\003 \001(\0162\037.maps.fleetengine.v1.TripStatus\0220\n"
          + "\ttrip_type\030\004 \001(\0162\035.maps.fleetengine.v1.TripType\022;\n"
          + "\014pickup_point\030\005 \001(\0132%.maps.fleetengine.v1.TerminalLocation\022C\n"
          + "\023actual_pickup_point\030\026"
          + " \001(\0132!.maps.fleetengine.v1.StopLocationB\003\340A\004\022K\n"
          + "\033actual_pickup_arrival_point\030 "
          + " \001(\0132!.maps.fleetengine.v1.StopLocationB\003\340A\004\022/\n"
          + "\013pickup_time\030\006 \001(\0132\032.google.protobuf.Timestamp\022H\n"
          + "\031intermediate_destinations\030\016"
          + " \003(\0132%.maps.fleetengine.v1.TerminalLocation\022E\n"
          + "!intermediate_destinations_version\030\031"
          + " \001(\0132\032.google.protobuf.Timestamp\022&\n"
          + "\036intermediate_destination_index\030\017 \001(\005\022^\n"
          + ".actual_intermediate_destination_arrival_points\030!"
          + " \003(\0132!.maps.fleetengine.v1.StopLocationB\003\340A\004\022P\n"
          + " actual_intermediate_destinations\030\""
          + " \003(\0132!.maps.fleetengine.v1.StopLocationB\003\340A\004\022<\n\r"
          + "dropoff_point\030\007 \001(\0132%.maps.fleetengine.v1.TerminalLocation\022D\n"
          + "\024actual_dropoff_point\030\027"
          + " \001(\0132!.maps.fleetengine.v1.StopLocationB\003\340A\004\0220\n"
          + "\014dropoff_time\030\010 \001(\0132\032.google.protobuf.Timestamp\022C\n"
          + "\023remaining_waypoints\030\020"
          + " \003(\0132!.maps.fleetengine.v1.TripWaypointB\003\340A\003\022<\n"
          + "\021vehicle_waypoints\030\024 \003(\0132!.maps.fleetengine.v1.TripWaypoint\022\"\n"
          + "\005route\030\t \003(\0132\023.google.type.LatLng\022J\n"
          + "\037current_route_segment_end_point\030\030"
          + " \001(\0132!.maps.fleetengine.v1.TripWaypoint\022>\n"
          + "\031remaining_distance_meters\030\014"
          + " \001(\0132\033.google.protobuf.Int32Value\022>\n"
          + "\025eta_to_first_waypoint\030\r"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022H\n"
          + " remaining_time_to_first_waypoint\030\033"
          + " \001(\0132\031.google.protobuf.DurationB\003\340A\003\022?\n"
          + "\033remaining_waypoints_version\030\023"
          + " \001(\0132\032.google.protobuf.Timestamp\022E\n"
          + "!remaining_waypoints_route_version\030\035"
          + " \001(\0132\032.google.protobuf.Timestamp\022\034\n"
          + "\024number_of_passengers\030\n"
          + " \001(\005\022;\n\r"
          + "last_location\030\013 \001(\0132$.maps.fleetengine.v1.VehicleLocation\022\037\n"
          + "\027last_location_snappable\030\032 \001(\010\022+\n"
          + "\004view\030\037 \001(\0162\035.maps.fleetengine.v1.TripView:G\352AD\n"
          + "\037fleetengine.googleapis.com/Trip\022!providers/{provider}/trips/{trip}\"\225\001\n"
          + "\014StopLocation\022\'\n"
          + "\005point\030\001 \001(\0132\023.google.type.LatLngB\003\340A\002\022-\n"
          + "\ttimestamp\030\002 \001(\0132\032.google.protobuf.Timestamp\022-\n"
          + "\tstop_time\030\003 \001(\0132\032.google.protobuf.Timestamp*\342\001\n\n"
          + "TripStatus\022\027\n"
          + "\023UNKNOWN_TRIP_STATUS\020\000\022\007\n"
          + "\003NEW\020\001\022\025\n"
          + "\021ENROUTE_TO_PICKUP\020\002\022\025\n"
          + "\021ARRIVED_AT_PICKUP\020\003\022\'\n"
          + "#ARRIVED_AT_INTERMEDIATE_DESTINATION\020\007\022\'\n"
          + "#ENROUTE_TO_INTERMEDIATE_DESTINATION\020\010\022\026\n"
          + "\022ENROUTE_TO_DROPOFF\020\004\022\014\n"
          + "\010COMPLETE\020\005\022\014\n"
          + "\010CANCELED\020\006*\177\n"
          + "\031BillingPlatformIdentifier\022+\n"
          + "\'BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED\020\000\022\n\n"
          + "\006SERVER\020\001\022\007\n"
          + "\003WEB\020\002\022\013\n"
          + "\007ANDROID\020\003\022\007\n"
          + "\003IOS\020\004\022\n\n"
          + "\006OTHERS\020\005*G\n"
          + "\010TripView\022\031\n"
          + "\025TRIP_VIEW_UNSPECIFIED\020\000\022\007\n"
          + "\003SDK\020\001\022\027\n"
          + "\023JOURNEY_SHARING_V1S\020\002Br\n"
          + "\032google.maps.fleetengine.v1B\005TripsP\001ZEgoogle.golang.org/genproto/googleap"
          + "is/maps/fleetengine/v1;fleetengine\242\002\003CFEb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              google.maps.fleetengine.v1.FleetEngine.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_maps_fleetengine_v1_Trip_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_v1_Trip_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_v1_Trip_descriptor,
            new java.lang.String[] {
              "Name",
              "VehicleId",
              "TripStatus",
              "TripType",
              "PickupPoint",
              "ActualPickupPoint",
              "ActualPickupArrivalPoint",
              "PickupTime",
              "IntermediateDestinations",
              "IntermediateDestinationsVersion",
              "IntermediateDestinationIndex",
              "ActualIntermediateDestinationArrivalPoints",
              "ActualIntermediateDestinations",
              "DropoffPoint",
              "ActualDropoffPoint",
              "DropoffTime",
              "RemainingWaypoints",
              "VehicleWaypoints",
              "Route",
              "CurrentRouteSegmentEndPoint",
              "RemainingDistanceMeters",
              "EtaToFirstWaypoint",
              "RemainingTimeToFirstWaypoint",
              "RemainingWaypointsVersion",
              "RemainingWaypointsRouteVersion",
              "NumberOfPassengers",
              "LastLocation",
              "LastLocationSnappable",
              "View",
            });
    internal_static_maps_fleetengine_v1_StopLocation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_maps_fleetengine_v1_StopLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_v1_StopLocation_descriptor,
            new java.lang.String[] {
              "Point", "Timestamp", "StopTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    google.maps.fleetengine.v1.FleetEngine.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
