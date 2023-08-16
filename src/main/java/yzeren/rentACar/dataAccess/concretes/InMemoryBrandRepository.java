package yzeren.rentACar.dataAccess.concretes;

import org.springframework.stereotype.Repository;
import yzeren.rentACar.dataAccess.abstracts.BrandRepository;
import yzeren.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sınıf bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Tesla"));
        brands.add(new Brand(3,"Renault"));
        brands.add(new Brand(4,"Mercedes"));
        brands.add(new Brand(5,"Fiat"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
