package com.example.sopt26seminar5.fragment

import HorizontalDivider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.sopt26seminar5.R
import com.example.sopt26seminar5.menu_recycler_category.CategoryAdapter
import com.example.sopt26seminar5.menu_recycler_category.CategoryData
import com.example.sopt26seminar5.menu_recycler_menu.MenuAdapter
import com.example.sopt26seminar5.menu_recycler_menu.MenuData
import kotlinx.android.synthetic.main.fragment_menu.*
import textResetButton
import verticalDivider

class MenuFragment : Fragment() {
    lateinit var categoryAdapter : CategoryAdapter
    val categorydatas = mutableListOf<CategoryData>()

    lateinit var menuAdapter : MenuAdapter
    val menudatas = mutableListOf<MenuData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val filterArr = resources.getStringArray(R.array.filterArray)
        val spinnerAdapter = ArrayAdapter(view.context,
            R.layout.custom_spinner, filterArr)
        menu_btn_sequnce_filter.adapter = spinnerAdapter
        menu_btn_sequnce_filter.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }

        categoryAdapter = CategoryAdapter(view.context)
        rv_category.adapter = categoryAdapter
        menuAdapter = MenuAdapter(view.context)
        rv_menu.adapter = menuAdapter
        loadCategoryDatas()
        loadMenuDatas()

        text_reset.textResetButton(search)

        //rv_category.HorizontalDivider()
        //rv_menu.verticalDivider()
        //rv_category.recyclerViewTouchHelper(categoryAdapter, categorydatas)
    }

    private fun loadCategoryDatas(){
        categorydatas.apply {
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_1,
                    categoryName = "버거"
                )
            )
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_2,
                    categoryName = "맥모닝"
                )
            )
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_3,
                    categoryName = "해피밀"
                )
            )
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_4,
                    categoryName = "사이드"
                )
            )
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_5,
                    categoryName = "디저트"
                )
            )
            add(
                CategoryData(
                    categoryImage = R.drawable.mc_menu_1,
                    categoryName = "맥카페&음료"
                )
            )
        }
        categoryAdapter.datas = categorydatas
        categoryAdapter.notifyDataSetChanged()
    }

    private fun loadMenuDatas() {
        menudatas.apply {
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "허니 크림치즈\n상하이 버거 세트",
                    menuGram = "242",
                    menuKcal = "554"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "맥모닝",
                    menuName = "에그 맥머핀",
                    menuGram = "139",
                    menuKcal = "292"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "디저트",
                    menuName = "초코 선데이\n아이스크림",
                    menuGram = "155",
                    menuKcal = "307"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "맥스파이시\n상하이 버거 세트",
                    menuGram = "234",
                    menuKcal = "883~981"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "1955 버거 세트",
                    menuGram = "246",
                    menuKcal = "898~1047"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "맥카페",
                    menuName = "자두칠러\nMedium",
                    menuGram = "400",
                    menuKcal = "198"
                )
            )
        }
        menuAdapter.datas = menudatas
        menuAdapter.notifyDataSetChanged()
    }
}