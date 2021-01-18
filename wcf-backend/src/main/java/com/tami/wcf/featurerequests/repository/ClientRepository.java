package com.mouni.wcf.featurerequests.repository;

import com.mouni.wcf.featurerequests.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
