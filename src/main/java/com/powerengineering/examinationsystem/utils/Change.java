package com.powerengineering.examinationsystem.utils;

public class Change {

//    public static String getMidChange(int mid){
//        String str;
//        if(mid==1){
//            str="工种";
//        }else {
//            str="技能";
//        }
//        return str;
//    }
    //题库类别转换
    public static String getBsidChange(int bsid){
        String str;
        if(bsid==1){
            str="理论";
        }else {
            str="实操";
        }
        return str;
    }
    //题库类型转换
    public static String getBtidChange(int btid){
        String str;
        if(btid==1){
            str="正考";
        }else {
            str="练习";
        }
        return str;
    }
    //题库种类转换
    public static String getBidChange(int bid){
        String str;
        if(bid==1){
            str="工种";
        }else {
            str="技能";
        }
        return str;
    }

    //工种等级转换
    public static String getCridChange(int crid){
        String str;
        if(crid==1){
            str="国标";
        }else if(crid==2){
            str="行标";
        }else{
            str="企标";
        }
        return str;
    }


}
