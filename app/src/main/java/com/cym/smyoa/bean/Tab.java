package com.cym.smyoa.bean;

/**
 * ========================
 * CYM
 */
public class Tab {
    private   String  title;
    private  int  icon;
    private  int   id;
    private Class  fragment;
    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Tab(Class fragment, int icon, String title) {
        this.fragment = fragment;
        this.icon = icon;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tab{" +
                "fragment=" + fragment +
                ", title='" + title + '\'' +
                ", icon=" + icon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tab)) return false;

        Tab tab = (Tab) o;

        if (icon != tab.icon) return false;
        if (!title.equals(tab.title)) return false;
        return fragment.equals(tab.fragment);

    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + icon;
        result = 31 * result + fragment.hashCode();
        return result;
    }
}
