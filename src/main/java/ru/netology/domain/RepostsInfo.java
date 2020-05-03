package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean isReposted; //сделан ли репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isReposted() {
        return isReposted;
    }

    public void setIsReposted(boolean isReposted) {
        this.isReposted = isReposted;
    }
}
