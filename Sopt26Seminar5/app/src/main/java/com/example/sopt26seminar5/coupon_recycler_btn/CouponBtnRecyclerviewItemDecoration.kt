package com.example.sopt26seminar5.coupon_recycler_btn

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CouponBtnRecyclerviewItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = parent.getChildAdapterPosition(view)

        //첫번째 아이템 여백
        if(position == 0){
            outRect.left = 60
        }
    }
}