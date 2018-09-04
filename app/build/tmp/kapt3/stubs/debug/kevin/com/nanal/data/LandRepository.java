package kevin.com.nanal.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkevin/com/nanal/data/LandRepository;", "", "landDao", "Lkevin/com/nanal/data/LandDao;", "(Lkevin/com/nanal/data/LandDao;)V", "getPlant", "Landroid/arch/lifecycle/LiveData;", "Lkevin/com/nanal/data/Land;", "landId", "", "getPlants", "", "Companion", "app_debug"})
public final class LandRepository {
    private final kevin.com.nanal.data.LandDao landDao = null;
    private static volatile kevin.com.nanal.data.LandRepository instance;
    public static final kevin.com.nanal.data.LandRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<kevin.com.nanal.data.Land>> getPlants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<kevin.com.nanal.data.Land> getPlant(@org.jetbrains.annotations.NotNull()
    java.lang.String landId) {
        return null;
    }
    
    private LandRepository(kevin.com.nanal.data.LandDao landDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lkevin/com/nanal/data/LandRepository$Companion;", "", "()V", "instance", "Lkevin/com/nanal/data/LandRepository;", "getInstance", "landDao", "Lkevin/com/nanal/data/LandDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final kevin.com.nanal.data.LandRepository getInstance(@org.jetbrains.annotations.NotNull()
        kevin.com.nanal.data.LandDao landDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}