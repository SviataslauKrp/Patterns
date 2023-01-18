package org.example.abstrFactrory;

public class BlackLegsServiceImpl implements LegsService {
    @Override
    public Legs knitLegs() {
        return new Legs("black legs");
    }
}
