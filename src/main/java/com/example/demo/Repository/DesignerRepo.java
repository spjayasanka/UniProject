package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Designer;

import java.util.List;

@Repository
public interface DesignerRepo extends CrudRepository<Designer, Integer> {
    List<Designer> findById(int id);

}
