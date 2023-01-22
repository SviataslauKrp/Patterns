package org.example.builder;

import lombok.ToString;

import java.util.List;

@ToString
public class House {

    private String floor;
    private String roof;
    private List<Room> rooms;
    private String pool;
    private boolean hasLawn;

    @ToString
    public static final class HouseBuilder {
        private String floor;
        private String roof;
        private List<Room> rooms;
        private String pool;
        private boolean hasLawn;

        public static HouseBuilder builder() {
            return new HouseBuilder();
        }

        public HouseBuilder withFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder withRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder withRooms(List<Room> rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder withPool(String pool) {
            this.pool = pool;
            return this;
        }

        public HouseBuilder withHasLawn(boolean hasLawn) {
            this.hasLawn = hasLawn;
            return this;
        }

        public House build() {
            House house = new House();
            house.rooms = this.rooms;
            house.floor = this.floor;
            house.roof = this.roof;
            house.hasLawn = this.hasLawn;
            house.pool = this.pool;
            return house;
        }
    }
}
