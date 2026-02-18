package com.mylearn.common.dto.auth;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/** Response body for registration (also used in user-service). */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UserResponse {
  UUID id;
  String email;
  UserRole role;
  String fullName;
}
