package com.jayjd.boxtop.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class WallPagerEntity implements Serializable {

    /**
     * code : 200
     * msg : ok
     * data : {"id":1,"title":"风景","page":1,"total_page":132,"total_count":2367,"list":[{"id":10006,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t011dc08075b491a3f9.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10018,"title":"","motto":"","img":"https://browser6.qhimg.com/t017790a05d64295077.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10020,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t01dded7f8123abf8d7.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10073,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t017a8708240919293e.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10084,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t01f936a4200c1753ad.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10089,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t017ec3ac103b8e8528.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10220,"title":"","motto":"","img":"https://browser6.qhimg.com/t01032d462e11e96f5f.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10260,"title":"","motto":"","img":"https://browser6.qhimg.com/t01846ec01ffc163529.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10271,"title":"","motto":"","img":"https://browser6.qhimg.com/t012ff82260ad828c6b.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10280,"title":"","motto":"","img":"https://browser6.qhimg.com/t017b77c7c531e67028.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10288,"title":"","motto":"","img":"https://browser6.qhimg.com/t01d3821b600b24dce6.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10294,"title":"","motto":"","img":"https://browser6.qhimg.com/t010bce1cd90e9791b7.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10359,"title":"","motto":"","img":"https://browser6.qhimg.com/t0161af8fd91d5f6e9f.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10383,"title":"","motto":"","img":"https://browser6.qhimg.com/t01696bbbbdbeafce54.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10388,"title":"","motto":"","img":"https://browser6.qhimg.com/t01cfaee817add62ef4.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10393,"title":"","motto":"","img":"https://browser6.qhimg.com/t01376f30bce04fcca3.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10420,"title":"","motto":"","img":"https://browser6.qhimg.com/t01a141d19f0e143053.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10421,"title":"","motto":"","img":"https://browser6.qhimg.com/t0111e1620a4c586178.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0}]}
     */

    private int code;
    private String msg;
    private DataBean data;

    @Data
    public static class DataBean implements Serializable {
        /**
         * id : 1
         * title : 风景
         * page : 1
         * total_page : 132
         * total_count : 2367
         * list : [{"id":10006,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t011dc08075b491a3f9.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10018,"title":"","motto":"","img":"https://browser6.qhimg.com/t017790a05d64295077.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10020,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t01dded7f8123abf8d7.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10073,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t017a8708240919293e.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10084,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t01f936a4200c1753ad.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10089,"title":"","motto":"","img":"http://browser6.qhimg.com/bdr/__85/t017ec3ac103b8e8528.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10220,"title":"","motto":"","img":"https://browser6.qhimg.com/t01032d462e11e96f5f.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10260,"title":"","motto":"","img":"https://browser6.qhimg.com/t01846ec01ffc163529.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10271,"title":"","motto":"","img":"https://browser6.qhimg.com/t012ff82260ad828c6b.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10280,"title":"","motto":"","img":"https://browser6.qhimg.com/t017b77c7c531e67028.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10288,"title":"","motto":"","img":"https://browser6.qhimg.com/t01d3821b600b24dce6.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10294,"title":"","motto":"","img":"https://browser6.qhimg.com/t010bce1cd90e9791b7.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10359,"title":"","motto":"","img":"https://browser6.qhimg.com/t0161af8fd91d5f6e9f.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10383,"title":"","motto":"","img":"https://browser6.qhimg.com/t01696bbbbdbeafce54.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10388,"title":"","motto":"","img":"https://browser6.qhimg.com/t01cfaee817add62ef4.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10393,"title":"","motto":"","img":"https://browser6.qhimg.com/t01376f30bce04fcca3.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10420,"title":"","motto":"","img":"https://browser6.qhimg.com/t01a141d19f0e143053.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0},{"id":10421,"title":"","motto":"","img":"https://browser6.qhimg.com/t0111e1620a4c586178.jpg","url":"","hash":"","md5":"","type":0,"tid":0,"tpl":{"id":0,"top":"","left":"","content":""},"is_lv":0,"lv_cnt":0,"collect":0}]
         */

        private int id;
        private String title;
        private int page;
        private int total_page;
        private int total_count;
        private List<ListBean> list;

        @Data
        public static class ListBean implements Serializable {
            /**
             * id : 10006
             * title :
             * motto :
             * img : http://browser6.qhimg.com/bdr/__85/t011dc08075b491a3f9.jpg
             * url :
             * hash :
             * md5 :
             * type : 0
             * tid : 0
             * tpl : {"id":0,"top":"","left":"","content":""}
             * is_lv : 0
             * lv_cnt : 0
             * collect : 0
             */

            private int id;
            private String title;
            private String motto;
            private String img;
            private String url;
            private String hash;
            private String md5;
            private int type;
            private int tid;
            private TplBean tpl;
            private int is_lv;
            private int lv_cnt;
            private int collect;

            @Data
            public static class TplBean implements Serializable {
                /**
                 * id : 0
                 * top :
                 * left :
                 * content :
                 */

                private int id;
                private String top;
                private String left;
                private String content;
            }
        }
    }
}
