package com.golden.website.enums;

/**
 * 用户权限
 */
public enum UserPrivilege {
    ordinaryUsers(0,"普通用户"),
    superUser(1,"超级用户");
    //权限
    private int privilege;
    //描述
    private  String desc;

    UserPrivilege(int privilege ,String desc){
        this.privilege = privilege;
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getPrivilege(){
        return this.privilege;
    }


}
