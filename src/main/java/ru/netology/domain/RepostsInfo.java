package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean pressed; //сделан ли репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }
}
