package com.mylearn.common.event;

/**
 * Defines the type of notification being sent. Used by the notification-service to select the
 * correct template (e.g., email or push).
 */
public enum NotificationType {
  PAYMENT_SUCCESS,
  COURSE_ENROLLMENT,
  QUIZ_COMPLETED,
  PASSWORD_RESET
}
