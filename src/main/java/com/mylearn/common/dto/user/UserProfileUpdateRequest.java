package com.mylearn.common.dto.user;

import lombok.Builder;
import lombok.Value;

/**
 * Request body for PUT /api/v1/users/me Allows authenticated users to update their profile
 * information.
 */
@Value
@Builder
public class UserProfileUpdateRequest {
  String fullName;
  String bio;
  String profilePictureUrl;
}
