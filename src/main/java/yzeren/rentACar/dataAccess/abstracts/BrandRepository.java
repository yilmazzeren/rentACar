package yzeren.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import yzeren.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
