package com.mylearn.common.dto.auth;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

/** Response body for registration (also used in user-service). */
@Value
@Builder
public class UserResponse {
  UUID id;
  String email;
  UserRole role;
  String fullName;
}
