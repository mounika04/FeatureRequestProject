package com.mouni.wcf.featurerequests.repository;

import com.mouni.wcf.featurerequests.model.Client;
import com.mouni.wcf.featurerequests.model.FeatureRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeatureRequestRepository extends JpaRepository<FeatureRequest, Long> {

    List<FeatureRequest> findFeatureRequestsByClient(Client client);
}
