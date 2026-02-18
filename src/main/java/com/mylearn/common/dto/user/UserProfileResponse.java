package com.mylearn.common.dto.user;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * Response body for GET /api/v1/users/me and GET /api/v1/users/{userId} Provides comprehensive
 * profile information.
 */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UserProfileResponse {
  UUID userId;
  String fullName;
  String bio;
  String profilePictureUrl;
  UserRole role;
}
