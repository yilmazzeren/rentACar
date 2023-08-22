package yzeren.rentACar.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import yzeren.rentACar.business.abstracts.BrandService;
import yzeren.rentACar.business.requests.CreateBrandRequest;
import yzeren.rentACar.business.requests.UpdateBrandRequest;
import yzeren.rentACar.business.responses.GetAllBrandsResponse;
import yzeren.rentACar.business.responses.GetByIdBrandResponse;
import yzeren.rentACar.core.utilities.mappers.ModelMapperService;
import yzeren.rentACar.dataAccess.abstracts.BrandRepository;
import yzeren.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        /*List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand:brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }*/

        // stream listeyi dolaşır => forEach ile aynı
        List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand =this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        /*Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());*/
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class); // createBrandRequest'i brand tipine çevir. aslında brand class'ını newleyip bize veriyor
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class); // updateBrandRequest'i brand tipine çevir. aslında brand class'ını newleyip bize veriyor
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

}
