package org.example.service.impl;

import org.example.domain.UserEntity;
import org.example.service.Validator;

public class IDValidatorImpl implements Validator {
    @Override
    public void validateID(UserEntity userEntity) {
        if (userEntity.getId() == null) throw  new RuntimeException("the user hasn't been found");
    }
}
