package com.example.zeldaapp.category.domain.mapper

import com.example.commons.extension.capitalize
import com.example.commons.extension.handleOpt
import com.example.zeldaapp.category.data.model.CategoryItemDto
import com.example.zeldaapp.category.domain.model.CategoryItem

fun CategoryItemDto.toCategoryItem() = CategoryItem(
    id = id.handleOpt(),
    name = name.handleOpt().capitalize(),
    category = category.handleOpt(),
    description = descriptions.handleOpt(),
    image = image.handleOpt(),
    commonPlaces = commonPlaces?.map { it.handleOpt() }.handleOpt()
)

fun List<CategoryItemDto>.toCategoryItemList() = map { categoryItemDto ->
    categoryItemDto.toCategoryItem()
}