package com.estate;

import io.micronaut.http.annotation.*;

@Controller("/myhaus")
public class MyhausController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}