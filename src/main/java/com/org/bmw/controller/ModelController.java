package com.org.bmw.controller;


import com.org.bmw.model.ModelName;
import com.org.bmw.repository.ModelRepository;
import com.org.bmw.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/bmw")

public abstract class ModelController {

    @Autowired
    ModelService modelService;                 // specified by class
    private ModelRepository modelRepository; //specified in video

    @PostMapping("/create")
    public void create(@RequestBody ModelName modelName){
        ModelService.createModelrecord(modelName);
    }

    @PutMapping("/update")
    public void update(@RequestBody ModelName modelName) {
        ModelService.updateModelrecord(modelName);
    }

    @DeleteMapping("/delete/{Id}")
    public List<ModelName>ByAll(Integer id){
        ModelService.deleteByAll(id);
        return null;
    }

    // method is specified in class
    @GetMapping("/retrieve/{Id}")
    public ModelName findModelNameById(@PathVariable Integer id){
        return modelService.findModelNameById(id);
    }

    // method as per video on youtube
    public List<ModelName> getAllModelName(){
        return modelRepository.findAll();
    }
}



