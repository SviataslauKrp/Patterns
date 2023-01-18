package org.example.builder;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        House house = House.HouseBuilder
                .builder()
                .withFloor("floor")
                .withRooms(List.of(new Room(Room.RoomType.KITCHEN),
                        new Room(Room.RoomType.BATHROOM),
                        new Room(Room.RoomType.BEDROOM),
                        new Room(Room.RoomType.LIVING_ROOM)))
                .withRoof("roof")
                .withPool("pool")
                .withHasLawn(true).build();

        System.out.println(house);


    }

}
