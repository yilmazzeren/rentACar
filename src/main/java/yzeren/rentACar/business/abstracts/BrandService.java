package yzeren.rentACar.business.abstracts;

import yzeren.rentACar.business.requests.CreateBrandRequest;
import yzeren.rentACar.business.requests.UpdateBrandRequest;
import yzeren.rentACar.business.responses.GetAllBrandsResponse;
import yzeren.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);

}
