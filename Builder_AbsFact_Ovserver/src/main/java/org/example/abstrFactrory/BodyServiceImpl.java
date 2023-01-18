package org.example.abstrFactrory;

public class BodyServiceImpl implements BodyService {
    @Override
    public Body knitBody() {
        return new Body();
    }
}
