package com.mylearn.common.dto.user;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

/**
 * Response body for GET /api/v1/users/me and GET /api/v1/users/{userId} Provides comprehensive
 * profile information.
 */
@Value
@Builder
public class UserProfileResponse {
  UUID userId;
  String fullName;
  String bio;
  String profilePictureUrl;
  UserRole role;
}
