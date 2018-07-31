package me.jhen.react;

/**
 * Created by StevenCheuk on 2018/5/30.
 */

public class IconIndicators {

    public String packageName="";
    public int num = 0;
    public boolean received = false;

    public IconIndicators() {
    }

    public IconIndicators(String packageName, int num, boolean received) {
        this.packageName = packageName;
        this.num = num;
        this.received = received;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }
}
