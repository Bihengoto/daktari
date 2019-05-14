//package com.mahugu.cdaktari;
//
//import android.content.Context;
//import android.widget.ArrayAdapter;
//
//public class MyAppointmentArrayAdapter extends ArrayAdapter {
//    private Context mContext;
//    private String[] mPatient;
//    private String[] mDates;
//
//    public MyAppointmentArrayAdapter(Context mContext, int resource, String[] mPatient, String[] dates) {
//        super(mContext, resource);
//        this.mContext = mContext;
//        this.mPatient = mPatient;
//        this.mDates = dates;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        String restaurant = mPatient[position];
//        String cuisine = mDates[position];
//        return String.format("Patient: %s \nDate of appointment: %s", restaurant, cuisine);
//    }
//
//    @Override
//    public int getCount() {
//        return mPatient.length;
//    }
//
//}
