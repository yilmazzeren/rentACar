package yzeren.rentACar.business.abstracts;

import yzeren.rentACar.business.requests.CreateModelRequest;
import yzeren.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest) ;
}
