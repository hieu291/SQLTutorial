package demo.sqlite.com.sqltutorial;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import demo.sqlite.com.sqltutorial.model.Note;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "SQLite";

    //Phien ban
    private static final int DATABASE_VERSION = 1;

    //Ten co so du lieu
    private static final String DATABASE_NAME = "Note_Manager";

    //Ten bang Note

    private static final String TABLE_NOTE = "Note";

    private static final String COLUMN_NOTE_ID = "Note_ID";
    private static final String COLUMN_NOTE_TITLE = "Note_Title";
    private static final String COLUMN_NOTE_CONTENT = "Note_Content";


   public DataBaseHelper(Context context)
   {
       super(context,DATABASE_NAME,null,DATABASE_VERSION);

   }
    //Tao cac bang
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.i(TAG,"DataBaseHelper.onCreat...");
        //ham tao bang
        String creattable = "CREATE TABLE " + TABLE_NOTE + " ("
                + COLUMN_NOTE_ID + " INTERGER PRIMARY KEY, "
                + COLUMN_NOTE_TITLE + " TEXT, "
                + COLUMN_NOTE_CONTENT + " TEXT" + ");";
        //chay lenh tao bang
        sqLiteDatabase.execSQL(creattable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.i(TAG,"DataBaseHelper.onUpgrage...");
        //Huy(Drop)neu bang cu co ton tai
        //Va tao lai bang
    }

    public void insert(int id, String title, String content) {
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NOTE_ID, id);
        cv.put(COLUMN_NOTE_TITLE, title);
        cv.put(COLUMN_NOTE_CONTENT, content);

        getReadableDatabase().insert(TABLE_NOTE, COLUMN_NOTE_ID, cv);
    }
}
