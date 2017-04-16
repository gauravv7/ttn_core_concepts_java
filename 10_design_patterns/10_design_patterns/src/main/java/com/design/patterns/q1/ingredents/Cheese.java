package com.design.patterns.q1.ingredents;

/**
 * Created by gauravv7 on 16/4/17.
 */
public enum Cheese {
    AMERICAN {
        public float getCost() {
            return 40;
        }
    }, ITALIAN {
        public float getCost() {
            return 60;
        }
    };

    public abstract float getCost();

}
