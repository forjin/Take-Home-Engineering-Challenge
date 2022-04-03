package com.microsoft.bsb.service;

import com.microsoft.bsb.model.BSB;

import java.util.List;
import java.util.Optional;

public interface BSBService {
    List<BSB> getAll();
    Optional<BSB> getBSBById(String id);
}