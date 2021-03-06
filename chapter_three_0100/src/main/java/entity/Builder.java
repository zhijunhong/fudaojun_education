package entity;

/**
 * Created by ZhijunHong on 2017/11/24.
 */

public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();
}

