package yzeren.rentACar.business.abstracts;

import yzeren.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
