package com.philips.hc.iap.svc.digitaltwin;

import com.philips.hc.iap.svc.digitaltwin.service.EventParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.philips.hc.iap.svc.digitaltwin.service")
public class DemoDigitalTwinApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoDigitalTwinApplication.class, args);

	}



}
