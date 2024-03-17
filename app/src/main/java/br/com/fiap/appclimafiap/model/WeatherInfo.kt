package br.com.fiap.appclimafiap.model

data class WeatherInfo(
    val locationName: String,
    val conditionIcon: String,
    val condition: String,
    val temperature: Int,
    val dayOfWeek: String,
    val isDay: Boolean,

    // Já pensando nos dados Json que a API vai mandar
    // Criei as Val com as informações que quero armazenar
    // Conforme documentação da API
    // A view só vai mostrar o que definir nesse arq
)