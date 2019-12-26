package com.geekbrains.springbootproject.repositories;

import com.geekbrains.springbootproject.entities.DiskHib;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskHibRepository extends CrudRepository<DiskHib, Long> {
}
