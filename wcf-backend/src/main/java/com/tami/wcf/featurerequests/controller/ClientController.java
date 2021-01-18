package com.mouni.wcf.featurerequests.controller;

import com.mouni.wcf.featurerequests.model.Client;
import com.mouni.wcf.featurerequests.model.FeatureRequest;
import com.mouni.wcf.featurerequests.repository.ClientRepository;
import com.mouni.wcf.featurerequests.repository.FeatureRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    FeatureRequestRepository featureRequestRepository;

    @RequestMapping("/clients")
    public List<Client> clients() {
        return clientRepository.findAll();
    }

    @RequestMapping("clients/{id}/featurerequests")
    public List<FeatureRequest> getFeatureRequestsByClient(@PathVariable Long id) {
        Client client = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        return featureRequestRepository.findFeatureRequestsByClient(client);
    }

}
