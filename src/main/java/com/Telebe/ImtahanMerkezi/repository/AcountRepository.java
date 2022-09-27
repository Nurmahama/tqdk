package com.Telebe.ImtahanMerkezi.repository;

import com.Telebe.ImtahanMerkezi.Model.Acount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AcountRepository extends JpaRepository <Acount, Long > {
}
