package yzeren.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import yzeren.rentACar.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
