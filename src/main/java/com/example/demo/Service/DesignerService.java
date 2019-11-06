package com.example.demo.Service;

import com.example.demo.Entity.Designer;
import com.example.demo.dto.DesignerDTO;

import java.util.List;

public interface DesignerService {
    void saveDesigner(DesignerDTO dto);
    List<Designer> getAllDesigners();
    void deleteAllDesigners();
    void deleteById(Integer id);
}
