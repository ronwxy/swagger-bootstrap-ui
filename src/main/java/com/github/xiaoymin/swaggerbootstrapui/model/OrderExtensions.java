/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.github.xiaoymin.swaggerbootstrapui.model;

import springfox.documentation.service.VendorExtension;

/***
 *
 * @since:swagger-bootstrap-ui 1.9.4
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2019/05/25 20:19
 */
public class OrderExtensions implements VendorExtension<Integer> {

    private Integer order;

    public OrderExtensions(Integer order) {
        this.order = order;
    }

    @Override
    public String getName() {
        return "x-order";
    }
    @Override
    public Integer getValue() {
        return this.order;
    }
}
