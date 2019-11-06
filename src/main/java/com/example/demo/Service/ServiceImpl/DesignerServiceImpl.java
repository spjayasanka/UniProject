package com.example.demo.Service.ServiceImpl;

import com.example.demo.Entity.Designer;
import com.example.demo.Repository.DesignerRepo;
import com.example.demo.Service.DesignerService;
import com.example.demo.dto.DesignerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DesignerServiceImpl implements DesignerService {

    @Autowired
    private DesignerRepo designerRepo;

    @Override
    public void saveDesigner(DesignerDTO dto) {
        Designer designer = new Designer();
        designer.setFirstname(dto.getFirstname());
        designer.setLastname(dto.getLastname());
        designer.setEmail(dto.getEmail());
        designer.setPassword(dto.getPassword());
        designer.setAddress(dto.getAddress());
        designer.setPhone(dto.getPhone());

        designerRepo.save(designer);
    }

    @Override
    public List<Designer> getAllDesigners() {
        return (List<Designer>) designerRepo.findAll();
    }

    @Override
    public void deleteAllDesigners() {
        designerRepo.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        designerRepo.deleteById(id);
    }


}
