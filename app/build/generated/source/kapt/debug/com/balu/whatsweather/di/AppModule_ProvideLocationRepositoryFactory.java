// Generated by Dagger (https://dagger.dev).
package com.balu.whatsweather.di;

import com.balu.whatsweather.data.location.LocationTracker;
import com.balu.whatsweather.data.location.LocationTrackerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideLocationRepositoryFactory implements Factory<LocationTracker> {
  private final Provider<LocationTrackerImpl> locationRepositoryImplProvider;

  public AppModule_ProvideLocationRepositoryFactory(
      Provider<LocationTrackerImpl> locationRepositoryImplProvider) {
    this.locationRepositoryImplProvider = locationRepositoryImplProvider;
  }

  @Override
  public LocationTracker get() {
    return provideLocationRepository(locationRepositoryImplProvider.get());
  }

  public static AppModule_ProvideLocationRepositoryFactory create(
      Provider<LocationTrackerImpl> locationRepositoryImplProvider) {
    return new AppModule_ProvideLocationRepositoryFactory(locationRepositoryImplProvider);
  }

  public static LocationTracker provideLocationRepository(
      LocationTrackerImpl locationRepositoryImpl) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocationRepository(locationRepositoryImpl));
  }
}