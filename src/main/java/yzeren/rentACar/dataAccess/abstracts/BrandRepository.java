package yzeren.rentACar.dataAccess.abstracts;

import yzeren.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
