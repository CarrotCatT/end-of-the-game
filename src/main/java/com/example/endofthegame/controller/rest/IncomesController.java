package com.example.endofthegame.controller.rest;

import com.example.endofthegame.entity.Income;
import com.example.endofthegame.service.IncomesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/api")
public class IncomesController {

    private final IncomesService service;

    public IncomesController(IncomesService service) {
        this.service = service;
    }

    // TODO: handle paging and sorting
    @GetMapping("/incomes")
    public List<Income> getAllIncomes() {
        log.info("getting all incomes");

        return service.readAllIncomes();
    }
}
