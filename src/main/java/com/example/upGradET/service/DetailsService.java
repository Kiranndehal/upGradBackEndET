package com.example.upGradET.service;

import com.example.upGradET.model.Details;
import com.example.upGradET.repository.DetailsRepository;
import com.example.upGradET.repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;
    @Autowired
    private SearchRepo searchRepo;



    public void addCredentials(Details details) {

        detailsRepository.credentialsAdd(details);
    }

    public List<Details> getAllDetails() {
       return detailsRepository.getAllDetails();
    }

    public Details getDetail(Integer detailId) {
        return detailsRepository.getDetail(detailId);
    }

    public void updateDetails(Details updatedDetail) {
        detailsRepository.updateDetails(updatedDetail);
    }

    public void deleteDetail(Integer detailId) {
        detailsRepository.deleteDetail(detailId);
    }



    public Details findByUser(String name) {
        return searchRepo.findByName(name);
    }
}
