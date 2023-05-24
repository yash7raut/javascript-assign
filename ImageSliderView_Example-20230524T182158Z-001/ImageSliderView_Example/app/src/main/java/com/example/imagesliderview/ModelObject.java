package com.example.imagesliderview;

public enum ModelObject {

    RED(R.string.red, R.layout.view_one),
    BLUE(R.string.blue, R.layout.view_two),
    GREEN(R.string.green, R.layout.view_three);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
