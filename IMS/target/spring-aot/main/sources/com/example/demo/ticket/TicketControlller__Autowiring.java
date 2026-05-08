package com.example.demo.ticket;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TicketControlller}.
 */
@Generated
public class TicketControlller__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TicketControlller apply(RegisteredBean registeredBean, TicketControlller instance) {
    instance.service = AutowiredFieldValueResolver.forRequiredField("service").resolve(registeredBean);
    return instance;
  }
}
