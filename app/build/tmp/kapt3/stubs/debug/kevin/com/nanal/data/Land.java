package kevin.com.nanal.data;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "lands")
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00cd\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0019J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0016H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\u00d1\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010`\u001a\u00020\u0003H\u00d6\u0001J\b\u0010a\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b\'\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!\u00a8\u0006b"}, d2 = {"Lkevin/com/nanal/data/Land;", "", "id", "", "owner", "", "insurance", "businessShare", "acreage", "floorStartPrice", "pathlat", "startPrice", "floorFinalPrice", "fourBound", "createdAt", "natureOfLand", "pathlng", "transferTime", "finalPrice", "district", "name", "premiumRate", "", "volumeRate", "updatedAt", "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getAcreage", "()I", "setAcreage", "(I)V", "getBusinessShare", "()Ljava/lang/String;", "setBusinessShare", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "getDistrict", "setDistrict", "getFinalPrice", "setFinalPrice", "getFloorFinalPrice", "setFloorFinalPrice", "getFloorStartPrice", "setFloorStartPrice", "getFourBound", "setFourBound", "getId", "setId", "getInsurance", "setInsurance", "getName", "setName", "getNatureOfLand", "setNatureOfLand", "getOwner", "setOwner", "getPathlat", "setPathlat", "getPathlng", "setPathlng", "getPremiumRate", "()D", "setPremiumRate", "(D)V", "getStartPrice", "setStartPrice", "getTransferTime", "setTransferTime", "getUpdatedAt", "setUpdatedAt", "getVolumeRate", "setVolumeRate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Land {
    @android.arch.persistence.room.ColumnInfo(name = "id")
    @android.arch.persistence.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String owner;
    private int insurance;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String businessShare;
    private int acreage;
    private int floorStartPrice;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pathlat;
    private int startPrice;
    private int floorFinalPrice;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fourBound;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String createdAt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String natureOfLand;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pathlng;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transferTime;
    private int finalPrice;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String district;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private double premiumRate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String volumeRate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String updatedAt;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getInsurance() {
        return 0;
    }
    
    public final void setInsurance(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBusinessShare() {
        return null;
    }
    
    public final void setBusinessShare(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAcreage() {
        return 0;
    }
    
    public final void setAcreage(int p0) {
    }
    
    public final int getFloorStartPrice() {
        return 0;
    }
    
    public final void setFloorStartPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathlat() {
        return null;
    }
    
    public final void setPathlat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStartPrice() {
        return 0;
    }
    
    public final void setStartPrice(int p0) {
    }
    
    public final int getFloorFinalPrice() {
        return 0;
    }
    
    public final void setFloorFinalPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFourBound() {
        return null;
    }
    
    public final void setFourBound(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNatureOfLand() {
        return null;
    }
    
    public final void setNatureOfLand(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathlng() {
        return null;
    }
    
    public final void setPathlng(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransferTime() {
        return null;
    }
    
    public final void setTransferTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getFinalPrice() {
        return 0;
    }
    
    public final void setFinalPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    public final void setDistrict(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPremiumRate() {
        return 0.0;
    }
    
    public final void setPremiumRate(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVolumeRate() {
        return null;
    }
    
    public final void setVolumeRate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Land(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String owner, int insurance, @org.jetbrains.annotations.NotNull()
    java.lang.String businessShare, int acreage, int floorStartPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String pathlat, int startPrice, int floorFinalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String fourBound, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String natureOfLand, @org.jetbrains.annotations.NotNull()
    java.lang.String pathlng, @org.jetbrains.annotations.NotNull()
    java.lang.String transferTime, int finalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double premiumRate, @org.jetbrains.annotations.NotNull()
    java.lang.String volumeRate, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt) {
        super();
    }
    
    public Land() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kevin.com.nanal.data.Land copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String owner, int insurance, @org.jetbrains.annotations.NotNull()
    java.lang.String businessShare, int acreage, int floorStartPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String pathlat, int startPrice, int floorFinalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String fourBound, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String natureOfLand, @org.jetbrains.annotations.NotNull()
    java.lang.String pathlng, @org.jetbrains.annotations.NotNull()
    java.lang.String transferTime, int finalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double premiumRate, @org.jetbrains.annotations.NotNull()
    java.lang.String volumeRate, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}