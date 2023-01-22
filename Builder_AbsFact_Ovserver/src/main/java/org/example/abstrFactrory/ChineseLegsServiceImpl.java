package org.example.abstrFactrory;

public class ChineseLegsServiceImpl implements LegsService {
    @Override
    public Legs knitLegs() {
        return new Legs("chinese legs");
    }
}
