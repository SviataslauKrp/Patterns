package org.example.builder;

import lombok.ToString;

@ToString
public class Room {

    private RoomType type;

    public Room(RoomType type) {
        this.type = type;
    }

    public enum RoomType {
        BATHROOM,
        LIVING_ROOM,
        BEDROOM,
        KITCHEN
    }

}
