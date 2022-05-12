package com.estate.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/app")
public class MyhausController {

    @Get(uri="/properties", produces = MediaType.APPLICATION_JSON)
    public String getProperties() {
        return "Example Response";
    }
}