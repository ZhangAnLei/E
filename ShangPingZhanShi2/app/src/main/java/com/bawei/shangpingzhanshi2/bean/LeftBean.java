package com.bawei.shangpingzhanshi2.bean;

import java.util.List;

/**
 * @Author：张安磊
 * @E-mail：
 * @Date：
 * @Description：描述信息
 */
public class LeftBean {

    /**
     * result : [{"id":"1001002","name":"女装"},{"id":"1001003","name":"男鞋"},{"id":"1001004","name":"女鞋"},{"id":"1001007","name":"美妆护肤"},{"id":"1001008","name":"手机数码"},{"id":"1001005","name":"箱包手袋"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 1001002
         * name : 女装
         */

        private String id;
        private String name;
        private boolean click;

        public boolean isClick() {
            return click;
        }

        public void setClick(boolean click) {
            this.click = click;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
