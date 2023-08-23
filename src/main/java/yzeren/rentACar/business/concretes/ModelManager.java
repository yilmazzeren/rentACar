package yzeren.rentACar.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import yzeren.rentACar.business.abstracts.ModelService;
import yzeren.rentACar.business.requests.CreateModelRequest;
import yzeren.rentACar.business.responses.GetAllBrandsResponse;
import yzeren.rentACar.business.responses.GetAllModelsResponse;
import yzeren.rentACar.core.utilities.mappers.ModelMapperService;
import yzeren.rentACar.dataAccess.abstracts.ModelRepository;
import yzeren.rentACar.entities.concretes.Brand;
import yzeren.rentACar.entities.concretes.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelsResponse> modelsResponse = models.stream()
                .map(model -> this.modelMapperService.forResponse().map(model,GetAllModelsResponse.class)).collect(Collectors.toList());
        return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest,Model.class);
        this.modelRepository.save(model);
    }
}
