package com.mylearn.common.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * Request body for PUT /api/v1/users/me Allows authenticated users to update their profile
 * information.
 */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UserProfileUpdateRequest {
  String fullName;
  String bio;
  String profilePictureUrl;
}
