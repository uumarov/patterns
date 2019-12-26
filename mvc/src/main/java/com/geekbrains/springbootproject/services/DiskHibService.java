package com.geekbrains.springbootproject.services;

import com.geekbrains.springbootproject.entities.DiskHib;
import com.geekbrains.springbootproject.repositories.DiskHibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DiskHibService {
    private DiskHibRepository diskHibRepository;

    @Autowired
    public void setDiskHibRepository(DiskHibRepository diskHibRepository) {
        this.diskHibRepository = diskHibRepository;
    }

    public List<DiskHib> getAllDisks() {
        return (List<DiskHib>)diskHibRepository.findAll();
    }
}
