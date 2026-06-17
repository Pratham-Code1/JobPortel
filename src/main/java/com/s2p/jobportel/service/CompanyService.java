package com.s2p.jobportel.service;

import com.s2p.jobportel.dto.CompanyDto;
import com.s2p.jobportel.entity.Company;
import com.s2p.jobportel.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService implements ICompanyService{

    private CompanyRepository companyRepository;

    @Autowired
    CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    @Override
    public  List<CompanyDto> getAllCompanies(){
        List<Company> companies=companyRepository.findAll();

        List<CompanyDto> list = new ArrayList<>();

        for(int i=0;i<companies.size();i++){
            Company company = companies.get(i);
            CompanyDto dto =mapToDto(company);
            list.add(dto);
        }
        return list;
    }

    private CompanyDto mapToDto(Company company) {
        CompanyDto companyDto = new CompanyDto();


        Long id = company.getId();
        companyDto.setId(id);

        String name =company.getName();
       companyDto.setName(name);

        String logo = company.getLogo();
        companyDto.setLogo(logo);

        String industry = company.getIndustry();
        companyDto.setIndustry(industry);

        String size = company.getSize();
       companyDto.setSize(size);

        BigDecimal rating = company.getRating();
        companyDto.setRating(rating);

        String locations = company.getLocations();
        companyDto.setLocations(locations);

        String founded = company.getFounded();
        companyDto.setFounded(founded);

        String description = company.getDescription();
       companyDto.setDescription(description);

        String employees = company.getEmployees();
       companyDto.setEmployees(employees);

        String website = company.getWebsite();
        companyDto.setWebsite(website);

        Instant createdAt= company.getCreatedAt();
        companyDto.setCreatedAt(createdAt);

        return companyDto;
    }
}
