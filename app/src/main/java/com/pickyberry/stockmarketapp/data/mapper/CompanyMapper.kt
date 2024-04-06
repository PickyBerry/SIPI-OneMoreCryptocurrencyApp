package com.pickyberry.stockmarketapp.data.mapper

import com.pickyberry.stockmarketapp.data.local.CompanyListingEntity
import com.pickyberry.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.pickyberry.stockmarketapp.domain.model.CompanyInfo
import com.pickyberry.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name=name,
        symbol=symbol,
        exchange=exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name=name,
        symbol=symbol,
        exchange=exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol=symbol?: "",
        description=description?: "",
        name=name?: "",
        country=country?: "",
        industry=industry?: "",
    )
}

