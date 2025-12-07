package com.mylearn.common.dto.auth;

import lombok.Builder;
import lombok.Value;

/** Request body for POST /api/v1/auth/login */
@Value
@Builder
public class LoginRequest {
  String email;
  String password;
}
