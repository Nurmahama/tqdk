package com.Telebe.ImtahanMerkezi.Controler;

import com.Telebe.ImtahanMerkezi.Model.Acount;
import com.Telebe.ImtahanMerkezi.Service.AcountServiceMetod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/first")

public class RestControler {

    @Autowired
    AcountServiceMetod acountServiceMetod;

    @GetMapping(value = "/al")
    public List<Acount> findal() {
        List<Acount> FindAl = acountServiceMetod.findal();

        return FindAl;

    }
    @GetMapping (value = "/id{id}")

    public Acount findid (@PathVariable long id) {
        Acount acount = acountServiceMetod.findid(id);

        return acount;

    }

    @PostMapping(value = "/creat")
    public void creat(@RequestBody Acount acount) {
        acountServiceMetod.creat(acount);
    }
    @PutMapping (value = "/insert{id}")

    public  void insert (@PathVariable Long id , @RequestBody Acount acount) {

        acountServiceMetod.insert(acount,id);
    }
 }
