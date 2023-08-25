package yzeren.rentACar.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import yzeren.rentACar.core.utilities.exceptions.BusinessException;
import yzeren.rentACar.dataAccess.abstracts.ModelRepository;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
    private ModelRepository modelRepository;

    public void checkIfBrandNameExists(String name){
        if(this.modelRepository.existsByName(name)){
            throw new BusinessException("Model name already exists");
        }
    }
}
