package com.design.patterns.q1.ingredents;

/**
 * Created by gauravv7 on 16/4/17.
 */
public enum Topping {

    TOMATO {
        public float getCost(){
            return 30;
        }
    }, PANNER{
        public float getCost(){
            return 35;
        }
    }, JALAPENO{
        public float getCost(){
            return 20;
        }
    }, CAPSICUM {
        public float getCost(){
            return 20;
        }
    }, TANGY_CHEESE{
        public float getCost(){
            return 20;
        }
    }, CHICKEN{
        public float getCost(){
            return 50;
        }
    };

    public abstract float getCost();
}
