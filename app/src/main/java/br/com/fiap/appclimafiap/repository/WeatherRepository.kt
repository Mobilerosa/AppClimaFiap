package br.com.fiap.appclimafiap.repository

import br.com.fiap.appclimafiap.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, lng: Double): WeatherInfo
    // Nesse repository, vamos receber os dados da camada já pré selecionada

}