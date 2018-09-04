package kevin.com.nanal.data;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\'\u00a8\u0006\f"}, d2 = {"Lkevin/com/nanal/data/LandDao;", "", "getLand", "Landroid/arch/lifecycle/LiveData;", "Lkevin/com/nanal/data/Land;", "landId", "", "getLands", "", "insertAll", "", "lands", "app_debug"})
public abstract interface LandDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM lands ORDER BY name")
    public abstract android.arch.lifecycle.LiveData<java.util.List<kevin.com.nanal.data.Land>> getLands();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM lands WHERE id = :landId")
    public abstract android.arch.lifecycle.LiveData<kevin.com.nanal.data.Land> getLand(@org.jetbrains.annotations.NotNull()
    java.lang.String landId);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<kevin.com.nanal.data.Land> lands);
}