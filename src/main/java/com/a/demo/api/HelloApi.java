package com.a.demo.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Hu JinQuan
 * @Date 2018/11/2 16:02
 */
@Api(tags = "Hello")
@RestController
@RequestMapping("/hello")
public class HelloApi {

    @ApiOperation(value = "Hello", notes = "Hello")
    @RequestMapping(value = "/hello", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity consultList(
            @ApiParam(value = "text") @RequestParam(value = "text", required = false) String text) {
        return ResponseEntity.ok(text);
    }
}