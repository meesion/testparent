package com.wasu.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.wasu.testservice.api.ServiceApi;
import com.wasu.testservice.model.Person;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0", timeout = 6000, retries = 0)
public class PersonProvider implements ServiceApi{
    @Override
    public Person getPerson() {
        Person person = new Person();
        person.setAge(18);
        person.setName("xiaoming");
        return person;
    }
}
