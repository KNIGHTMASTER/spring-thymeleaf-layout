package com.zisal.springthymeleaflayout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 2/7/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class ExampleController {

    @GetMapping("/example")
    public String display() {
        return "example";
    }
}
