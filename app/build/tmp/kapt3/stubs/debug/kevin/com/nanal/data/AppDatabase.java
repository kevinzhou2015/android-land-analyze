package kevin.com.nanal.data;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {kevin.com.nanal.data.Converters.class})
@android.arch.persistence.room.Database(entities = {kevin.com.nanal.data.Land.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lkevin/com/nanal/data/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "landDao", "Lkevin/com/nanal/data/LandDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static final java.lang.String TAG = null;
    private static volatile kevin.com.nanal.data.AppDatabase instance;
    public static final kevin.com.nanal.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract kevin.com.nanal.data.LandDao landDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lkevin/com/nanal/data/AppDatabase$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "instance", "Lkevin/com/nanal/data/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final kevin.com.nanal.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final kevin.com.nanal.data.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}