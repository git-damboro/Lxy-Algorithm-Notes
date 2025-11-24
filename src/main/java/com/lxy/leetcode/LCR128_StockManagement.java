package com.lxy.leetcode;


public class LCR128_StockManagement {
    public int inventoryManagement(int[] stock) {

        int left = 0 ;
        int right = stock.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(stock[mid] > stock[right]){
                //说明裂缝在右边
                left = mid + 1;

            }else if(stock[mid] < stock[right]){
                //说明裂缝在左边
                right = mid ;

            }else{
                right--;
            }
        }
        return stock[left];
    }


}