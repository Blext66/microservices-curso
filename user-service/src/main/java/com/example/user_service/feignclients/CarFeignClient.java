package com.example.user_service.feignclients;

import com.example.user_service.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "car-service", url = "http://localhost:8002")
@RequestMapping("/car")
public interface CarFeignClient {

    @PostMapping()
    Car save(@RequestBody Car car);

    @GetMapping("/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") int userId);
}
