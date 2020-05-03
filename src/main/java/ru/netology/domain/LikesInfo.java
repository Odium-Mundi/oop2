package ru.netology.domain;

public class LikesInfo {
    private boolean isLiked; //поставлен ли лайк
    private int count;

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean isLiked) {
        this.isLiked = isLiked;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
