package kevin.com.nanal.data;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class LandDao_Impl implements LandDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLand;

  public LandDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLand = new EntityInsertionAdapter<Land>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `lands`(`id`,`owner`,`insurance`,`businessShare`,`acreage`,`floorStartPrice`,`pathlat`,`startPrice`,`floorFinalPrice`,`fourBound`,`createdAt`,`natureOfLand`,`pathlng`,`transferTime`,`finalPrice`,`district`,`name`,`premiumRate`,`volumeRate`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Land value) {
        stmt.bindLong(1, value.getId());
        if (value.getOwner() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwner());
        }
        stmt.bindLong(3, value.getInsurance());
        if (value.getBusinessShare() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBusinessShare());
        }
        stmt.bindLong(5, value.getAcreage());
        stmt.bindLong(6, value.getFloorStartPrice());
        if (value.getPathlat() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPathlat());
        }
        stmt.bindLong(8, value.getStartPrice());
        stmt.bindLong(9, value.getFloorFinalPrice());
        if (value.getFourBound() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFourBound());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getCreatedAt());
        }
        if (value.getNatureOfLand() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getNatureOfLand());
        }
        if (value.getPathlng() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPathlng());
        }
        if (value.getTransferTime() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getTransferTime());
        }
        stmt.bindLong(15, value.getFinalPrice());
        if (value.getDistrict() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getDistrict());
        }
        if (value.getName() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getName());
        }
        stmt.bindDouble(18, value.getPremiumRate());
        if (value.getVolumeRate() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getVolumeRate());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getUpdatedAt());
        }
      }
    };
  }

  @Override
  public void insertAll(List<Land> lands) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLand.insert(lands);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Land>> getLands() {
    final String _sql = "SELECT * FROM lands ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Land>>() {
      private Observer _observer;

      @Override
      protected List<Land> compute() {
        if (_observer == null) {
          _observer = new Observer("lands") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfOwner = _cursor.getColumnIndexOrThrow("owner");
          final int _cursorIndexOfInsurance = _cursor.getColumnIndexOrThrow("insurance");
          final int _cursorIndexOfBusinessShare = _cursor.getColumnIndexOrThrow("businessShare");
          final int _cursorIndexOfAcreage = _cursor.getColumnIndexOrThrow("acreage");
          final int _cursorIndexOfFloorStartPrice = _cursor.getColumnIndexOrThrow("floorStartPrice");
          final int _cursorIndexOfPathlat = _cursor.getColumnIndexOrThrow("pathlat");
          final int _cursorIndexOfStartPrice = _cursor.getColumnIndexOrThrow("startPrice");
          final int _cursorIndexOfFloorFinalPrice = _cursor.getColumnIndexOrThrow("floorFinalPrice");
          final int _cursorIndexOfFourBound = _cursor.getColumnIndexOrThrow("fourBound");
          final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("createdAt");
          final int _cursorIndexOfNatureOfLand = _cursor.getColumnIndexOrThrow("natureOfLand");
          final int _cursorIndexOfPathlng = _cursor.getColumnIndexOrThrow("pathlng");
          final int _cursorIndexOfTransferTime = _cursor.getColumnIndexOrThrow("transferTime");
          final int _cursorIndexOfFinalPrice = _cursor.getColumnIndexOrThrow("finalPrice");
          final int _cursorIndexOfDistrict = _cursor.getColumnIndexOrThrow("district");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPremiumRate = _cursor.getColumnIndexOrThrow("premiumRate");
          final int _cursorIndexOfVolumeRate = _cursor.getColumnIndexOrThrow("volumeRate");
          final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updatedAt");
          final List<Land> _result = new ArrayList<Land>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Land _item;
            _item = new Land();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpOwner;
            _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            _item.setOwner(_tmpOwner);
            final int _tmpInsurance;
            _tmpInsurance = _cursor.getInt(_cursorIndexOfInsurance);
            _item.setInsurance(_tmpInsurance);
            final String _tmpBusinessShare;
            _tmpBusinessShare = _cursor.getString(_cursorIndexOfBusinessShare);
            _item.setBusinessShare(_tmpBusinessShare);
            final int _tmpAcreage;
            _tmpAcreage = _cursor.getInt(_cursorIndexOfAcreage);
            _item.setAcreage(_tmpAcreage);
            final int _tmpFloorStartPrice;
            _tmpFloorStartPrice = _cursor.getInt(_cursorIndexOfFloorStartPrice);
            _item.setFloorStartPrice(_tmpFloorStartPrice);
            final String _tmpPathlat;
            _tmpPathlat = _cursor.getString(_cursorIndexOfPathlat);
            _item.setPathlat(_tmpPathlat);
            final int _tmpStartPrice;
            _tmpStartPrice = _cursor.getInt(_cursorIndexOfStartPrice);
            _item.setStartPrice(_tmpStartPrice);
            final int _tmpFloorFinalPrice;
            _tmpFloorFinalPrice = _cursor.getInt(_cursorIndexOfFloorFinalPrice);
            _item.setFloorFinalPrice(_tmpFloorFinalPrice);
            final String _tmpFourBound;
            _tmpFourBound = _cursor.getString(_cursorIndexOfFourBound);
            _item.setFourBound(_tmpFourBound);
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            _item.setCreatedAt(_tmpCreatedAt);
            final String _tmpNatureOfLand;
            _tmpNatureOfLand = _cursor.getString(_cursorIndexOfNatureOfLand);
            _item.setNatureOfLand(_tmpNatureOfLand);
            final String _tmpPathlng;
            _tmpPathlng = _cursor.getString(_cursorIndexOfPathlng);
            _item.setPathlng(_tmpPathlng);
            final String _tmpTransferTime;
            _tmpTransferTime = _cursor.getString(_cursorIndexOfTransferTime);
            _item.setTransferTime(_tmpTransferTime);
            final int _tmpFinalPrice;
            _tmpFinalPrice = _cursor.getInt(_cursorIndexOfFinalPrice);
            _item.setFinalPrice(_tmpFinalPrice);
            final String _tmpDistrict;
            _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            _item.setDistrict(_tmpDistrict);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final double _tmpPremiumRate;
            _tmpPremiumRate = _cursor.getDouble(_cursorIndexOfPremiumRate);
            _item.setPremiumRate(_tmpPremiumRate);
            final String _tmpVolumeRate;
            _tmpVolumeRate = _cursor.getString(_cursorIndexOfVolumeRate);
            _item.setVolumeRate(_tmpVolumeRate);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            _item.setUpdatedAt(_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Land> getLand(String landId) {
    final String _sql = "SELECT * FROM lands WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (landId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, landId);
    }
    return new ComputableLiveData<Land>() {
      private Observer _observer;

      @Override
      protected Land compute() {
        if (_observer == null) {
          _observer = new Observer("lands") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfOwner = _cursor.getColumnIndexOrThrow("owner");
          final int _cursorIndexOfInsurance = _cursor.getColumnIndexOrThrow("insurance");
          final int _cursorIndexOfBusinessShare = _cursor.getColumnIndexOrThrow("businessShare");
          final int _cursorIndexOfAcreage = _cursor.getColumnIndexOrThrow("acreage");
          final int _cursorIndexOfFloorStartPrice = _cursor.getColumnIndexOrThrow("floorStartPrice");
          final int _cursorIndexOfPathlat = _cursor.getColumnIndexOrThrow("pathlat");
          final int _cursorIndexOfStartPrice = _cursor.getColumnIndexOrThrow("startPrice");
          final int _cursorIndexOfFloorFinalPrice = _cursor.getColumnIndexOrThrow("floorFinalPrice");
          final int _cursorIndexOfFourBound = _cursor.getColumnIndexOrThrow("fourBound");
          final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("createdAt");
          final int _cursorIndexOfNatureOfLand = _cursor.getColumnIndexOrThrow("natureOfLand");
          final int _cursorIndexOfPathlng = _cursor.getColumnIndexOrThrow("pathlng");
          final int _cursorIndexOfTransferTime = _cursor.getColumnIndexOrThrow("transferTime");
          final int _cursorIndexOfFinalPrice = _cursor.getColumnIndexOrThrow("finalPrice");
          final int _cursorIndexOfDistrict = _cursor.getColumnIndexOrThrow("district");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPremiumRate = _cursor.getColumnIndexOrThrow("premiumRate");
          final int _cursorIndexOfVolumeRate = _cursor.getColumnIndexOrThrow("volumeRate");
          final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updatedAt");
          final Land _result;
          if(_cursor.moveToFirst()) {
            _result = new Land();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
            final String _tmpOwner;
            _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            _result.setOwner(_tmpOwner);
            final int _tmpInsurance;
            _tmpInsurance = _cursor.getInt(_cursorIndexOfInsurance);
            _result.setInsurance(_tmpInsurance);
            final String _tmpBusinessShare;
            _tmpBusinessShare = _cursor.getString(_cursorIndexOfBusinessShare);
            _result.setBusinessShare(_tmpBusinessShare);
            final int _tmpAcreage;
            _tmpAcreage = _cursor.getInt(_cursorIndexOfAcreage);
            _result.setAcreage(_tmpAcreage);
            final int _tmpFloorStartPrice;
            _tmpFloorStartPrice = _cursor.getInt(_cursorIndexOfFloorStartPrice);
            _result.setFloorStartPrice(_tmpFloorStartPrice);
            final String _tmpPathlat;
            _tmpPathlat = _cursor.getString(_cursorIndexOfPathlat);
            _result.setPathlat(_tmpPathlat);
            final int _tmpStartPrice;
            _tmpStartPrice = _cursor.getInt(_cursorIndexOfStartPrice);
            _result.setStartPrice(_tmpStartPrice);
            final int _tmpFloorFinalPrice;
            _tmpFloorFinalPrice = _cursor.getInt(_cursorIndexOfFloorFinalPrice);
            _result.setFloorFinalPrice(_tmpFloorFinalPrice);
            final String _tmpFourBound;
            _tmpFourBound = _cursor.getString(_cursorIndexOfFourBound);
            _result.setFourBound(_tmpFourBound);
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            _result.setCreatedAt(_tmpCreatedAt);
            final String _tmpNatureOfLand;
            _tmpNatureOfLand = _cursor.getString(_cursorIndexOfNatureOfLand);
            _result.setNatureOfLand(_tmpNatureOfLand);
            final String _tmpPathlng;
            _tmpPathlng = _cursor.getString(_cursorIndexOfPathlng);
            _result.setPathlng(_tmpPathlng);
            final String _tmpTransferTime;
            _tmpTransferTime = _cursor.getString(_cursorIndexOfTransferTime);
            _result.setTransferTime(_tmpTransferTime);
            final int _tmpFinalPrice;
            _tmpFinalPrice = _cursor.getInt(_cursorIndexOfFinalPrice);
            _result.setFinalPrice(_tmpFinalPrice);
            final String _tmpDistrict;
            _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            _result.setDistrict(_tmpDistrict);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result.setName(_tmpName);
            final double _tmpPremiumRate;
            _tmpPremiumRate = _cursor.getDouble(_cursorIndexOfPremiumRate);
            _result.setPremiumRate(_tmpPremiumRate);
            final String _tmpVolumeRate;
            _tmpVolumeRate = _cursor.getString(_cursorIndexOfVolumeRate);
            _result.setVolumeRate(_tmpVolumeRate);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            _result.setUpdatedAt(_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
