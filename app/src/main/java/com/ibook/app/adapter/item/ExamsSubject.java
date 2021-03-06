package com.ibook.app.adapter.item;

/**
 * Created by Monarchy on 09/12/2016.
 */

public class ExamsSubject {
    private String id;
    private String name;
    private int icon;

    public ExamsSubject(String id, String name, int icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
