package kevin.com.nanal.data;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile LandDao _landDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `lands` (`id` INTEGER NOT NULL, `owner` TEXT NOT NULL, `insurance` INTEGER NOT NULL, `businessShare` TEXT NOT NULL, `acreage` INTEGER NOT NULL, `floorStartPrice` INTEGER NOT NULL, `pathlat` TEXT NOT NULL, `startPrice` INTEGER NOT NULL, `floorFinalPrice` INTEGER NOT NULL, `fourBound` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `natureOfLand` TEXT NOT NULL, `pathlng` TEXT NOT NULL, `transferTime` TEXT NOT NULL, `finalPrice` INTEGER NOT NULL, `district` TEXT NOT NULL, `name` TEXT NOT NULL, `premiumRate` REAL NOT NULL, `volumeRate` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d3434f5823340af80714052e664ca291\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `lands`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLands = new HashMap<String, TableInfo.Column>(20);
        _columnsLands.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsLands.put("owner", new TableInfo.Column("owner", "TEXT", true, 0));
        _columnsLands.put("insurance", new TableInfo.Column("insurance", "INTEGER", true, 0));
        _columnsLands.put("businessShare", new TableInfo.Column("businessShare", "TEXT", true, 0));
        _columnsLands.put("acreage", new TableInfo.Column("acreage", "INTEGER", true, 0));
        _columnsLands.put("floorStartPrice", new TableInfo.Column("floorStartPrice", "INTEGER", true, 0));
        _columnsLands.put("pathlat", new TableInfo.Column("pathlat", "TEXT", true, 0));
        _columnsLands.put("startPrice", new TableInfo.Column("startPrice", "INTEGER", true, 0));
        _columnsLands.put("floorFinalPrice", new TableInfo.Column("floorFinalPrice", "INTEGER", true, 0));
        _columnsLands.put("fourBound", new TableInfo.Column("fourBound", "TEXT", true, 0));
        _columnsLands.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0));
        _columnsLands.put("natureOfLand", new TableInfo.Column("natureOfLand", "TEXT", true, 0));
        _columnsLands.put("pathlng", new TableInfo.Column("pathlng", "TEXT", true, 0));
        _columnsLands.put("transferTime", new TableInfo.Column("transferTime", "TEXT", true, 0));
        _columnsLands.put("finalPrice", new TableInfo.Column("finalPrice", "INTEGER", true, 0));
        _columnsLands.put("district", new TableInfo.Column("district", "TEXT", true, 0));
        _columnsLands.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsLands.put("premiumRate", new TableInfo.Column("premiumRate", "REAL", true, 0));
        _columnsLands.put("volumeRate", new TableInfo.Column("volumeRate", "TEXT", true, 0));
        _columnsLands.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLands = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLands = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLands = new TableInfo("lands", _columnsLands, _foreignKeysLands, _indicesLands);
        final TableInfo _existingLands = TableInfo.read(_db, "lands");
        if (! _infoLands.equals(_existingLands)) {
          throw new IllegalStateException("Migration didn't properly handle lands(kevin.com.nanal.data.Land).\n"
                  + " Expected:\n" + _infoLands + "\n"
                  + " Found:\n" + _existingLands);
        }
      }
    }, "d3434f5823340af80714052e664ca291", "d370d159326a7c94bbc17ea3c691bbd0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "lands");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `lands`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public LandDao landDao() {
    if (_landDao != null) {
      return _landDao;
    } else {
      synchronized(this) {
        if(_landDao == null) {
          _landDao = new LandDao_Impl(this);
        }
        return _landDao;
      }
    }
  }
}
