package ch.giannin.helloworldspringbootindocker.controller;

import ch.giannin.helloworldspringbootindocker.model.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getHello() {
        Hello hi = new Hello("World, Docker and Spring Boot!");
        return hi.toString();
    }

    @RequestMapping(value = "/{helloTo}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String createHello(@PathVariable String helloTo){
        Hello hi = new Hello(helloTo);
        return hi.toString();
    }


}
