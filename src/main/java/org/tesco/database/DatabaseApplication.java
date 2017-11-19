package org.tesco.database;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseApplication {

    public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(DatabaseApplication.class, args);
	CamelContext camelContext = applicationContext.getBean(CamelContext.class);
	ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
	producerTemplate.requestBody("direct:start", "test");
    }
}
