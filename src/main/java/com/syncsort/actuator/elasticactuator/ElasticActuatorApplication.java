package com.syncsort.actuator.elasticactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class ElasticActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticActuatorApplication.class, args);
	}
	
}
	
/*	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
		return new TimedAspect(registry);
	}
*/
