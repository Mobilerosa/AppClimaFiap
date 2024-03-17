package br.com.fiap.appclimafiap.remote.response

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Double, lng: Double): WeatherDataResponse
}