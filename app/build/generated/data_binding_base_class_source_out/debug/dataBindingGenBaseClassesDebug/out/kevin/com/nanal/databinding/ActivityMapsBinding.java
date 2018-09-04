package kevin.com.nanal.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityMapsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navigationView;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityMapsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, DrawerLayout drawerLayout,
      NavigationView navigationView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.drawerLayout = drawerLayout;
    this.navigationView = navigationView;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMapsBinding>inflate(inflater, kevin.com.nanal.R.layout.activity_maps, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMapsBinding>inflate(inflater, kevin.com.nanal.R.layout.activity_maps, null, false, component);
  }

  public static ActivityMapsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMapsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMapsBinding)bind(component, view, kevin.com.nanal.R.layout.activity_maps);
  }
}
