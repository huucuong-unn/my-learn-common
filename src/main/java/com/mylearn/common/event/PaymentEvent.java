package com.mylearn.common.event;

import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * Event published by the order-service upon successful payment. Consumed by the
 * notification-service to send a receipt email.
 */
@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class PaymentEvent {

  // Unique ID for the event message
  UUID eventId;

  // ID of the user who made the payment
  UUID userId;

  // ID of the course purchased
  UUID courseId;

  // Total amount paid (in cents)
  Integer amountCents;

  // Stripe or internal order confirmation number
  String confirmationNumber;

  // Timestamp when the payment was processed
  Instant timestamp;

  // The intended type of notification to send (e.g., email receipt)
  NotificationType type;
}
