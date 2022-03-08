package hello.servlet.web.servletmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class controllertest{
    @RequestMapping("/test")
    public String test(Map<String,Object> model){
        model.put("test","this is test");
        return "next";
    }
}
