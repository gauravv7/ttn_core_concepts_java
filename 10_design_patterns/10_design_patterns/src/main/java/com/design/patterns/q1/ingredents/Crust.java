package com.design.patterns.q1.ingredents;

/**
 * Created by gauravv7 on 16/4/17.
 */
public enum Crust {

    THIN  {
        public float getCost(){
            return 70f;
        }
    } , STUFFED{
        public float getCost(){
            return 90f;
        }
    };

    public abstract float getCost();
}
