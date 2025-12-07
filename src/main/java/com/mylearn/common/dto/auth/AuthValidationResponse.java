package com.mylearn.common.dto.auth;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

/**
 * Internal DTO for the gateway to validate a token and get user context. Response body for GET
 * /api/v1/auth/validate
 */
@Value
@Builder
public class AuthValidationResponse {
  UUID userId;
  UserRole role;
}
