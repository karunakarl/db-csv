package org.tesco.database.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tesco.database.extensions.CustomBindyCsvDataFormat;
import org.tesco.database.model.Employee;
import org.tesco.database.repository.DataRepository;

@Component
public class DataBaseRoute extends RouteBuilder {
    
    @Autowired
    private DataRepository dataRepository;
    
    @Autowired
    private CustomBindyCsvDataFormat bindyCSVDataFromat;

    @Override
    public void configure() throws Exception {
	from("direct:start").routeId("readRoute").autoStartup(true).process(this::fetchEmployees).split(body()).marshal(bindyCSVDataFromat).to("file://data/output?fileName=Sample.txt&fileExist=Append");

    }
    
    private  void fetchEmployees(Exchange exchange){
	Employee employee = new Employee();
	employee.setId(1);
	employee.setFirstName("karunakar");
	employee.setLastName("reddy");
	dataRepository.save(employee);
	exchange.getIn().setBody(dataRepository.findAll());
    }
    
    

}
