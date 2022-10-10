package pl.sdacademy.SpringBootRO40.rest;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/repo/") // localhost:8080/api/repo/
public class RestController {

    @RequestMapping(method = RequestMethod.GET, path="/hello")
    public String getMessage() {
        return "HELLO!";
    }


    @GetMapping(path="/hello2")
    public String getMessage2() {
        return "HELLO with GETMAPPING!";
    }

    @GetMapping(path = "/person/{id}")
    public String getPerson(@PathVariable String id ) {
        return "Am cautat persoana cu id: " + id;
    }

    //localhost:8080/api/repo/getCar?personName=Gigi&param2=serieSasiu
    @GetMapping("/getCar")
    public String getCar(@RequestParam String personName,
                         @RequestParam String param2) {
        return "Am cautat masina persoanei " + personName + " dupa param2" + param2;
    }

    @PostMapping(path="withHeaders")
    public String withHeaders(@RequestHeader String a,
                              @RequestHeader String b,
                              @RequestHeader String c) {
        return a + " " + b + " " + c ;
    }
}
