package com.pickyberry.stockmarketapp.di

import com.pickyberry.stockmarketapp.data.csv.CSVParser
import com.pickyberry.stockmarketapp.data.csv.CompanyListingsParser
import com.pickyberry.stockmarketapp.data.csv.IntradayInfoParser
import com.pickyberry.stockmarketapp.data.repository.StockRepositoryImpl
import com.pickyberry.stockmarketapp.domain.model.CompanyListing
import com.pickyberry.stockmarketapp.domain.model.IntradayInfo
import com.pickyberry.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser,
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser,
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}