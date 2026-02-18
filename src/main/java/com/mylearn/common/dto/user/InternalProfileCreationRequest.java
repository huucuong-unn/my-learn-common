package com.mylearn.common.dto.user;

import com.mylearn.common.enums.UserRole;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * Request DTO for creating a profile post-registration. This will be used internally
 * (service-to-service) or asynchronously (Kafka) when a user successfully registers in the
 * auth-service.
 */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class InternalProfileCreationRequest {
  UUID userId;
  String fullName;
  UserRole role;
}
