package sajid.com.daggertest;

import java.util.Date;

class MyExampleImpl implements MyExample{

    private long mDate;
    @Override
    public long getDate() {
        return mDate;
    }

    MyExampleImpl(){
        mDate=new Date().getTime();
    }


}
