package yzeren.rentACar.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import yzeren.rentACar.core.utilities.exceptions.BusinessException;
import yzeren.rentACar.dataAccess.abstracts.BrandRepository;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand name already exists");
        }
    }
}
