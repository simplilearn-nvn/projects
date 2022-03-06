package com.org.bmw.service;

import com.org.bmw.model.ModelName;

import java.util.List;

public interface ModelService {


    static void createModelrecord(ModelName bmw) {
    }

    static void updateModelrecord(ModelName modelName) {
    }

    static void deleteByAll(Integer id) {
    }

   public void create(ModelName bmw);
    public void update(ModelName bmw);
    public void delete(Integer id);
    public List<ModelName>getAll();

    void deleteId(Integer id);

    <ModelName> java.util.List<com.org.bmw.model.ModelName> GetAll();

    ModelName findModelNameById(Integer id);


    //void createModelrecords(ModelName bmw);
}
