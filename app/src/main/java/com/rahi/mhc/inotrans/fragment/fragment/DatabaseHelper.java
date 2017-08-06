package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MHC on 7/10/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static Context context;
   public static String DB_PATH = "/data/data/com.example.mhc.inotrans/databases/";

    public static int DATABASE_VERSION = 1;
    public static String DATABASE_NAME="bus.sqlite";
    public static String DATABASE_LOCATION=DB_PATH;
    public static String TABLE_NAME="buses";
    public static String COLOUMN_ID="id";
    public static String COLOUMN_NAME="busname";
    public static String COLOUMN_NUMBER="busnumber";


    public static String COLOUMN_STOP1="stop1";
    public static String COLOUMN_STOP2="stop2";
    public static String COLOUMN_STOP3="stop3";
    public static String COLOUMN_STOP4="stop4";
    public static String COLOUMN_STOP5="stop5";
    public static String COLOUMN_STOP6="stop6";
    public static String COLOUMN_STOP7="stop7";
    public static String COLOUMN_STOP8="stop8";
    public static String COLOUMN_STOP9="stop9";
    public static String COLOUMN_STOP10="stop10";

    public static String COLOUMN_TIME1="time1";
    public static String COLOUMN_TIME2="time2";
    public static String COLOUMN_TIME3="time3";
    public static String COLOUMN_TIME4="time4";
    public static String COLOUMN_TIME5="time5";
    public static String COLOUMN_TIME6="time6";
    public static String COLOUMN_TIME7="time7";
    public static String COLOUMN_TIME8="time8";
    public static String COLOUMN_TIME9="time9";
    public static String COLOUMN_TIME10="time10";


    private SQLiteDatabase db;
    private Context mcontext;

    int COL_ID_INDEX = 0;
    int COL_NAME_INDEX = 1;
    int COL_NUMBER_INDEX = 2;
    int COL_STOP1_INDEX = 3;
    int COL_STOP2_INDEX = 4;
    int COL_STOP3_INDEX = 5;
    int COL_STOP4_INDEX = 6;
    int COL_STOP5_INDEX = 7;
    int COL_STOP6_INDEX = 8;
    int COL_STOP7_INDEX = 9;
    int COL_STOP8_INDEX = 10;
    int COL_STOP9_INDEX = 11;
    int COL_STOP10_INDEX = 12;
    int COL_TIME1_INDEX = 13;
    int COL_TIME2_INDEX = 14;
    int COL_TIME3_INDEX = 15;
    int COL_TIME4_INDEX = 16;
    int COL_TIME5_INDEX = 17;
    int COL_TIME6_INDEX = 18;
    int COL_TIME7_INDEX = 19;
    int COL_TIME8_INDEX = 20;
    int COL_TIME9_INDEX = 21;
    int COL_TIME10_INDEX = 22;





    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mcontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {



    }

    public void openDatabase(){
        String dbpath=mcontext.getDatabasePath(DATABASE_NAME).getPath();
        if (db!=null && db.isOpen()){
            return;
        }
        db=SQLiteDatabase.openDatabase(dbpath,null,SQLiteDatabase.OPEN_READWRITE);
    }
    public void closeDatabase(){
        if (db!=null){
            db.close();
        }
    }


    public List<bus> getdata(){
        bus mbusinfo=null;
        List<bus> mlist= new ArrayList<>();
        openDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM bus",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            mbusinfo=new bus(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6));
            mlist.add(mbusinfo);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return mlist;
    }




    public Cursor getdata1(){
        db=this.getReadableDatabase();
        String query="select id as _id,busname,busnumber,stop1,stop10,time1,time10 from " + TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        return cursor;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

}
