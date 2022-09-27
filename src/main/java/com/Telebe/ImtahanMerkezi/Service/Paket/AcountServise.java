package com.Telebe.ImtahanMerkezi.Service.Paket;

import com.Telebe.ImtahanMerkezi.Model.Acount;
import com.Telebe.ImtahanMerkezi.Service.AcountServiceMetod;
import com.Telebe.ImtahanMerkezi.repository.AcountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AcountServise implements AcountServiceMetod {

     @Autowired
    AcountRepository acountRepository;

    @Override
    public List<Acount> findal() {

        return acountRepository.findAll();

    }

    @Override
    public Acount findid(Long id) {
        Acount acount = acountRepository.findById(id).get();
        return acount;
    }

    @Override
    public void creat(Acount acount) {
        acountRepository.save(acount);
    }

    @Override
    public void insert(Acount acount, Long id) {

       Acount acount1 = findid(id);

       if (id == 70) {

           acount1.setId(acount.getId());
           acount1.setName(acount.getName());
           acount1.setSurname(acount.getSurname());
           acount1.setAvgMath(acount.getAvgMath());
           acount1.setAvgGeography(acount.getAvgGeography());
           acount1.setAvgExcamel(acount.getAvgExcamel() + acount.getAvgMath() + acount.getAvgGeography() / 3);
           acountRepository.save(acount1);
       }


    }
}
