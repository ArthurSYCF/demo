package com.a.demo.api;

import com.a.demo.service.ValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Hu JinQuan
 * @Date 2018/11/12
 **/
@Api(tags = "CRUD")
@RestController
@RequestMapping("/CRUD")
public class TestCRUDApi {

    private static final Logger LOG = LoggerFactory.getLogger(HelloApi.class);

    @Autowired
    ValueService valueService;

    @ApiOperation(value = "add", notes = "add")
    @RequestMapping(value = "/add", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity addValue(
            @ApiParam(value = "value", required = true) @RequestParam(value = "value") String value) {
        LOG.info(value);
        valueService.addValue(value);
        return ResponseEntity.ok(value);
    }

    @ApiOperation(value = "getAll", notes = "getAll")
    @RequestMapping(value = "/getAll", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity getAllValues() {

        return ResponseEntity.ok(valueService.getAllValues());
    }

    @ApiOperation(value = "delete", notes = "delete")
    @RequestMapping(value = "/delete", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity deleteValues(
            @ApiParam(value = "id", required = true) @RequestParam(value = "id") String id) {
        valueService.deleteValue(id);
        return ResponseEntity.ok(null);
    }
}
