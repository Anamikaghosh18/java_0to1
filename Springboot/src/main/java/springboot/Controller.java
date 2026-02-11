package springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello/{name}") // to connect to the api
    public Controller hello(@PathVariable String name){
        return new HelloResponse("Hello " + name);
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello" + name);
    }

}
