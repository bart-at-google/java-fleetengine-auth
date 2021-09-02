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

/**
 *
 *
 * <pre>
 * A set of values that specify the vehicle's navigation status.
 * </pre>
 *
 * Protobuf enum {@code maps.fleetengine.v1.NavigationStatus}
 */
public enum NavigationStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified navigation status.
   * </pre>
   *
   * <code>UNKNOWN_NAVIGATION_STATUS = 0;</code>
   */
  UNKNOWN_NAVIGATION_STATUS(0),
  /**
   *
   *
   * <pre>
   * The Driver app's navigation is in FREE_NAV mode.
   * </pre>
   *
   * <code>NO_GUIDANCE = 1;</code>
   */
  NO_GUIDANCE(1),
  /**
   *
   *
   * <pre>
   * Turn-by-turn navigation starts and the Driver app navigation enters
   * GUIDED_NAV mode showing the green header, route, and destination marker.
   * </pre>
   *
   * <code>ENROUTE_TO_DESTINATION = 2;</code>
   */
  ENROUTE_TO_DESTINATION(2),
  /**
   *
   *
   * <pre>
   * Vehicle has gone off the suggested route.
   * </pre>
   *
   * <code>OFF_ROUTE = 3;</code>
   */
  OFF_ROUTE(3),
  /**
   *
   *
   * <pre>
   * The vehicle is within 50m of the destination and onArrival was
   * automatically triggered.
   * </pre>
   *
   * <code>ARRIVED_AT_DESTINATION = 4;</code>
   */
  ARRIVED_AT_DESTINATION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified navigation status.
   * </pre>
   *
   * <code>UNKNOWN_NAVIGATION_STATUS = 0;</code>
   */
  public static final int UNKNOWN_NAVIGATION_STATUS_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The Driver app's navigation is in FREE_NAV mode.
   * </pre>
   *
   * <code>NO_GUIDANCE = 1;</code>
   */
  public static final int NO_GUIDANCE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Turn-by-turn navigation starts and the Driver app navigation enters
   * GUIDED_NAV mode showing the green header, route, and destination marker.
   * </pre>
   *
   * <code>ENROUTE_TO_DESTINATION = 2;</code>
   */
  public static final int ENROUTE_TO_DESTINATION_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Vehicle has gone off the suggested route.
   * </pre>
   *
   * <code>OFF_ROUTE = 3;</code>
   */
  public static final int OFF_ROUTE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The vehicle is within 50m of the destination and onArrival was
   * automatically triggered.
   * </pre>
   *
   * <code>ARRIVED_AT_DESTINATION = 4;</code>
   */
  public static final int ARRIVED_AT_DESTINATION_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NavigationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NavigationStatus forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN_NAVIGATION_STATUS;
      case 1:
        return NO_GUIDANCE;
      case 2:
        return ENROUTE_TO_DESTINATION;
      case 3:
        return OFF_ROUTE;
      case 4:
        return ARRIVED_AT_DESTINATION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NavigationStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NavigationStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<NavigationStatus>() {
        public NavigationStatus findValueByNumber(int number) {
          return NavigationStatus.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return google.maps.fleetengine.v1.FleetEngine.getDescriptor().getEnumTypes().get(3);
  }

  private static final NavigationStatus[] VALUES = values();

  public static NavigationStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NavigationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maps.fleetengine.v1.NavigationStatus)
}
