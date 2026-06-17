package com.s2p.jobportel.service;

import com.s2p.jobportel.dto.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICompanyService {
public abstract List<CompanyDto> getAllCompanies();
}
