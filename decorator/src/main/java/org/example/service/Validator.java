package org.example.service;

import org.example.domain.UserEntity;

public interface Validator {
    void validateID(UserEntity userEntity);
}
