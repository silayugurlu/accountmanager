package com.capgemini.assessment.web.rest.mapper;

import com.capgemini.assessment.service.model.input.customer.AddCustomerInput;
import com.capgemini.assessment.service.model.output.customer.AddCustomerOutput;
import com.capgemini.assessment.service.model.output.customer.GetCustomerOutput;
import com.capgemini.assessment.web.rest.request.customer.AddCustomerRequest;
import com.capgemini.assessment.web.rest.response.customer.AddCustomerResponse;
import com.capgemini.assessment.web.rest.response.customer.GetCustomerResponse;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

/**
 * Created by silayugurlu on 5/26/18.
 */
@Component
public class CustomerRestMapper extends ConfigurableMapper {


    /**
     * Configuration of data convertion for Customer from data layer to presentation url
     * @param factory
     */
    protected void configure(MapperFactory factory) {
        factory.classMap(AddCustomerRequest.class, AddCustomerInput.class)
                .byDefault()
                .register();

        factory.classMap(GetCustomerOutput.class, GetCustomerResponse.class)
                .byDefault()
                .register();


        factory.classMap(AddCustomerOutput.class, AddCustomerResponse.class)

                .field("id", "customerId")
                .byDefault()
                .register();

    }


}
