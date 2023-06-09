// Generated by Dagger (https://dagger.dev).
package com.balu.whatsweather.data.repository;

import com.balu.whatsweather.data.remote.ApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepositoryImpl_Factory implements Factory<WeatherRepositoryImpl> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public WeatherRepositoryImpl_Factory(Provider<ApiInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public WeatherRepositoryImpl get() {
    return newInstance(apiInterfaceProvider.get());
  }

  public static WeatherRepositoryImpl_Factory create(Provider<ApiInterface> apiInterfaceProvider) {
    return new WeatherRepositoryImpl_Factory(apiInterfaceProvider);
  }

  public static WeatherRepositoryImpl newInstance(ApiInterface apiInterface) {
    return new WeatherRepositoryImpl(apiInterface);
  }
}
