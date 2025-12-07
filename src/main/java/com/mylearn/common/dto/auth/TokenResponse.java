package com.mylearn.common.dto.auth;

import lombok.Builder;
import lombok.Value;

/** Response body for POST /api/v1/auth/login and POST /api/v1/auth/refresh */
@Value
@Builder
public class TokenResponse {
  String accessToken;
  String refreshToken;
  Long expiresIn; // Time in seconds until accessToken expires
}
