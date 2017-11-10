package com.wasu.test.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wasu.testservice.api.ServiceApi;
import com.wasu.testservice.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class PersonConsumer {
    @Reference(version = "1.0.0")
    private ServiceApi serviceApi;

    public Person getOnePerson(){
        return serviceApi.getPerson();
    }
}
