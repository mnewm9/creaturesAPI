package com.example.zeldaapp.category.domain.usecase

import com.example.network.getRetrofit
import com.example.zeldaapp.category.data.model.CategoryItemDto
import com.example.zeldaapp.category.data.model.CategoryItemListResponse
import com.example.zeldaapp.category.data.repository.ICategoryRepository
import com.example.zeldaapp.category.data.service.CategoryService
import com.example.zeldaapp.category.domain.mapper.toCategoryItemList
import com.example.zeldaapp.category.domain.model.CategoryItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.create

class CategoryItemListUseCase(
    private val repository: ICategoryRepository
) {

    suspend operator fun invoke(
        category: String
    )= repository.getCreaturesItemList().toCategoryItemList()

}