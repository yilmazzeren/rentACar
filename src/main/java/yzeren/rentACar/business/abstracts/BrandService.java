package yzeren.rentACar.business.abstracts;

import yzeren.rentACar.business.requests.CreateBrandRequest;
import yzeren.rentACar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
