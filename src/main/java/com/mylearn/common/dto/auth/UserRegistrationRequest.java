package com.mylearn.common.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/** Request body for POST /api/v1/auth/register */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UserRegistrationRequest {
  String email;
  String password;
  String fullName;
}
