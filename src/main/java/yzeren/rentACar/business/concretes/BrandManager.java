package yzeren.rentACar.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yzeren.rentACar.business.abstracts.BrandService;
import yzeren.rentACar.dataAccess.abstracts.BrandRepository;
import yzeren.rentACar.entities.concretes.Brand;

import java.util.List;

@Service // Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        System.out.println(brandRepository);
        return brandRepository.getAll();
    }
}
