package com.example.zeldaapp.category.presentation.item.detail

import android.text.TextUtils.replace
import com.example.commons.base.BaseViewModel
import com.example.zeldaapp.category.domain.model.CategoryItem
import java.lang.String.join

class CategoryItemDetailsViewModel(
    val categoryItem: CategoryItem
) : BaseViewModel() {

    val formattedCommonLocations: String = categoryItem.commonPlaces.toString().replace("[", "").replace("]", "")
    val description: String = categoryItem.description
    val category: String = categoryItem.category
    val name: String = categoryItem.name


}