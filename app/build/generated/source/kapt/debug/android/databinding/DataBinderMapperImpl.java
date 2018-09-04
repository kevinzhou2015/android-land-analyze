package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new kevin.com.nanal.DataBinderMapperImpl());
  }
}
