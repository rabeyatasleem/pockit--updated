package com.example.pockeitt.utils

import com.example.pockeitt.models.IncomeExpense


object ListDataPump {
    var data: HashMap<String, MutableList<IncomeExpense>>
        private set

    init {
        data = HashMap()
        val bills: MutableList<IncomeExpense> = ArrayList()
        val needs: MutableList<IncomeExpense> = ArrayList()
        val wants: MutableList<IncomeExpense> = ArrayList()
        val savings: MutableList<IncomeExpense> = ArrayList()


        data["Bills"] = bills
        data["Needs"] = needs
        data["Wants"] = wants
        data["Savings"] = savings


    }





        fun getList(key: String): List<IncomeExpense> {
        return data[key]!!
    }

    fun addItem(key: String, item: IncomeExpense) {
        var list = data[key]
        if (list != null) {
            list.add(item)
        } else {
            list = ArrayList()
            list.add(item)
            data[key] = list
        }
    }

    fun removeItem(key: String, item: IncomeExpense) {
        val list = data[key]
        list?.remove(item)
    }


//
//    fun updateItem(key: IncomeExpense, index: Int, newItem: String) {
//        val list = data[key]
//        if (list != null && index >= 0 && index < list.size) {
//            list[index] = newItem
//        }
//
//    }


    }