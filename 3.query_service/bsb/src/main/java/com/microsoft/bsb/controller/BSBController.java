package com.microsoft.bsb.controller;


import com.microsoft.bsb.model.BSB;
import com.microsoft.bsb.model.EmptyJsonResponse;
import com.microsoft.bsb.service.BSBService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/service")
public class BSBController {
    private static Logger logger = LogManager.getLogger(BSBController.class);

    @Autowired
    BSBService bsbService;

    @GetMapping("/bsb")
    public @ResponseBody
    List<BSB> listAll() {
        logger.info("listAll called");
        return bsbService.getAll();
    }

    @GetMapping(value = "/bsb/{bsb}")
    public @ResponseBody
    Object getById(@PathVariable String bsb) {
        logger.info("getById called:" + bsb);
        Optional<BSB> result = bsbService.getBSBById(bsb);
        return result.isPresent() ? result.get() : new EmptyJsonResponse();
    }
}