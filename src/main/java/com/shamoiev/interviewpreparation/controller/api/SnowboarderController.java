package com.shamoiev.interviewpreparation.controller.api;

import com.shamoiev.interviewpreparation.entity.Snowboarder;
import com.shamoiev.interviewpreparation.service.SnowboarderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snowboarders")
public class SnowboarderController {

    private final SnowboarderService snowBoarderService;

    public SnowboarderController(SnowboarderService snowBoarderService) {
        this.snowBoarderService = snowBoarderService;
    }

    @GetMapping
    public List<Snowboarder> getAllSnowboarders() {
        return snowBoarderService.getAll();
    }

    @GetMapping("{phoneNumber}")
    public Snowboarder getSnowboarder(@PathVariable String phoneNumber) {
        return snowBoarderService.getSnowBoarder(phoneNumber);
    }

    @PostMapping
    public Snowboarder createSnowboarder(@RequestBody Snowboarder snowboarder) {
        return snowBoarderService.createSnowBoarder(snowboarder);
    }
}
