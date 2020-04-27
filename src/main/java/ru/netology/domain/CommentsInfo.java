package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean can_close; //может ли закрыть комменты
    private boolean can_open; //есть ли доступ к открытию комментов

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCan_close() {
        return can_close;
    }

    public void setCan_close(boolean can_close) {
        this.can_close = can_close;
    }

    public boolean isCan_open() {
        return can_open;
    }

    public void setCan_open(boolean can_open) {
        this.can_open = can_open;
    }
}
