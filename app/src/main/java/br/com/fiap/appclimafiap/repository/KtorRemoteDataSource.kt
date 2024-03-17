package br.com.fiap.appclimafiap.repository

import br.com.fiap.appclimafiap.remote.response.RemoteDataSource
import br.com.fiap.appclimafiap.remote.response.WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class KtorRemoteDataSource @Inject constructor(
private val httpClient: HttpClient
) : RemoteDataSource {

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
    }

    override suspend fun getWeatherDataResponse(lat: Double, lng: Double): WeatherDataResponse {
        return httpClient
            .get("${BASE_URL}/weather?lat=$lat&lon=$lng&appid=f876e3eefb9022f995c046b5d0aad203&units=metric")
            .body()
    }

    // basta mudar a latitude e longitudo para ter uma nova informação no app
}