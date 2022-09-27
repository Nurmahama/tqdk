package com.Telebe.ImtahanMerkezi.Service;

import com.Telebe.ImtahanMerkezi.Model.Acount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface AcountServiceMetod {

    List<Acount> findal();
    Acount findid(Long id);
    void creat (Acount acount);
    void insert (Acount acount,Long id);

}
