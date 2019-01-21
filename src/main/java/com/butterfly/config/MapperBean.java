package com.butterfly.config;

import java.util.List;

/**
 * Created by adminnistrator on 2019/1/21.
 */
public class MapperBean {
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<Function> getList() {
        return list;
    }

    public void setList(List<Function> list) {
        this.list = list;
    }

    private String interfaceName; //接口名
    private List<Function> list; //接口下所有方法

}
