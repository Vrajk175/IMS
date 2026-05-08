package com.example.demo.ticket;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TicketControlller}.
 */
@Generated
public class TicketControlller__BeanDefinitions {
  /**
   * Get the bean definition for 'ticketControlller'.
   */
  public static BeanDefinition getTicketControlllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TicketControlller.class);
    InstanceSupplier<TicketControlller> instanceSupplier = InstanceSupplier.using(TicketControlller::new);
    instanceSupplier = instanceSupplier.andThen(TicketControlller__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
