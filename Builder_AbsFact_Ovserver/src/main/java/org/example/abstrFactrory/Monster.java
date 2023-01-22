package org.example.abstrFactrory;

import lombok.ToString;

@ToString
public class Monster {

    private Arms arms;
    private Legs legs;
    private Body body;
    private Head head;


    public static final class MonsterBuilder {
        private Arms arms;
        private Legs legs;
        private Body body;
        private Head head;

        private MonsterBuilder() {
        }

        public static MonsterBuilder builder() {
            return new MonsterBuilder();
        }

        public MonsterBuilder withArms(Arms arms) {
            this.arms = arms;
            return this;
        }

        public MonsterBuilder withLegs(Legs legs) {
            this.legs = legs;
            return this;
        }

        public MonsterBuilder withBody(Body body) {
            this.body = body;
            return this;
        }

        public MonsterBuilder withHead(Head head) {
            this.head = head;
            return this;
        }

        public Monster build() {
            Monster monster = new Monster();
            monster.legs = this.legs;
            monster.arms = this.arms;
            monster.head = this.head;
            monster.body = this.body;
            return monster;
        }
    }
}
