package com.yao.service;

import com.yao.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Jack Yao on 2021/5/29 3:45 下午
 */
public interface TypeService {
    Type saveType(Type type);/*新增完返回Type，新增要保存，用saveType，傳過來的是type實體對象*/

    Type getType(Long id);/*根據查詢的type*/

    /*通過名稱查詢Type*/
    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);/*傳遞Pageable的對象*/

    List<Type> listType();

    List<Type> listTypeTop(Integer size);/*根據傳遞的值來取數據列表的大小*/


    Type updateType(Long id, Type type);/*修改最終返回根據id查到的對象，然後再把對象按照新內容修改保存在數據庫，type就是修改參數的對象*/

    void deleteType(Long id);/*刪除就返回一個空，根據Long id主鍵來刪除*/

}
/*再來實驗這個接口*/