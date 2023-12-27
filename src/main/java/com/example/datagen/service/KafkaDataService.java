package com.example.datagen.service;

import com.example.datagen.model.Data;

public interface KafkaDataService {

    void send(Data data);

}