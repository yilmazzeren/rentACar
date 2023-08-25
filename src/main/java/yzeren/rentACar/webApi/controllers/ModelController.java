package yzeren.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import yzeren.rentACar.business.abstracts.ModelService;
import yzeren.rentACar.business.requests.CreateModelRequest;
import yzeren.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelController {
    private ModelService modelService;

    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add( CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }
}
