package br.com.fiap.appclimafiap.data.di

import br.com.fiap.appclimafiap.remote.response.RemoteDataSource
import br.com.fiap.appclimafiap.repository.KtorRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

    @Module
    @InstallIn(SingletonComponent::class)
    interface DataSourceModule {
        //implementação com a abstração
        @Binds
        @Singleton
        fun bindRemoteDataSource(remoteDataSource: KtorRemoteDataSource): RemoteDataSource

        //Adicionei o Ktor mas nessa instancia, posso mudar facilmente para o retrofit ou qualquer outro
        // por criar o app com a arquitetura desacopladas
}