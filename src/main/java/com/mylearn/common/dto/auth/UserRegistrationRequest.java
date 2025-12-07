package com.mylearn.common.dto.auth;

import lombok.Builder;
import lombok.Value;

/** Request body for POST /api/v1/auth/register */
@Value
@Builder
public class UserRegistrationRequest {
  String email;
  String password;
  String fullName;
}
