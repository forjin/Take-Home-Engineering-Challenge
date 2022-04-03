package com.microsoft.bsb.service;

import com.microsoft.bsb.model.BSB;
import com.microsoft.bsb.repository.BSBRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BSBServiceImpl implements BSBService {
    private static Logger logger = LogManager.getLogger(BSBServiceImpl.class);

    @Autowired
    BSBRepository bsbRepository;

    @Override
    public List<BSB> getAll() {
        return bsbRepository.getAll();
    }

    @Override
    public Optional<BSB> getBSBById(String id) {
        return bsbRepository.findById(id);
    }
}