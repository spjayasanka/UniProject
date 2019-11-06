package com.example.demo.controller;

import com.example.demo.Entity.Designer;
import com.example.demo.Repository.DesignerRepo;
import com.example.demo.Service.DesignerService;
import com.example.demo.dto.DesignerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class DesignerController {

	@Autowired
	private DesignerService designerService;


	@PostMapping(value = "/saveDesigner")
	public void saveDesigner(@RequestBody DesignerDTO dto) {
		designerService.saveDesigner(dto);
	}

	@GetMapping(value = "/getAllDesigners")
    public List<Designer> findAllDesigners(){
		return designerService.getAllDesigners();
    }

    @DeleteMapping(value = "/deleteAllDesigners")
	public void deleteAllDesigner(){
		designerService.deleteAllDesigners();
	}

	@DeleteMapping(value = "/deleteDesignerById")
	public void deleteById(){
		int deleteId = 0;
		designerService.deleteById(deleteId);
	}



}

//	@RequestMapping("/api/adddesigner")
//	public @Valid Designer adddesigner(@Valid @RequestBody Designer designer) {
//		return repo.save(designer);
//		//return "home.jsp";
//	}
	
//	//@GetMapping(value = "/test")
//	@PostMapping(value = "/adddesigner")
//	public String adddesigner(@RequestBody DesignerDTO designerDTO){
//		return "test";
//	}
//	public String test() {
//		return "Hello";
//	}



