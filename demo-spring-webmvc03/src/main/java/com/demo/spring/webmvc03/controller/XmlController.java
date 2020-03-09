package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Controller
@RequestMapping("/xml")
public class XmlController {
    @RequestMapping("")
    @ResponseBody
    public String index() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        User user = new User();
        user.setName("foo");
        user.setAge(15);

        StringWriter w = new StringWriter();
        marshaller.marshal(user, w);
        return w.toString();
    }
}
