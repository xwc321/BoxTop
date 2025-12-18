package com.jayjd.boxtop.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class HotSearchEntity implements Serializable {


    /**
     * data : {"errCode":0,"msg":"","mapResult":{"0":{"channelTitle":"热搜","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第3季","hotLevel":88,"trend":-1,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第二季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城","hotLevel":81,"trend":-1,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":81,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""}],"hasNextPage":true},"1":{"channelTitle":"电影","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"疯狂动物城","hotLevel":100,"trend":0,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟2","hotLevel":83,"trend":1,"labelList":[],"id":"mzc00200eny6gk6","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达","hotLevel":83,"trend":1,"labelList":[],"id":"ldl1811bamppdrd","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达：水之道","hotLevel":83,"trend":1,"labelList":[],"id":"76n6vdky9nfocyg","dataType":0,"mark":""},{"rankNum":0,"title":"浪浪山小妖怪","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200tpgbo78","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城2","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc0020049e46wy","dataType":0,"mark":""},{"rankNum":0,"title":"哪吒之魔童闹海","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200tjkzeps","dataType":0,"mark":""},{"rankNum":0,"title":"捕风追影","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200snrx4jb","dataType":0,"mark":""},{"rankNum":0,"title":"刺杀小说家2","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200w0ka7fc","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200opc9kuh","dataType":0,"mark":""}],"hasNextPage":true},"2":{"channelTitle":"电视剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"枭起青壤","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200d70bilg","dataType":0,"mark":""},{"rankNum":0,"title":"四喜","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200tysb3yw","dataType":0,"mark":""},{"rankNum":0,"title":"他为什么依然单身","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200c1keuqc","dataType":0,"mark":""},{"rankNum":0,"title":"许我耀眼","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200f19q8q5","dataType":0,"mark":""},{"rankNum":0,"title":"超感迷宫","hotLevel":77,"trend":0,"labelList":[],"id":"mzc002003agt7k4","dataType":0,"mark":""},{"rankNum":0,"title":"庆余年第二季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc002002kqssyu","dataType":0,"mark":""}],"hasNextPage":true},"3":{"channelTitle":"动漫","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"剑来 第二季","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":96,"trend":-1,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":90,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"完美世界","hotLevel":87,"trend":-1,"labelList":[],"id":"mcv8hkc8zk8lnov","dataType":0,"mark":""},{"rankNum":0,"title":"斗破苍穹年番","hotLevel":86,"trend":-1,"labelList":[],"id":"mzc0020027yzd9e","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆","hotLevel":85,"trend":-1,"labelList":[],"id":"m441e3rjq9kwpsc","dataType":0,"mark":""},{"rankNum":0,"title":"神印王座","hotLevel":84,"trend":1,"labelList":[],"id":"mzc002007j7p5hn","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆Ⅱ绝世唐门","hotLevel":84,"trend":1,"labelList":[],"id":"mzc00200xf3rir6","dataType":0,"mark":""},{"rankNum":0,"title":"吞噬星空","hotLevel":84,"trend":-1,"labelList":[],"id":"324olz7ilvo2j5f","dataType":0,"mark":""},{"rankNum":0,"title":"遮天","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200n53vkqc","dataType":0,"mark":""}],"hasNextPage":true},"5":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"陈晓","hotLevel":100,"trend":1,"labelList":[],"id":"w3165r4nupb","dataType":0,"mark":""},{"rankNum":2,"title":"肖战","hotLevel":90,"trend":1,"labelList":[],"id":"h33418xibnc","dataType":0,"mark":""},{"rankNum":3,"title":"梦华录","hotLevel":88,"trend":1,"labelList":[],"id":"a33418iq868","dataType":0,"mark":""},{"rankNum":4,"title":"梦华录花絮","hotLevel":84,"trend":0,"labelList":[],"id":"c3332k7ssos","dataType":0,"mark":""},{"rankNum":5,"title":"刘畊宏健身操","hotLevel":83,"trend":0,"labelList":[],"id":"x3335o7h0nu","dataType":0,"mark":""},{"rankNum":6,"title":"梦中的那片海电视剧","hotLevel":83,"trend":1,"labelList":[],"id":"l3342w9c4l5","dataType":0,"mark":""},{"rankNum":7,"title":"乘风破浪的姐姐第3季","hotLevel":83,"trend":1,"labelList":[],"id":"a3339821g39","dataType":0,"mark":""},{"rankNum":8,"title":"杨紫","hotLevel":82,"trend":1,"labelList":[],"id":"h3341ugg598","dataType":0,"mark":""},{"rankNum":9,"title":"梦华录全员直播全程回顾","hotLevel":82,"trend":1,"labelList":[],"id":"t3251yh3mcn","dataType":0,"mark":""},{"rankNum":10,"title":"林深见鹿","hotLevel":82,"trend":1,"labelList":[],"id":"p3341efvrsk","dataType":0,"mark":""}],"hasNextPage":true},"6":{"channelTitle":"游戏","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"蛋仔逃出惊魂夜","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc003s0okg2eqs","dataType":0,"mark":""},{"rankNum":0,"title":"蛋仔派对 小浪爆笑剧场2","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc0034synftdhj","dataType":0,"mark":""},{"rankNum":0,"title":"狒狒玩游戏","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc003fc3jrwlsl","dataType":0,"mark":""},{"rankNum":0,"title":"惊魂寻宝队","hotLevel":91,"trend":-100,"labelList":[],"id":"mzc0039x0kcgot0","dataType":0,"mark":""},{"rankNum":0,"title":"鲤鱼Ace游玩VR游戏","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003k9rckw1fq","dataType":0,"mark":""},{"rankNum":0,"title":"南瓜入侵·兔仙的奇妙冒险","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003toz80x856","dataType":0,"mark":""},{"rankNum":0,"title":"我的26岁女房客：在云端·视觉小说版","hotLevel":87,"trend":-100,"labelList":[],"id":"mzc00200qndx4nx","dataType":0,"mark":""},{"rankNum":0,"title":"【来米解说】我的世界生存闯关","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003vyjpx9g17","dataType":0,"mark":""},{"rankNum":0,"title":"吊德斯解说","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0039vcei1fey","dataType":0,"mark":""},{"rankNum":0,"title":"小米蕉我的世界游戏解说第一季","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003nklxthar7","dataType":0,"mark":""}],"hasNextPage":true},"9":{"channelTitle":"纪录片","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"探索新境 第2季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc0020040sajz8","dataType":0,"mark":""},{"rankNum":0,"title":"《不止于她》第三季","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200d7r2ic7","dataType":0,"mark":""},{"rankNum":0,"title":"动物王国[普通话版]","hotLevel":82,"trend":0,"labelList":[],"id":"mzc002005su9lln","dataType":0,"mark":""},{"rankNum":0,"title":"见非凡·十三邀团队特别制作","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200b2rgvmo","dataType":0,"mark":""},{"rankNum":0,"title":"探索新境·寻找王一博","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009zwrmx4","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第八季","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc00200382r10m","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第九季","hotLevel":78,"trend":0,"labelList":[],"id":"mzc002002eqyhs7","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第一季","hotLevel":77,"trend":0,"labelList":[],"id":"4oocb872jxju3c6","dataType":0,"mark":""},{"rankNum":0,"title":"新境日记 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200dawr35p","dataType":0,"mark":""},{"rankNum":0,"title":"寻找731","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200qkycu08","dataType":0,"mark":""}],"hasNextPage":true},"10":{"channelTitle":"综艺","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"现在就出发 第3季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":86,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第2季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200y41tzil","dataType":0,"mark":""},{"rankNum":0,"title":"2025腾讯视频星光大赏","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc002002h77uy8","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200ap8s2p3","dataType":0,"mark":""},{"rankNum":0,"title":"奔跑吧·天路篇","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200gvy0g5b","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜","hotLevel":79,"trend":0,"labelList":[],"id":"mzc00200vyot3cs","dataType":0,"mark":""},{"rankNum":0,"title":"开始推理吧 第3季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc002008rxvoxh","dataType":0,"mark":""},{"rankNum":0,"title":"哈哈哈哈哈 第5季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200tx4v83g","dataType":0,"mark":""},{"rankNum":0,"title":"有秘密的我们 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200ue6yh8n","dataType":0,"mark":""}],"hasNextPage":true},"22":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"硬糖少女303\u201c别怕，未来会来\u201d演唱会暨告别典礼","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200qesgi36","dataType":0,"mark":""},{"rankNum":0,"title":"2022周震南You jump ，I jump首唱会","hotLevel":97,"trend":1,"labelList":[],"id":"mzc002001dvhbqx","dataType":0,"mark":""},{"rankNum":3,"title":"INTO1天生就要飞","hotLevel":95,"trend":1,"labelList":[],"id":"m0043sagsp6","dataType":0,"mark":""},{"rankNum":4,"title":"周杰伦新歌","hotLevel":93,"trend":1,"labelList":[],"id":"i0043gp575k","dataType":0,"mark":""},{"rankNum":0,"title":"北舞·云毕业季：节目精选","hotLevel":91,"trend":1,"labelList":[],"id":"mzc00385jqyufhc","dataType":0,"mark":""},{"rankNum":0,"title":"「微光现场」廖俊涛专场音乐会","hotLevel":89,"trend":1,"labelList":[],"id":"mzc0036w4aetz7m","dataType":0,"mark":""},{"rankNum":7,"title":"田馥甄一周的朋友MV","hotLevel":87,"trend":1,"labelList":[],"id":"r3342pondpt","dataType":0,"mark":""},{"rankNum":8,"title":"孤勇者","hotLevel":85,"trend":1,"labelList":[],"id":"y0041ywgpm7","dataType":0,"mark":""},{"rankNum":0,"title":"张杰未LIVE演唱会","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200jojec27","dataType":0,"mark":""},{"rankNum":0,"title":"云首发Livehouse白景屹专场","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200r2hu9km","dataType":0,"mark":""}],"hasNextPage":true},"24":{"channelTitle":"科技","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"华为Mate品牌盛典","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc00200rekxvc4","dataType":0,"mark":""},{"rankNum":2,"title":"新骁龙来了","hotLevel":97,"trend":-100,"labelList":[],"id":"s4100lj6foi","dataType":0,"mark":""},{"rankNum":3,"title":"原生鸿蒙之夜","hotLevel":94,"trend":-100,"labelList":[],"id":"t35675hcaek","dataType":0,"mark":""},{"rankNum":4,"title":"双十一买什么笔记本？","hotLevel":91,"trend":-100,"labelList":[],"id":"k3567x2te1b","dataType":0,"mark":""},{"rankNum":0,"title":"华为见非凡品牌盛典 ","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc00200o59rufl","dataType":0,"mark":""},{"rankNum":0,"title":"大咖会客室《BOSS，你好》","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0033uz51d4h7","dataType":0,"mark":""},{"rankNum":0,"title":"耀启新境","hotLevel":83,"trend":-100,"labelList":[],"id":"mzc00200qtrrenv","dataType":0,"mark":""},{"rankNum":8,"title":"华为HarmonyOS NEXT","hotLevel":80,"trend":-100,"labelList":[],"id":"k142071fjvf","dataType":0,"mark":""},{"rankNum":9,"title":"小米澎湃OS新版体验","hotLevel":77,"trend":-100,"labelList":[],"id":"j14201m05or","dataType":0,"mark":""},{"rankNum":0,"title":"2024腾讯科学WE大会","hotLevel":-1136,"trend":-100,"labelList":[],"id":"mzc00200wlndy93","dataType":0,"mark":""}],"hasNextPage":false},"26":{"channelTitle":"微短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"君不知","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200eoiafre","dataType":0,"mark":""},{"rankNum":0,"title":"唐朝异闻录","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200kusah9g","dataType":0,"mark":""},{"rankNum":0,"title":"掌命","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200dns72ox","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":1,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"鲁班异闻录","hotLevel":77,"trend":0,"labelList":[],"id":"mzc00200vjti6na","dataType":0,"mark":""},{"rankNum":0,"title":"云天之上","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200so3dbe3","dataType":0,"mark":""},{"rankNum":0,"title":"以下犯上","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00200sdgiahh","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""}],"hasNextPage":true},"106":{"channelTitle":"少儿","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"小猪佩奇 第11季[普通话版]","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200qrzj493","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队之小砾与工程家族 第2季[普通话版]","hotLevel":92,"trend":0,"labelList":[],"id":"mzc002008hsiaqc","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第三季","hotLevel":89,"trend":0,"labelList":[],"id":"mzc00200ifxpsvp","dataType":0,"mark":""},{"rankNum":0,"title":"熊出没之神奇宝物","hotLevel":85,"trend":0,"labelList":[],"id":"mzc00200pedgbii","dataType":0,"mark":""},{"rankNum":0,"title":"宝宝巴士儿歌 3D版","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200cvmw4ea","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队立大功第九季[普通话版]","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200rvct2nk","dataType":0,"mark":""},{"rankNum":0,"title":"精灵梦叶罗丽 第十一季（上）","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200l52xgxa","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第五季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200xft9wec","dataType":0,"mark":""},{"rankNum":0,"title":"萌鸡小队第六季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200p1yh8xu","dataType":0,"mark":""},{"rankNum":0,"title":"依娜和恰恰 第2季","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009aj2jhv","dataType":0,"mark":""}],"hasNextPage":true},"556":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"林正英","hotLevel":100,"trend":1,"labelList":[],"id":"9000073139","dataType":0,"mark":""},{"rankNum":2,"title":"易烊千玺","hotLevel":87,"trend":1,"labelList":[],"id":"9000030290","dataType":0,"mark":""},{"rankNum":3,"title":"张若昀","hotLevel":86,"trend":1,"labelList":[],"id":"9000067617","dataType":0,"mark":""},{"rankNum":4,"title":"朱亚文","hotLevel":84,"trend":1,"labelList":[],"id":"9000069245","dataType":0,"mark":""},{"rankNum":5,"title":"成龙","hotLevel":84,"trend":1,"labelList":[],"id":"9000066479","dataType":0,"mark":""},{"rankNum":6,"title":"黄子韬","hotLevel":84,"trend":1,"labelList":[],"id":"9000069286","dataType":0,"mark":""},{"rankNum":7,"title":"郑业成","hotLevel":83,"trend":1,"labelList":[],"id":"9000071910","dataType":0,"mark":""},{"rankNum":8,"title":"彭禺厶","hotLevel":82,"trend":0,"labelList":[],"id":"9000093813","dataType":0,"mark":""},{"rankNum":9,"title":"袁冰妍","hotLevel":82,"trend":1,"labelList":[],"id":"9000007216","dataType":0,"mark":""},{"rankNum":10,"title":"欧豪","hotLevel":81,"trend":1,"labelList":[],"id":"9000037611","dataType":0,"mark":""}],"hasNextPage":true},"5001":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"梦华录","hotLevel":100,"trend":0,"labelList":[],"id":"梦华录","dataType":0,"mark":""},{"rankNum":2,"title":"奔跑吧 第6季","hotLevel":88,"trend":0,"labelList":[],"id":"奔跑吧 第6季","dataType":0,"mark":""},{"rankNum":3,"title":"斗罗大陆","hotLevel":83,"trend":0,"labelList":[],"id":"斗罗大陆","dataType":0,"mark":""},{"rankNum":4,"title":"战至巅峰","hotLevel":82,"trend":0,"labelList":[],"id":"战至巅峰","dataType":0,"mark":""},{"rankNum":5,"title":"回廊亭","hotLevel":81,"trend":1,"labelList":[],"id":"回廊亭","dataType":0,"mark":""},{"rankNum":6,"title":"闪亮的日子","hotLevel":79,"trend":1,"labelList":[],"id":"闪亮的日子","dataType":0,"mark":""},{"rankNum":7,"title":"王牌对王牌","hotLevel":78,"trend":-1,"labelList":[],"id":"王牌对王牌","dataType":0,"mark":""},{"rankNum":8,"title":"陈晓","hotLevel":78,"trend":1,"labelList":[],"id":"陈晓","dataType":0,"mark":""},{"rankNum":9,"title":"回廊亭邓家佳","hotLevel":78,"trend":1,"labelList":[],"id":"回廊亭邓家佳","dataType":0,"mark":""},{"rankNum":10,"title":"且试天下","hotLevel":78,"trend":1,"labelList":[],"id":"且试天下","dataType":0,"mark":""}],"hasNextPage":true},"10001":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"2022鹅厂大剧片单","hotLevel":100,"trend":0,"labelList":[],"id":"2022鹅厂大剧片单","dataType":0,"mark":""},{"rankNum":2,"title":"小学生为躲避考试报警谎称被跟踪","hotLevel":99,"trend":1,"labelList":[],"id":"小学生为躲避考试报警谎称被跟踪","dataType":0,"mark":""},{"rankNum":3,"title":"北京今日新增本土感染者5例","hotLevel":89,"trend":1,"labelList":[],"id":"北京今日新增本土感染者5例","dataType":0,"mark":""},{"rankNum":4,"title":"阿里女员工案嫌犯被判一年半","hotLevel":89,"trend":1,"labelList":[],"id":"阿里女员工案嫌犯被判一年半","dataType":0,"mark":""},{"rankNum":5,"title":"猴痘病例已输入亚洲","hotLevel":89,"trend":1,"labelList":[],"id":"猴痘病例已输入亚洲","dataType":0,"mark":""},{"rankNum":6,"title":"香港警察训练中式步操","hotLevel":87,"trend":-1,"labelList":[],"id":"香港警察训练中式步操","dataType":0,"mark":""},{"rankNum":7,"title":"我养你啊","hotLevel":87,"trend":1,"labelList":[],"id":"我养你啊","dataType":0,"mark":""},{"rankNum":8,"title":"福建辟谣高考数学平均分37.8分","hotLevel":87,"trend":-1,"labelList":[],"id":"福建辟谣高考数学平均分37.8分","dataType":0,"mark":""},{"rankNum":9,"title":"唐山民警虚报出警时间需要给一个交代","hotLevel":83,"trend":1,"labelList":[],"id":"唐山民警虚报出警时间需要给一个交代","dataType":0,"mark":""},{"rankNum":10,"title":"武大毕业生自制繁花学士帽","hotLevel":79,"trend":1,"labelList":[],"id":"武大毕业生自制繁花学士帽","dataType":0,"mark":""}],"hasNextPage":true},"10002":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"冰墩墩下班了","hotLevel":100,"trend":0,"labelList":[],"id":"冰墩墩下班了","dataType":0,"mark":""},{"rankNum":2,"title":"高亭宇扛着徐梦桃","hotLevel":97,"trend":0,"labelList":[],"id":"高亭宇扛着徐梦桃","dataType":0,"mark":""},{"rankNum":3,"title":"李玉刚羽生结弦","hotLevel":95,"trend":0,"labelList":[],"id":"李玉刚羽生结弦","dataType":0,"mark":""},{"rankNum":4,"title":"义墩墩告别","hotLevel":93,"trend":0,"labelList":[],"id":"义墩墩告别","dataType":0,"mark":""},{"rankNum":5,"title":"北京冬奥会闭幕式","hotLevel":91,"trend":0,"labelList":[],"id":"北京冬奥会闭幕式","dataType":0,"mark":""},{"rankNum":6,"title":"意大利8分钟","hotLevel":89,"trend":0,"labelList":[],"id":"意大利8分钟","dataType":0,"mark":""},{"rankNum":7,"title":"谷爱凌苏翊鸣像在蹦迪","hotLevel":87,"trend":0,"labelList":[],"id":"谷爱凌苏翊鸣像在蹦迪","dataType":0,"mark":""},{"rankNum":8,"title":"折柳寄情太浪漫了","hotLevel":85,"trend":0,"labelList":[],"id":"折柳寄情太浪漫了","dataType":0,"mark":""},{"rankNum":9,"title":"中国9金超燃混剪","hotLevel":82,"trend":0,"labelList":[],"id":"中国9金超燃混剪","dataType":0,"mark":""},{"rankNum":10,"title":"羽生结弦亲吻冰面","hotLevel":80,"trend":0,"labelList":[],"id":"羽生结弦亲吻冰面","dataType":0,"mark":""}],"hasNextPage":true},"10005":{"channelTitle":"竖屏短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":0,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""},{"rankNum":0,"title":"爸妈跑路，福宝带债主发财了","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003gak8k5fhc","dataType":0,"mark":""},{"rankNum":0,"title":"战恋告捷","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0034uo44lz1s","dataType":0,"mark":""},{"rankNum":0,"title":"她比枪火炽热","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003r8lgcno7q","dataType":0,"mark":""},{"rankNum":0,"title":"善男信女","hotLevel":75,"trend":0,"labelList":[],"id":"mzc0037149917ud","dataType":0,"mark":""},{"rankNum":0,"title":"情靡","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003b1wpxvt41","dataType":0,"mark":""},{"rankNum":0,"title":"美人替身","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003vedv3ipg5","dataType":0,"mark":""}],"hasNextPage":true}}}
     * businessHead : {"type":0,"body":""}
     * ret : 0
     */

    private DataBean data;
    private BusinessHeadBean businessHead;
    private int ret;

    @Data
    public static class DataBean implements Serializable {
        /**
         * errCode : 0
         * msg :
         * mapResult : {"0":{"channelTitle":"热搜","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第3季","hotLevel":88,"trend":-1,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第二季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城","hotLevel":81,"trend":-1,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":81,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""}],"hasNextPage":true},"1":{"channelTitle":"电影","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"疯狂动物城","hotLevel":100,"trend":0,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟2","hotLevel":83,"trend":1,"labelList":[],"id":"mzc00200eny6gk6","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达","hotLevel":83,"trend":1,"labelList":[],"id":"ldl1811bamppdrd","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达：水之道","hotLevel":83,"trend":1,"labelList":[],"id":"76n6vdky9nfocyg","dataType":0,"mark":""},{"rankNum":0,"title":"浪浪山小妖怪","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200tpgbo78","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城2","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc0020049e46wy","dataType":0,"mark":""},{"rankNum":0,"title":"哪吒之魔童闹海","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200tjkzeps","dataType":0,"mark":""},{"rankNum":0,"title":"捕风追影","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200snrx4jb","dataType":0,"mark":""},{"rankNum":0,"title":"刺杀小说家2","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200w0ka7fc","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200opc9kuh","dataType":0,"mark":""}],"hasNextPage":true},"2":{"channelTitle":"电视剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"枭起青壤","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200d70bilg","dataType":0,"mark":""},{"rankNum":0,"title":"四喜","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200tysb3yw","dataType":0,"mark":""},{"rankNum":0,"title":"他为什么依然单身","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200c1keuqc","dataType":0,"mark":""},{"rankNum":0,"title":"许我耀眼","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200f19q8q5","dataType":0,"mark":""},{"rankNum":0,"title":"超感迷宫","hotLevel":77,"trend":0,"labelList":[],"id":"mzc002003agt7k4","dataType":0,"mark":""},{"rankNum":0,"title":"庆余年第二季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc002002kqssyu","dataType":0,"mark":""}],"hasNextPage":true},"3":{"channelTitle":"动漫","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"剑来 第二季","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":96,"trend":-1,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":90,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"完美世界","hotLevel":87,"trend":-1,"labelList":[],"id":"mcv8hkc8zk8lnov","dataType":0,"mark":""},{"rankNum":0,"title":"斗破苍穹年番","hotLevel":86,"trend":-1,"labelList":[],"id":"mzc0020027yzd9e","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆","hotLevel":85,"trend":-1,"labelList":[],"id":"m441e3rjq9kwpsc","dataType":0,"mark":""},{"rankNum":0,"title":"神印王座","hotLevel":84,"trend":1,"labelList":[],"id":"mzc002007j7p5hn","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆Ⅱ绝世唐门","hotLevel":84,"trend":1,"labelList":[],"id":"mzc00200xf3rir6","dataType":0,"mark":""},{"rankNum":0,"title":"吞噬星空","hotLevel":84,"trend":-1,"labelList":[],"id":"324olz7ilvo2j5f","dataType":0,"mark":""},{"rankNum":0,"title":"遮天","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200n53vkqc","dataType":0,"mark":""}],"hasNextPage":true},"5":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"陈晓","hotLevel":100,"trend":1,"labelList":[],"id":"w3165r4nupb","dataType":0,"mark":""},{"rankNum":2,"title":"肖战","hotLevel":90,"trend":1,"labelList":[],"id":"h33418xibnc","dataType":0,"mark":""},{"rankNum":3,"title":"梦华录","hotLevel":88,"trend":1,"labelList":[],"id":"a33418iq868","dataType":0,"mark":""},{"rankNum":4,"title":"梦华录花絮","hotLevel":84,"trend":0,"labelList":[],"id":"c3332k7ssos","dataType":0,"mark":""},{"rankNum":5,"title":"刘畊宏健身操","hotLevel":83,"trend":0,"labelList":[],"id":"x3335o7h0nu","dataType":0,"mark":""},{"rankNum":6,"title":"梦中的那片海电视剧","hotLevel":83,"trend":1,"labelList":[],"id":"l3342w9c4l5","dataType":0,"mark":""},{"rankNum":7,"title":"乘风破浪的姐姐第3季","hotLevel":83,"trend":1,"labelList":[],"id":"a3339821g39","dataType":0,"mark":""},{"rankNum":8,"title":"杨紫","hotLevel":82,"trend":1,"labelList":[],"id":"h3341ugg598","dataType":0,"mark":""},{"rankNum":9,"title":"梦华录全员直播全程回顾","hotLevel":82,"trend":1,"labelList":[],"id":"t3251yh3mcn","dataType":0,"mark":""},{"rankNum":10,"title":"林深见鹿","hotLevel":82,"trend":1,"labelList":[],"id":"p3341efvrsk","dataType":0,"mark":""}],"hasNextPage":true},"6":{"channelTitle":"游戏","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"蛋仔逃出惊魂夜","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc003s0okg2eqs","dataType":0,"mark":""},{"rankNum":0,"title":"蛋仔派对 小浪爆笑剧场2","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc0034synftdhj","dataType":0,"mark":""},{"rankNum":0,"title":"狒狒玩游戏","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc003fc3jrwlsl","dataType":0,"mark":""},{"rankNum":0,"title":"惊魂寻宝队","hotLevel":91,"trend":-100,"labelList":[],"id":"mzc0039x0kcgot0","dataType":0,"mark":""},{"rankNum":0,"title":"鲤鱼Ace游玩VR游戏","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003k9rckw1fq","dataType":0,"mark":""},{"rankNum":0,"title":"南瓜入侵·兔仙的奇妙冒险","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003toz80x856","dataType":0,"mark":""},{"rankNum":0,"title":"我的26岁女房客：在云端·视觉小说版","hotLevel":87,"trend":-100,"labelList":[],"id":"mzc00200qndx4nx","dataType":0,"mark":""},{"rankNum":0,"title":"【来米解说】我的世界生存闯关","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003vyjpx9g17","dataType":0,"mark":""},{"rankNum":0,"title":"吊德斯解说","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0039vcei1fey","dataType":0,"mark":""},{"rankNum":0,"title":"小米蕉我的世界游戏解说第一季","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003nklxthar7","dataType":0,"mark":""}],"hasNextPage":true},"9":{"channelTitle":"纪录片","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"探索新境 第2季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc0020040sajz8","dataType":0,"mark":""},{"rankNum":0,"title":"《不止于她》第三季","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200d7r2ic7","dataType":0,"mark":""},{"rankNum":0,"title":"动物王国[普通话版]","hotLevel":82,"trend":0,"labelList":[],"id":"mzc002005su9lln","dataType":0,"mark":""},{"rankNum":0,"title":"见非凡·十三邀团队特别制作","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200b2rgvmo","dataType":0,"mark":""},{"rankNum":0,"title":"探索新境·寻找王一博","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009zwrmx4","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第八季","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc00200382r10m","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第九季","hotLevel":78,"trend":0,"labelList":[],"id":"mzc002002eqyhs7","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第一季","hotLevel":77,"trend":0,"labelList":[],"id":"4oocb872jxju3c6","dataType":0,"mark":""},{"rankNum":0,"title":"新境日记 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200dawr35p","dataType":0,"mark":""},{"rankNum":0,"title":"寻找731","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200qkycu08","dataType":0,"mark":""}],"hasNextPage":true},"10":{"channelTitle":"综艺","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"现在就出发 第3季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":86,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第2季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200y41tzil","dataType":0,"mark":""},{"rankNum":0,"title":"2025腾讯视频星光大赏","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc002002h77uy8","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200ap8s2p3","dataType":0,"mark":""},{"rankNum":0,"title":"奔跑吧·天路篇","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200gvy0g5b","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜","hotLevel":79,"trend":0,"labelList":[],"id":"mzc00200vyot3cs","dataType":0,"mark":""},{"rankNum":0,"title":"开始推理吧 第3季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc002008rxvoxh","dataType":0,"mark":""},{"rankNum":0,"title":"哈哈哈哈哈 第5季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200tx4v83g","dataType":0,"mark":""},{"rankNum":0,"title":"有秘密的我们 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200ue6yh8n","dataType":0,"mark":""}],"hasNextPage":true},"22":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"硬糖少女303\u201c别怕，未来会来\u201d演唱会暨告别典礼","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200qesgi36","dataType":0,"mark":""},{"rankNum":0,"title":"2022周震南You jump ，I jump首唱会","hotLevel":97,"trend":1,"labelList":[],"id":"mzc002001dvhbqx","dataType":0,"mark":""},{"rankNum":3,"title":"INTO1天生就要飞","hotLevel":95,"trend":1,"labelList":[],"id":"m0043sagsp6","dataType":0,"mark":""},{"rankNum":4,"title":"周杰伦新歌","hotLevel":93,"trend":1,"labelList":[],"id":"i0043gp575k","dataType":0,"mark":""},{"rankNum":0,"title":"北舞·云毕业季：节目精选","hotLevel":91,"trend":1,"labelList":[],"id":"mzc00385jqyufhc","dataType":0,"mark":""},{"rankNum":0,"title":"「微光现场」廖俊涛专场音乐会","hotLevel":89,"trend":1,"labelList":[],"id":"mzc0036w4aetz7m","dataType":0,"mark":""},{"rankNum":7,"title":"田馥甄一周的朋友MV","hotLevel":87,"trend":1,"labelList":[],"id":"r3342pondpt","dataType":0,"mark":""},{"rankNum":8,"title":"孤勇者","hotLevel":85,"trend":1,"labelList":[],"id":"y0041ywgpm7","dataType":0,"mark":""},{"rankNum":0,"title":"张杰未LIVE演唱会","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200jojec27","dataType":0,"mark":""},{"rankNum":0,"title":"云首发Livehouse白景屹专场","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200r2hu9km","dataType":0,"mark":""}],"hasNextPage":true},"24":{"channelTitle":"科技","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"华为Mate品牌盛典","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc00200rekxvc4","dataType":0,"mark":""},{"rankNum":2,"title":"新骁龙来了","hotLevel":97,"trend":-100,"labelList":[],"id":"s4100lj6foi","dataType":0,"mark":""},{"rankNum":3,"title":"原生鸿蒙之夜","hotLevel":94,"trend":-100,"labelList":[],"id":"t35675hcaek","dataType":0,"mark":""},{"rankNum":4,"title":"双十一买什么笔记本？","hotLevel":91,"trend":-100,"labelList":[],"id":"k3567x2te1b","dataType":0,"mark":""},{"rankNum":0,"title":"华为见非凡品牌盛典 ","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc00200o59rufl","dataType":0,"mark":""},{"rankNum":0,"title":"大咖会客室《BOSS，你好》","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0033uz51d4h7","dataType":0,"mark":""},{"rankNum":0,"title":"耀启新境","hotLevel":83,"trend":-100,"labelList":[],"id":"mzc00200qtrrenv","dataType":0,"mark":""},{"rankNum":8,"title":"华为HarmonyOS NEXT","hotLevel":80,"trend":-100,"labelList":[],"id":"k142071fjvf","dataType":0,"mark":""},{"rankNum":9,"title":"小米澎湃OS新版体验","hotLevel":77,"trend":-100,"labelList":[],"id":"j14201m05or","dataType":0,"mark":""},{"rankNum":0,"title":"2024腾讯科学WE大会","hotLevel":-1136,"trend":-100,"labelList":[],"id":"mzc00200wlndy93","dataType":0,"mark":""}],"hasNextPage":false},"26":{"channelTitle":"微短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"君不知","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200eoiafre","dataType":0,"mark":""},{"rankNum":0,"title":"唐朝异闻录","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200kusah9g","dataType":0,"mark":""},{"rankNum":0,"title":"掌命","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200dns72ox","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":1,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"鲁班异闻录","hotLevel":77,"trend":0,"labelList":[],"id":"mzc00200vjti6na","dataType":0,"mark":""},{"rankNum":0,"title":"云天之上","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200so3dbe3","dataType":0,"mark":""},{"rankNum":0,"title":"以下犯上","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00200sdgiahh","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""}],"hasNextPage":true},"106":{"channelTitle":"少儿","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"小猪佩奇 第11季[普通话版]","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200qrzj493","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队之小砾与工程家族 第2季[普通话版]","hotLevel":92,"trend":0,"labelList":[],"id":"mzc002008hsiaqc","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第三季","hotLevel":89,"trend":0,"labelList":[],"id":"mzc00200ifxpsvp","dataType":0,"mark":""},{"rankNum":0,"title":"熊出没之神奇宝物","hotLevel":85,"trend":0,"labelList":[],"id":"mzc00200pedgbii","dataType":0,"mark":""},{"rankNum":0,"title":"宝宝巴士儿歌 3D版","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200cvmw4ea","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队立大功第九季[普通话版]","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200rvct2nk","dataType":0,"mark":""},{"rankNum":0,"title":"精灵梦叶罗丽 第十一季（上）","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200l52xgxa","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第五季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200xft9wec","dataType":0,"mark":""},{"rankNum":0,"title":"萌鸡小队第六季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200p1yh8xu","dataType":0,"mark":""},{"rankNum":0,"title":"依娜和恰恰 第2季","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009aj2jhv","dataType":0,"mark":""}],"hasNextPage":true},"556":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"林正英","hotLevel":100,"trend":1,"labelList":[],"id":"9000073139","dataType":0,"mark":""},{"rankNum":2,"title":"易烊千玺","hotLevel":87,"trend":1,"labelList":[],"id":"9000030290","dataType":0,"mark":""},{"rankNum":3,"title":"张若昀","hotLevel":86,"trend":1,"labelList":[],"id":"9000067617","dataType":0,"mark":""},{"rankNum":4,"title":"朱亚文","hotLevel":84,"trend":1,"labelList":[],"id":"9000069245","dataType":0,"mark":""},{"rankNum":5,"title":"成龙","hotLevel":84,"trend":1,"labelList":[],"id":"9000066479","dataType":0,"mark":""},{"rankNum":6,"title":"黄子韬","hotLevel":84,"trend":1,"labelList":[],"id":"9000069286","dataType":0,"mark":""},{"rankNum":7,"title":"郑业成","hotLevel":83,"trend":1,"labelList":[],"id":"9000071910","dataType":0,"mark":""},{"rankNum":8,"title":"彭禺厶","hotLevel":82,"trend":0,"labelList":[],"id":"9000093813","dataType":0,"mark":""},{"rankNum":9,"title":"袁冰妍","hotLevel":82,"trend":1,"labelList":[],"id":"9000007216","dataType":0,"mark":""},{"rankNum":10,"title":"欧豪","hotLevel":81,"trend":1,"labelList":[],"id":"9000037611","dataType":0,"mark":""}],"hasNextPage":true},"5001":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"梦华录","hotLevel":100,"trend":0,"labelList":[],"id":"梦华录","dataType":0,"mark":""},{"rankNum":2,"title":"奔跑吧 第6季","hotLevel":88,"trend":0,"labelList":[],"id":"奔跑吧 第6季","dataType":0,"mark":""},{"rankNum":3,"title":"斗罗大陆","hotLevel":83,"trend":0,"labelList":[],"id":"斗罗大陆","dataType":0,"mark":""},{"rankNum":4,"title":"战至巅峰","hotLevel":82,"trend":0,"labelList":[],"id":"战至巅峰","dataType":0,"mark":""},{"rankNum":5,"title":"回廊亭","hotLevel":81,"trend":1,"labelList":[],"id":"回廊亭","dataType":0,"mark":""},{"rankNum":6,"title":"闪亮的日子","hotLevel":79,"trend":1,"labelList":[],"id":"闪亮的日子","dataType":0,"mark":""},{"rankNum":7,"title":"王牌对王牌","hotLevel":78,"trend":-1,"labelList":[],"id":"王牌对王牌","dataType":0,"mark":""},{"rankNum":8,"title":"陈晓","hotLevel":78,"trend":1,"labelList":[],"id":"陈晓","dataType":0,"mark":""},{"rankNum":9,"title":"回廊亭邓家佳","hotLevel":78,"trend":1,"labelList":[],"id":"回廊亭邓家佳","dataType":0,"mark":""},{"rankNum":10,"title":"且试天下","hotLevel":78,"trend":1,"labelList":[],"id":"且试天下","dataType":0,"mark":""}],"hasNextPage":true},"10001":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"2022鹅厂大剧片单","hotLevel":100,"trend":0,"labelList":[],"id":"2022鹅厂大剧片单","dataType":0,"mark":""},{"rankNum":2,"title":"小学生为躲避考试报警谎称被跟踪","hotLevel":99,"trend":1,"labelList":[],"id":"小学生为躲避考试报警谎称被跟踪","dataType":0,"mark":""},{"rankNum":3,"title":"北京今日新增本土感染者5例","hotLevel":89,"trend":1,"labelList":[],"id":"北京今日新增本土感染者5例","dataType":0,"mark":""},{"rankNum":4,"title":"阿里女员工案嫌犯被判一年半","hotLevel":89,"trend":1,"labelList":[],"id":"阿里女员工案嫌犯被判一年半","dataType":0,"mark":""},{"rankNum":5,"title":"猴痘病例已输入亚洲","hotLevel":89,"trend":1,"labelList":[],"id":"猴痘病例已输入亚洲","dataType":0,"mark":""},{"rankNum":6,"title":"香港警察训练中式步操","hotLevel":87,"trend":-1,"labelList":[],"id":"香港警察训练中式步操","dataType":0,"mark":""},{"rankNum":7,"title":"我养你啊","hotLevel":87,"trend":1,"labelList":[],"id":"我养你啊","dataType":0,"mark":""},{"rankNum":8,"title":"福建辟谣高考数学平均分37.8分","hotLevel":87,"trend":-1,"labelList":[],"id":"福建辟谣高考数学平均分37.8分","dataType":0,"mark":""},{"rankNum":9,"title":"唐山民警虚报出警时间需要给一个交代","hotLevel":83,"trend":1,"labelList":[],"id":"唐山民警虚报出警时间需要给一个交代","dataType":0,"mark":""},{"rankNum":10,"title":"武大毕业生自制繁花学士帽","hotLevel":79,"trend":1,"labelList":[],"id":"武大毕业生自制繁花学士帽","dataType":0,"mark":""}],"hasNextPage":true},"10002":{"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"冰墩墩下班了","hotLevel":100,"trend":0,"labelList":[],"id":"冰墩墩下班了","dataType":0,"mark":""},{"rankNum":2,"title":"高亭宇扛着徐梦桃","hotLevel":97,"trend":0,"labelList":[],"id":"高亭宇扛着徐梦桃","dataType":0,"mark":""},{"rankNum":3,"title":"李玉刚羽生结弦","hotLevel":95,"trend":0,"labelList":[],"id":"李玉刚羽生结弦","dataType":0,"mark":""},{"rankNum":4,"title":"义墩墩告别","hotLevel":93,"trend":0,"labelList":[],"id":"义墩墩告别","dataType":0,"mark":""},{"rankNum":5,"title":"北京冬奥会闭幕式","hotLevel":91,"trend":0,"labelList":[],"id":"北京冬奥会闭幕式","dataType":0,"mark":""},{"rankNum":6,"title":"意大利8分钟","hotLevel":89,"trend":0,"labelList":[],"id":"意大利8分钟","dataType":0,"mark":""},{"rankNum":7,"title":"谷爱凌苏翊鸣像在蹦迪","hotLevel":87,"trend":0,"labelList":[],"id":"谷爱凌苏翊鸣像在蹦迪","dataType":0,"mark":""},{"rankNum":8,"title":"折柳寄情太浪漫了","hotLevel":85,"trend":0,"labelList":[],"id":"折柳寄情太浪漫了","dataType":0,"mark":""},{"rankNum":9,"title":"中国9金超燃混剪","hotLevel":82,"trend":0,"labelList":[],"id":"中国9金超燃混剪","dataType":0,"mark":""},{"rankNum":10,"title":"羽生结弦亲吻冰面","hotLevel":80,"trend":0,"labelList":[],"id":"羽生结弦亲吻冰面","dataType":0,"mark":""}],"hasNextPage":true},"10005":{"channelTitle":"竖屏短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":0,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""},{"rankNum":0,"title":"爸妈跑路，福宝带债主发财了","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003gak8k5fhc","dataType":0,"mark":""},{"rankNum":0,"title":"战恋告捷","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0034uo44lz1s","dataType":0,"mark":""},{"rankNum":0,"title":"她比枪火炽热","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003r8lgcno7q","dataType":0,"mark":""},{"rankNum":0,"title":"善男信女","hotLevel":75,"trend":0,"labelList":[],"id":"mzc0037149917ud","dataType":0,"mark":""},{"rankNum":0,"title":"情靡","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003b1wpxvt41","dataType":0,"mark":""},{"rankNum":0,"title":"美人替身","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003vedv3ipg5","dataType":0,"mark":""}],"hasNextPage":true}}
         */

        private int errCode;
        private String msg;
        private MapResultBean mapResult;

        @Data
        public static class MapResultBean implements Serializable {
            /**
             * 0 : {"channelTitle":"热搜","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第3季","hotLevel":88,"trend":-1,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第二季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城","hotLevel":81,"trend":-1,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":81,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""}],"hasNextPage":true}
             * 1 : {"channelTitle":"电影","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"疯狂动物城","hotLevel":100,"trend":0,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟2","hotLevel":83,"trend":1,"labelList":[],"id":"mzc00200eny6gk6","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达","hotLevel":83,"trend":1,"labelList":[],"id":"ldl1811bamppdrd","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达：水之道","hotLevel":83,"trend":1,"labelList":[],"id":"76n6vdky9nfocyg","dataType":0,"mark":""},{"rankNum":0,"title":"浪浪山小妖怪","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200tpgbo78","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城2","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc0020049e46wy","dataType":0,"mark":""},{"rankNum":0,"title":"哪吒之魔童闹海","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200tjkzeps","dataType":0,"mark":""},{"rankNum":0,"title":"捕风追影","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200snrx4jb","dataType":0,"mark":""},{"rankNum":0,"title":"刺杀小说家2","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200w0ka7fc","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200opc9kuh","dataType":0,"mark":""}],"hasNextPage":true}
             * 2 : {"channelTitle":"电视剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"枭起青壤","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200d70bilg","dataType":0,"mark":""},{"rankNum":0,"title":"四喜","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200tysb3yw","dataType":0,"mark":""},{"rankNum":0,"title":"他为什么依然单身","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200c1keuqc","dataType":0,"mark":""},{"rankNum":0,"title":"许我耀眼","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200f19q8q5","dataType":0,"mark":""},{"rankNum":0,"title":"超感迷宫","hotLevel":77,"trend":0,"labelList":[],"id":"mzc002003agt7k4","dataType":0,"mark":""},{"rankNum":0,"title":"庆余年第二季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc002002kqssyu","dataType":0,"mark":""}],"hasNextPage":true}
             * 3 : {"channelTitle":"动漫","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"剑来 第二季","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":96,"trend":-1,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":90,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"完美世界","hotLevel":87,"trend":-1,"labelList":[],"id":"mcv8hkc8zk8lnov","dataType":0,"mark":""},{"rankNum":0,"title":"斗破苍穹年番","hotLevel":86,"trend":-1,"labelList":[],"id":"mzc0020027yzd9e","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆","hotLevel":85,"trend":-1,"labelList":[],"id":"m441e3rjq9kwpsc","dataType":0,"mark":""},{"rankNum":0,"title":"神印王座","hotLevel":84,"trend":1,"labelList":[],"id":"mzc002007j7p5hn","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆Ⅱ绝世唐门","hotLevel":84,"trend":1,"labelList":[],"id":"mzc00200xf3rir6","dataType":0,"mark":""},{"rankNum":0,"title":"吞噬星空","hotLevel":84,"trend":-1,"labelList":[],"id":"324olz7ilvo2j5f","dataType":0,"mark":""},{"rankNum":0,"title":"遮天","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200n53vkqc","dataType":0,"mark":""}],"hasNextPage":true}
             * 5 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"陈晓","hotLevel":100,"trend":1,"labelList":[],"id":"w3165r4nupb","dataType":0,"mark":""},{"rankNum":2,"title":"肖战","hotLevel":90,"trend":1,"labelList":[],"id":"h33418xibnc","dataType":0,"mark":""},{"rankNum":3,"title":"梦华录","hotLevel":88,"trend":1,"labelList":[],"id":"a33418iq868","dataType":0,"mark":""},{"rankNum":4,"title":"梦华录花絮","hotLevel":84,"trend":0,"labelList":[],"id":"c3332k7ssos","dataType":0,"mark":""},{"rankNum":5,"title":"刘畊宏健身操","hotLevel":83,"trend":0,"labelList":[],"id":"x3335o7h0nu","dataType":0,"mark":""},{"rankNum":6,"title":"梦中的那片海电视剧","hotLevel":83,"trend":1,"labelList":[],"id":"l3342w9c4l5","dataType":0,"mark":""},{"rankNum":7,"title":"乘风破浪的姐姐第3季","hotLevel":83,"trend":1,"labelList":[],"id":"a3339821g39","dataType":0,"mark":""},{"rankNum":8,"title":"杨紫","hotLevel":82,"trend":1,"labelList":[],"id":"h3341ugg598","dataType":0,"mark":""},{"rankNum":9,"title":"梦华录全员直播全程回顾","hotLevel":82,"trend":1,"labelList":[],"id":"t3251yh3mcn","dataType":0,"mark":""},{"rankNum":10,"title":"林深见鹿","hotLevel":82,"trend":1,"labelList":[],"id":"p3341efvrsk","dataType":0,"mark":""}],"hasNextPage":true}
             * 6 : {"channelTitle":"游戏","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"蛋仔逃出惊魂夜","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc003s0okg2eqs","dataType":0,"mark":""},{"rankNum":0,"title":"蛋仔派对 小浪爆笑剧场2","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc0034synftdhj","dataType":0,"mark":""},{"rankNum":0,"title":"狒狒玩游戏","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc003fc3jrwlsl","dataType":0,"mark":""},{"rankNum":0,"title":"惊魂寻宝队","hotLevel":91,"trend":-100,"labelList":[],"id":"mzc0039x0kcgot0","dataType":0,"mark":""},{"rankNum":0,"title":"鲤鱼Ace游玩VR游戏","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003k9rckw1fq","dataType":0,"mark":""},{"rankNum":0,"title":"南瓜入侵·兔仙的奇妙冒险","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003toz80x856","dataType":0,"mark":""},{"rankNum":0,"title":"我的26岁女房客：在云端·视觉小说版","hotLevel":87,"trend":-100,"labelList":[],"id":"mzc00200qndx4nx","dataType":0,"mark":""},{"rankNum":0,"title":"【来米解说】我的世界生存闯关","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003vyjpx9g17","dataType":0,"mark":""},{"rankNum":0,"title":"吊德斯解说","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0039vcei1fey","dataType":0,"mark":""},{"rankNum":0,"title":"小米蕉我的世界游戏解说第一季","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003nklxthar7","dataType":0,"mark":""}],"hasNextPage":true}
             * 9 : {"channelTitle":"纪录片","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"探索新境 第2季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc0020040sajz8","dataType":0,"mark":""},{"rankNum":0,"title":"《不止于她》第三季","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200d7r2ic7","dataType":0,"mark":""},{"rankNum":0,"title":"动物王国[普通话版]","hotLevel":82,"trend":0,"labelList":[],"id":"mzc002005su9lln","dataType":0,"mark":""},{"rankNum":0,"title":"见非凡·十三邀团队特别制作","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200b2rgvmo","dataType":0,"mark":""},{"rankNum":0,"title":"探索新境·寻找王一博","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009zwrmx4","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第八季","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc00200382r10m","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第九季","hotLevel":78,"trend":0,"labelList":[],"id":"mzc002002eqyhs7","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第一季","hotLevel":77,"trend":0,"labelList":[],"id":"4oocb872jxju3c6","dataType":0,"mark":""},{"rankNum":0,"title":"新境日记 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200dawr35p","dataType":0,"mark":""},{"rankNum":0,"title":"寻找731","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200qkycu08","dataType":0,"mark":""}],"hasNextPage":true}
             * 10 : {"channelTitle":"综艺","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"现在就出发 第3季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":86,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第2季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200y41tzil","dataType":0,"mark":""},{"rankNum":0,"title":"2025腾讯视频星光大赏","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc002002h77uy8","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200ap8s2p3","dataType":0,"mark":""},{"rankNum":0,"title":"奔跑吧·天路篇","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200gvy0g5b","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜","hotLevel":79,"trend":0,"labelList":[],"id":"mzc00200vyot3cs","dataType":0,"mark":""},{"rankNum":0,"title":"开始推理吧 第3季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc002008rxvoxh","dataType":0,"mark":""},{"rankNum":0,"title":"哈哈哈哈哈 第5季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200tx4v83g","dataType":0,"mark":""},{"rankNum":0,"title":"有秘密的我们 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200ue6yh8n","dataType":0,"mark":""}],"hasNextPage":true}
             * 22 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"硬糖少女303\u201c别怕，未来会来\u201d演唱会暨告别典礼","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200qesgi36","dataType":0,"mark":""},{"rankNum":0,"title":"2022周震南You jump ，I jump首唱会","hotLevel":97,"trend":1,"labelList":[],"id":"mzc002001dvhbqx","dataType":0,"mark":""},{"rankNum":3,"title":"INTO1天生就要飞","hotLevel":95,"trend":1,"labelList":[],"id":"m0043sagsp6","dataType":0,"mark":""},{"rankNum":4,"title":"周杰伦新歌","hotLevel":93,"trend":1,"labelList":[],"id":"i0043gp575k","dataType":0,"mark":""},{"rankNum":0,"title":"北舞·云毕业季：节目精选","hotLevel":91,"trend":1,"labelList":[],"id":"mzc00385jqyufhc","dataType":0,"mark":""},{"rankNum":0,"title":"「微光现场」廖俊涛专场音乐会","hotLevel":89,"trend":1,"labelList":[],"id":"mzc0036w4aetz7m","dataType":0,"mark":""},{"rankNum":7,"title":"田馥甄一周的朋友MV","hotLevel":87,"trend":1,"labelList":[],"id":"r3342pondpt","dataType":0,"mark":""},{"rankNum":8,"title":"孤勇者","hotLevel":85,"trend":1,"labelList":[],"id":"y0041ywgpm7","dataType":0,"mark":""},{"rankNum":0,"title":"张杰未LIVE演唱会","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200jojec27","dataType":0,"mark":""},{"rankNum":0,"title":"云首发Livehouse白景屹专场","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200r2hu9km","dataType":0,"mark":""}],"hasNextPage":true}
             * 24 : {"channelTitle":"科技","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"华为Mate品牌盛典","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc00200rekxvc4","dataType":0,"mark":""},{"rankNum":2,"title":"新骁龙来了","hotLevel":97,"trend":-100,"labelList":[],"id":"s4100lj6foi","dataType":0,"mark":""},{"rankNum":3,"title":"原生鸿蒙之夜","hotLevel":94,"trend":-100,"labelList":[],"id":"t35675hcaek","dataType":0,"mark":""},{"rankNum":4,"title":"双十一买什么笔记本？","hotLevel":91,"trend":-100,"labelList":[],"id":"k3567x2te1b","dataType":0,"mark":""},{"rankNum":0,"title":"华为见非凡品牌盛典 ","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc00200o59rufl","dataType":0,"mark":""},{"rankNum":0,"title":"大咖会客室《BOSS，你好》","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0033uz51d4h7","dataType":0,"mark":""},{"rankNum":0,"title":"耀启新境","hotLevel":83,"trend":-100,"labelList":[],"id":"mzc00200qtrrenv","dataType":0,"mark":""},{"rankNum":8,"title":"华为HarmonyOS NEXT","hotLevel":80,"trend":-100,"labelList":[],"id":"k142071fjvf","dataType":0,"mark":""},{"rankNum":9,"title":"小米澎湃OS新版体验","hotLevel":77,"trend":-100,"labelList":[],"id":"j14201m05or","dataType":0,"mark":""},{"rankNum":0,"title":"2024腾讯科学WE大会","hotLevel":-1136,"trend":-100,"labelList":[],"id":"mzc00200wlndy93","dataType":0,"mark":""}],"hasNextPage":false}
             * 26 : {"channelTitle":"微短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"君不知","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200eoiafre","dataType":0,"mark":""},{"rankNum":0,"title":"唐朝异闻录","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200kusah9g","dataType":0,"mark":""},{"rankNum":0,"title":"掌命","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200dns72ox","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":1,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"鲁班异闻录","hotLevel":77,"trend":0,"labelList":[],"id":"mzc00200vjti6na","dataType":0,"mark":""},{"rankNum":0,"title":"云天之上","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200so3dbe3","dataType":0,"mark":""},{"rankNum":0,"title":"以下犯上","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00200sdgiahh","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""}],"hasNextPage":true}
             * 106 : {"channelTitle":"少儿","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"小猪佩奇 第11季[普通话版]","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200qrzj493","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队之小砾与工程家族 第2季[普通话版]","hotLevel":92,"trend":0,"labelList":[],"id":"mzc002008hsiaqc","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第三季","hotLevel":89,"trend":0,"labelList":[],"id":"mzc00200ifxpsvp","dataType":0,"mark":""},{"rankNum":0,"title":"熊出没之神奇宝物","hotLevel":85,"trend":0,"labelList":[],"id":"mzc00200pedgbii","dataType":0,"mark":""},{"rankNum":0,"title":"宝宝巴士儿歌 3D版","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200cvmw4ea","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队立大功第九季[普通话版]","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200rvct2nk","dataType":0,"mark":""},{"rankNum":0,"title":"精灵梦叶罗丽 第十一季（上）","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200l52xgxa","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第五季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200xft9wec","dataType":0,"mark":""},{"rankNum":0,"title":"萌鸡小队第六季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200p1yh8xu","dataType":0,"mark":""},{"rankNum":0,"title":"依娜和恰恰 第2季","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009aj2jhv","dataType":0,"mark":""}],"hasNextPage":true}
             * 556 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"林正英","hotLevel":100,"trend":1,"labelList":[],"id":"9000073139","dataType":0,"mark":""},{"rankNum":2,"title":"易烊千玺","hotLevel":87,"trend":1,"labelList":[],"id":"9000030290","dataType":0,"mark":""},{"rankNum":3,"title":"张若昀","hotLevel":86,"trend":1,"labelList":[],"id":"9000067617","dataType":0,"mark":""},{"rankNum":4,"title":"朱亚文","hotLevel":84,"trend":1,"labelList":[],"id":"9000069245","dataType":0,"mark":""},{"rankNum":5,"title":"成龙","hotLevel":84,"trend":1,"labelList":[],"id":"9000066479","dataType":0,"mark":""},{"rankNum":6,"title":"黄子韬","hotLevel":84,"trend":1,"labelList":[],"id":"9000069286","dataType":0,"mark":""},{"rankNum":7,"title":"郑业成","hotLevel":83,"trend":1,"labelList":[],"id":"9000071910","dataType":0,"mark":""},{"rankNum":8,"title":"彭禺厶","hotLevel":82,"trend":0,"labelList":[],"id":"9000093813","dataType":0,"mark":""},{"rankNum":9,"title":"袁冰妍","hotLevel":82,"trend":1,"labelList":[],"id":"9000007216","dataType":0,"mark":""},{"rankNum":10,"title":"欧豪","hotLevel":81,"trend":1,"labelList":[],"id":"9000037611","dataType":0,"mark":""}],"hasNextPage":true}
             * 5001 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"梦华录","hotLevel":100,"trend":0,"labelList":[],"id":"梦华录","dataType":0,"mark":""},{"rankNum":2,"title":"奔跑吧 第6季","hotLevel":88,"trend":0,"labelList":[],"id":"奔跑吧 第6季","dataType":0,"mark":""},{"rankNum":3,"title":"斗罗大陆","hotLevel":83,"trend":0,"labelList":[],"id":"斗罗大陆","dataType":0,"mark":""},{"rankNum":4,"title":"战至巅峰","hotLevel":82,"trend":0,"labelList":[],"id":"战至巅峰","dataType":0,"mark":""},{"rankNum":5,"title":"回廊亭","hotLevel":81,"trend":1,"labelList":[],"id":"回廊亭","dataType":0,"mark":""},{"rankNum":6,"title":"闪亮的日子","hotLevel":79,"trend":1,"labelList":[],"id":"闪亮的日子","dataType":0,"mark":""},{"rankNum":7,"title":"王牌对王牌","hotLevel":78,"trend":-1,"labelList":[],"id":"王牌对王牌","dataType":0,"mark":""},{"rankNum":8,"title":"陈晓","hotLevel":78,"trend":1,"labelList":[],"id":"陈晓","dataType":0,"mark":""},{"rankNum":9,"title":"回廊亭邓家佳","hotLevel":78,"trend":1,"labelList":[],"id":"回廊亭邓家佳","dataType":0,"mark":""},{"rankNum":10,"title":"且试天下","hotLevel":78,"trend":1,"labelList":[],"id":"且试天下","dataType":0,"mark":""}],"hasNextPage":true}
             * 10001 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"2022鹅厂大剧片单","hotLevel":100,"trend":0,"labelList":[],"id":"2022鹅厂大剧片单","dataType":0,"mark":""},{"rankNum":2,"title":"小学生为躲避考试报警谎称被跟踪","hotLevel":99,"trend":1,"labelList":[],"id":"小学生为躲避考试报警谎称被跟踪","dataType":0,"mark":""},{"rankNum":3,"title":"北京今日新增本土感染者5例","hotLevel":89,"trend":1,"labelList":[],"id":"北京今日新增本土感染者5例","dataType":0,"mark":""},{"rankNum":4,"title":"阿里女员工案嫌犯被判一年半","hotLevel":89,"trend":1,"labelList":[],"id":"阿里女员工案嫌犯被判一年半","dataType":0,"mark":""},{"rankNum":5,"title":"猴痘病例已输入亚洲","hotLevel":89,"trend":1,"labelList":[],"id":"猴痘病例已输入亚洲","dataType":0,"mark":""},{"rankNum":6,"title":"香港警察训练中式步操","hotLevel":87,"trend":-1,"labelList":[],"id":"香港警察训练中式步操","dataType":0,"mark":""},{"rankNum":7,"title":"我养你啊","hotLevel":87,"trend":1,"labelList":[],"id":"我养你啊","dataType":0,"mark":""},{"rankNum":8,"title":"福建辟谣高考数学平均分37.8分","hotLevel":87,"trend":-1,"labelList":[],"id":"福建辟谣高考数学平均分37.8分","dataType":0,"mark":""},{"rankNum":9,"title":"唐山民警虚报出警时间需要给一个交代","hotLevel":83,"trend":1,"labelList":[],"id":"唐山民警虚报出警时间需要给一个交代","dataType":0,"mark":""},{"rankNum":10,"title":"武大毕业生自制繁花学士帽","hotLevel":79,"trend":1,"labelList":[],"id":"武大毕业生自制繁花学士帽","dataType":0,"mark":""}],"hasNextPage":true}
             * 10002 : {"channelTitle":"","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":1,"title":"冰墩墩下班了","hotLevel":100,"trend":0,"labelList":[],"id":"冰墩墩下班了","dataType":0,"mark":""},{"rankNum":2,"title":"高亭宇扛着徐梦桃","hotLevel":97,"trend":0,"labelList":[],"id":"高亭宇扛着徐梦桃","dataType":0,"mark":""},{"rankNum":3,"title":"李玉刚羽生结弦","hotLevel":95,"trend":0,"labelList":[],"id":"李玉刚羽生结弦","dataType":0,"mark":""},{"rankNum":4,"title":"义墩墩告别","hotLevel":93,"trend":0,"labelList":[],"id":"义墩墩告别","dataType":0,"mark":""},{"rankNum":5,"title":"北京冬奥会闭幕式","hotLevel":91,"trend":0,"labelList":[],"id":"北京冬奥会闭幕式","dataType":0,"mark":""},{"rankNum":6,"title":"意大利8分钟","hotLevel":89,"trend":0,"labelList":[],"id":"意大利8分钟","dataType":0,"mark":""},{"rankNum":7,"title":"谷爱凌苏翊鸣像在蹦迪","hotLevel":87,"trend":0,"labelList":[],"id":"谷爱凌苏翊鸣像在蹦迪","dataType":0,"mark":""},{"rankNum":8,"title":"折柳寄情太浪漫了","hotLevel":85,"trend":0,"labelList":[],"id":"折柳寄情太浪漫了","dataType":0,"mark":""},{"rankNum":9,"title":"中国9金超燃混剪","hotLevel":82,"trend":0,"labelList":[],"id":"中国9金超燃混剪","dataType":0,"mark":""},{"rankNum":10,"title":"羽生结弦亲吻冰面","hotLevel":80,"trend":0,"labelList":[],"id":"羽生结弦亲吻冰面","dataType":0,"mark":""}],"hasNextPage":true}
             * 10005 : {"channelTitle":"竖屏短剧","areaTitle":"","modifyTime":"","listInfo":[{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":0,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""},{"rankNum":0,"title":"爸妈跑路，福宝带债主发财了","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003gak8k5fhc","dataType":0,"mark":""},{"rankNum":0,"title":"战恋告捷","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0034uo44lz1s","dataType":0,"mark":""},{"rankNum":0,"title":"她比枪火炽热","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003r8lgcno7q","dataType":0,"mark":""},{"rankNum":0,"title":"善男信女","hotLevel":75,"trend":0,"labelList":[],"id":"mzc0037149917ud","dataType":0,"mark":""},{"rankNum":0,"title":"情靡","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003b1wpxvt41","dataType":0,"mark":""},{"rankNum":0,"title":"美人替身","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003vedv3ipg5","dataType":0,"mark":""}],"hasNextPage":true}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("10")
            private _$10Bean _$10;


            @Data
            public static class _$0Bean implements Serializable {
                /**
                 * channelTitle : 热搜
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第3季","hotLevel":88,"trend":-1,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第二季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城","hotLevel":81,"trend":-1,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":81,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBean> listInfo;

                @Data
                public static class ListInfoBean implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 哑舍
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : mzc00200ilimmaa
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$1Bean implements Serializable {
                /**
                 * channelTitle : 电影
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"疯狂动物城","hotLevel":100,"trend":0,"labelList":[],"id":"fhe2h7sop52qzza","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟2","hotLevel":83,"trend":1,"labelList":[],"id":"mzc00200eny6gk6","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达","hotLevel":83,"trend":1,"labelList":[],"id":"ldl1811bamppdrd","dataType":0,"mark":""},{"rankNum":0,"title":"阿凡达：水之道","hotLevel":83,"trend":1,"labelList":[],"id":"76n6vdky9nfocyg","dataType":0,"mark":""},{"rankNum":0,"title":"浪浪山小妖怪","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200tpgbo78","dataType":0,"mark":""},{"rankNum":0,"title":"疯狂动物城2","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc0020049e46wy","dataType":0,"mark":""},{"rankNum":0,"title":"哪吒之魔童闹海","hotLevel":81,"trend":0,"labelList":[],"id":"mzc00200tjkzeps","dataType":0,"mark":""},{"rankNum":0,"title":"捕风追影","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200snrx4jb","dataType":0,"mark":""},{"rankNum":0,"title":"刺杀小说家2","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200w0ka7fc","dataType":0,"mark":""},{"rankNum":0,"title":"坏蛋联盟","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200opc9kuh","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanX> listInfo;

                @Data
                public static class ListInfoBeanX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 疯狂动物城
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : fhe2h7sop52qzza
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$2Bean implements Serializable {
                /**
                 * channelTitle : 电视剧
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"哑舍","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200ilimmaa","dataType":0,"mark":""},{"rankNum":0,"title":"老舅","hotLevel":95,"trend":-1,"labelList":[],"id":"mzc002009xkvw78","dataType":0,"mark":""},{"rankNum":0,"title":"狙击蝴蝶","hotLevel":85,"trend":-1,"labelList":[],"id":"mzc00200djd8qu9","dataType":0,"mark":""},{"rankNum":0,"title":"方夏","hotLevel":79,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"枭起青壤","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200d70bilg","dataType":0,"mark":""},{"rankNum":0,"title":"四喜","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200tysb3yw","dataType":0,"mark":""},{"rankNum":0,"title":"他为什么依然单身","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200c1keuqc","dataType":0,"mark":""},{"rankNum":0,"title":"许我耀眼","hotLevel":78,"trend":0,"labelList":[],"id":"mzc00200f19q8q5","dataType":0,"mark":""},{"rankNum":0,"title":"超感迷宫","hotLevel":77,"trend":0,"labelList":[],"id":"mzc002003agt7k4","dataType":0,"mark":""},{"rankNum":0,"title":"庆余年第二季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc002002kqssyu","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXX> listInfo;

                @Data
                public static class ListInfoBeanXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 哑舍
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : mzc00200ilimmaa
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$3Bean implements Serializable {
                /**
                 * channelTitle : 动漫
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"剑来 第二季","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200xxpsogl","dataType":0,"mark":""},{"rankNum":0,"title":"仙逆","hotLevel":96,"trend":-1,"labelList":[],"id":"mzc00200aaogpgh","dataType":0,"mark":""},{"rankNum":0,"title":"剑来 第一季","hotLevel":90,"trend":1,"labelList":[],"id":"mzc0020072zgk61","dataType":0,"mark":""},{"rankNum":0,"title":"完美世界","hotLevel":87,"trend":-1,"labelList":[],"id":"mcv8hkc8zk8lnov","dataType":0,"mark":""},{"rankNum":0,"title":"斗破苍穹年番","hotLevel":86,"trend":-1,"labelList":[],"id":"mzc0020027yzd9e","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆","hotLevel":85,"trend":-1,"labelList":[],"id":"m441e3rjq9kwpsc","dataType":0,"mark":""},{"rankNum":0,"title":"神印王座","hotLevel":84,"trend":1,"labelList":[],"id":"mzc002007j7p5hn","dataType":0,"mark":""},{"rankNum":0,"title":"斗罗大陆Ⅱ绝世唐门","hotLevel":84,"trend":1,"labelList":[],"id":"mzc00200xf3rir6","dataType":0,"mark":""},{"rankNum":0,"title":"吞噬星空","hotLevel":84,"trend":-1,"labelList":[],"id":"324olz7ilvo2j5f","dataType":0,"mark":""},{"rankNum":0,"title":"遮天","hotLevel":82,"trend":-1,"labelList":[],"id":"mzc00200n53vkqc","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXX> listInfo;

                @Data
                public static class ListInfoBeanXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 剑来 第二季
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : mzc00200xxpsogl
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$5Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":1,"title":"陈晓","hotLevel":100,"trend":1,"labelList":[],"id":"w3165r4nupb","dataType":0,"mark":""},{"rankNum":2,"title":"肖战","hotLevel":90,"trend":1,"labelList":[],"id":"h33418xibnc","dataType":0,"mark":""},{"rankNum":3,"title":"梦华录","hotLevel":88,"trend":1,"labelList":[],"id":"a33418iq868","dataType":0,"mark":""},{"rankNum":4,"title":"梦华录花絮","hotLevel":84,"trend":0,"labelList":[],"id":"c3332k7ssos","dataType":0,"mark":""},{"rankNum":5,"title":"刘畊宏健身操","hotLevel":83,"trend":0,"labelList":[],"id":"x3335o7h0nu","dataType":0,"mark":""},{"rankNum":6,"title":"梦中的那片海电视剧","hotLevel":83,"trend":1,"labelList":[],"id":"l3342w9c4l5","dataType":0,"mark":""},{"rankNum":7,"title":"乘风破浪的姐姐第3季","hotLevel":83,"trend":1,"labelList":[],"id":"a3339821g39","dataType":0,"mark":""},{"rankNum":8,"title":"杨紫","hotLevel":82,"trend":1,"labelList":[],"id":"h3341ugg598","dataType":0,"mark":""},{"rankNum":9,"title":"梦华录全员直播全程回顾","hotLevel":82,"trend":1,"labelList":[],"id":"t3251yh3mcn","dataType":0,"mark":""},{"rankNum":10,"title":"林深见鹿","hotLevel":82,"trend":1,"labelList":[],"id":"p3341efvrsk","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXX implements Serializable {
                    /**
                     * rankNum : 1
                     * title : 陈晓
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : w3165r4nupb
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$6Bean implements Serializable {
                /**
                 * channelTitle : 游戏
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"蛋仔逃出惊魂夜","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc003s0okg2eqs","dataType":0,"mark":""},{"rankNum":0,"title":"蛋仔派对 小浪爆笑剧场2","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc0034synftdhj","dataType":0,"mark":""},{"rankNum":0,"title":"狒狒玩游戏","hotLevel":95,"trend":-100,"labelList":[],"id":"mzc003fc3jrwlsl","dataType":0,"mark":""},{"rankNum":0,"title":"惊魂寻宝队","hotLevel":91,"trend":-100,"labelList":[],"id":"mzc0039x0kcgot0","dataType":0,"mark":""},{"rankNum":0,"title":"鲤鱼Ace游玩VR游戏","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003k9rckw1fq","dataType":0,"mark":""},{"rankNum":0,"title":"南瓜入侵·兔仙的奇妙冒险","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc003toz80x856","dataType":0,"mark":""},{"rankNum":0,"title":"我的26岁女房客：在云端·视觉小说版","hotLevel":87,"trend":-100,"labelList":[],"id":"mzc00200qndx4nx","dataType":0,"mark":""},{"rankNum":0,"title":"【来米解说】我的世界生存闯关","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003vyjpx9g17","dataType":0,"mark":""},{"rankNum":0,"title":"吊德斯解说","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0039vcei1fey","dataType":0,"mark":""},{"rankNum":0,"title":"小米蕉我的世界游戏解说第一季","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc003nklxthar7","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 蛋仔逃出惊魂夜
                     * hotLevel : 100
                     * trend : -100
                     * labelList : []
                     * id : mzc003s0okg2eqs
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$9Bean implements Serializable {
                /**
                 * channelTitle : 纪录片
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"探索新境 第2季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc0020040sajz8","dataType":0,"mark":""},{"rankNum":0,"title":"《不止于她》第三季","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200d7r2ic7","dataType":0,"mark":""},{"rankNum":0,"title":"动物王国[普通话版]","hotLevel":82,"trend":0,"labelList":[],"id":"mzc002005su9lln","dataType":0,"mark":""},{"rankNum":0,"title":"见非凡·十三邀团队特别制作","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200b2rgvmo","dataType":0,"mark":""},{"rankNum":0,"title":"探索新境·寻找王一博","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009zwrmx4","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第八季","hotLevel":79,"trend":-1,"labelList":[],"id":"mzc00200382r10m","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第九季","hotLevel":78,"trend":0,"labelList":[],"id":"mzc002002eqyhs7","dataType":0,"mark":""},{"rankNum":0,"title":"十三邀 第一季","hotLevel":77,"trend":0,"labelList":[],"id":"4oocb872jxju3c6","dataType":0,"mark":""},{"rankNum":0,"title":"新境日记 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200dawr35p","dataType":0,"mark":""},{"rankNum":0,"title":"寻找731","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200qkycu08","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 探索新境 第2季
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : mzc0020040sajz8
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$10Bean implements Serializable {
                /**
                 * channelTitle : 综艺
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"现在就出发 第3季","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200znyfa5u","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜 第2季","hotLevel":86,"trend":0,"labelList":[],"id":"mzc002004l7dytn","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发 第2季","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200y41tzil","dataType":0,"mark":""},{"rankNum":0,"title":"2025腾讯视频星光大赏","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc002002h77uy8","dataType":0,"mark":""},{"rankNum":0,"title":"现在就出发","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200ap8s2p3","dataType":0,"mark":""},{"rankNum":0,"title":"奔跑吧·天路篇","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc00200gvy0g5b","dataType":0,"mark":""},{"rankNum":0,"title":"喜人奇妙夜","hotLevel":79,"trend":0,"labelList":[],"id":"mzc00200vyot3cs","dataType":0,"mark":""},{"rankNum":0,"title":"开始推理吧 第3季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc002008rxvoxh","dataType":0,"mark":""},{"rankNum":0,"title":"哈哈哈哈哈 第5季","hotLevel":79,"trend":1,"labelList":[],"id":"mzc00200tx4v83g","dataType":0,"mark":""},{"rankNum":0,"title":"有秘密的我们 第2季","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200ue6yh8n","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 现在就出发 第3季
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : mzc00200znyfa5u
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$22Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"硬糖少女303\u201c别怕，未来会来\u201d演唱会暨告别典礼","hotLevel":100,"trend":1,"labelList":[],"id":"mzc00200qesgi36","dataType":0,"mark":""},{"rankNum":0,"title":"2022周震南You jump ，I jump首唱会","hotLevel":97,"trend":1,"labelList":[],"id":"mzc002001dvhbqx","dataType":0,"mark":""},{"rankNum":3,"title":"INTO1天生就要飞","hotLevel":95,"trend":1,"labelList":[],"id":"m0043sagsp6","dataType":0,"mark":""},{"rankNum":4,"title":"周杰伦新歌","hotLevel":93,"trend":1,"labelList":[],"id":"i0043gp575k","dataType":0,"mark":""},{"rankNum":0,"title":"北舞·云毕业季：节目精选","hotLevel":91,"trend":1,"labelList":[],"id":"mzc00385jqyufhc","dataType":0,"mark":""},{"rankNum":0,"title":"「微光现场」廖俊涛专场音乐会","hotLevel":89,"trend":1,"labelList":[],"id":"mzc0036w4aetz7m","dataType":0,"mark":""},{"rankNum":7,"title":"田馥甄一周的朋友MV","hotLevel":87,"trend":1,"labelList":[],"id":"r3342pondpt","dataType":0,"mark":""},{"rankNum":8,"title":"孤勇者","hotLevel":85,"trend":1,"labelList":[],"id":"y0041ywgpm7","dataType":0,"mark":""},{"rankNum":0,"title":"张杰未LIVE演唱会","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200jojec27","dataType":0,"mark":""},{"rankNum":0,"title":"云首发Livehouse白景屹专场","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200r2hu9km","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 硬糖少女303“别怕，未来会来”演唱会暨告别典礼
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : mzc00200qesgi36
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$24Bean implements Serializable {
                /**
                 * channelTitle : 科技
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"华为Mate品牌盛典","hotLevel":100,"trend":-100,"labelList":[],"id":"mzc00200rekxvc4","dataType":0,"mark":""},{"rankNum":2,"title":"新骁龙来了","hotLevel":97,"trend":-100,"labelList":[],"id":"s4100lj6foi","dataType":0,"mark":""},{"rankNum":3,"title":"原生鸿蒙之夜","hotLevel":94,"trend":-100,"labelList":[],"id":"t35675hcaek","dataType":0,"mark":""},{"rankNum":4,"title":"双十一买什么笔记本？","hotLevel":91,"trend":-100,"labelList":[],"id":"k3567x2te1b","dataType":0,"mark":""},{"rankNum":0,"title":"华为见非凡品牌盛典 ","hotLevel":88,"trend":-100,"labelList":[],"id":"mzc00200o59rufl","dataType":0,"mark":""},{"rankNum":0,"title":"大咖会客室《BOSS，你好》","hotLevel":86,"trend":-100,"labelList":[],"id":"mzc0033uz51d4h7","dataType":0,"mark":""},{"rankNum":0,"title":"耀启新境","hotLevel":83,"trend":-100,"labelList":[],"id":"mzc00200qtrrenv","dataType":0,"mark":""},{"rankNum":8,"title":"华为HarmonyOS NEXT","hotLevel":80,"trend":-100,"labelList":[],"id":"k142071fjvf","dataType":0,"mark":""},{"rankNum":9,"title":"小米澎湃OS新版体验","hotLevel":77,"trend":-100,"labelList":[],"id":"j14201m05or","dataType":0,"mark":""},{"rankNum":0,"title":"2024腾讯科学WE大会","hotLevel":-1136,"trend":-100,"labelList":[],"id":"mzc00200wlndy93","dataType":0,"mark":""}]
                 * hasNextPage : false
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 华为Mate品牌盛典
                     * hotLevel : 100
                     * trend : -100
                     * labelList : []
                     * id : mzc00200rekxvc4
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$26Bean implements Serializable {
                /**
                 * channelTitle : 微短剧
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"君不知","hotLevel":80,"trend":1,"labelList":[],"id":"mzc00200eoiafre","dataType":0,"mark":""},{"rankNum":0,"title":"唐朝异闻录","hotLevel":78,"trend":1,"labelList":[],"id":"mzc00200kusah9g","dataType":0,"mark":""},{"rankNum":0,"title":"掌命","hotLevel":78,"trend":-1,"labelList":[],"id":"mzc00200dns72ox","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":1,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"鲁班异闻录","hotLevel":77,"trend":0,"labelList":[],"id":"mzc00200vjti6na","dataType":0,"mark":""},{"rankNum":0,"title":"云天之上","hotLevel":77,"trend":1,"labelList":[],"id":"mzc00200so3dbe3","dataType":0,"mark":""},{"rankNum":0,"title":"以下犯上","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00200sdgiahh","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":-1,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 方夏
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : mzc003wlzx92z33
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$106Bean implements Serializable {
                /**
                 * channelTitle : 少儿
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"小猪佩奇 第11季[普通话版]","hotLevel":100,"trend":0,"labelList":[],"id":"mzc00200qrzj493","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队之小砾与工程家族 第2季[普通话版]","hotLevel":92,"trend":0,"labelList":[],"id":"mzc002008hsiaqc","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第三季","hotLevel":89,"trend":0,"labelList":[],"id":"mzc00200ifxpsvp","dataType":0,"mark":""},{"rankNum":0,"title":"熊出没之神奇宝物","hotLevel":85,"trend":0,"labelList":[],"id":"mzc00200pedgbii","dataType":0,"mark":""},{"rankNum":0,"title":"宝宝巴士儿歌 3D版","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200cvmw4ea","dataType":0,"mark":""},{"rankNum":0,"title":"汪汪队立大功第九季[普通话版]","hotLevel":83,"trend":0,"labelList":[],"id":"mzc00200rvct2nk","dataType":0,"mark":""},{"rankNum":0,"title":"精灵梦叶罗丽 第十一季（上）","hotLevel":82,"trend":1,"labelList":[],"id":"mzc00200l52xgxa","dataType":0,"mark":""},{"rankNum":0,"title":"宝贝赳赳 第五季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200xft9wec","dataType":0,"mark":""},{"rankNum":0,"title":"萌鸡小队第六季","hotLevel":81,"trend":-1,"labelList":[],"id":"mzc00200p1yh8xu","dataType":0,"mark":""},{"rankNum":0,"title":"依娜和恰恰 第2季","hotLevel":80,"trend":-1,"labelList":[],"id":"mzc002009aj2jhv","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 小猪佩奇 第11季[普通话版]
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : mzc00200qrzj493
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$556Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":1,"title":"林正英","hotLevel":100,"trend":1,"labelList":[],"id":"9000073139","dataType":0,"mark":""},{"rankNum":2,"title":"易烊千玺","hotLevel":87,"trend":1,"labelList":[],"id":"9000030290","dataType":0,"mark":""},{"rankNum":3,"title":"张若昀","hotLevel":86,"trend":1,"labelList":[],"id":"9000067617","dataType":0,"mark":""},{"rankNum":4,"title":"朱亚文","hotLevel":84,"trend":1,"labelList":[],"id":"9000069245","dataType":0,"mark":""},{"rankNum":5,"title":"成龙","hotLevel":84,"trend":1,"labelList":[],"id":"9000066479","dataType":0,"mark":""},{"rankNum":6,"title":"黄子韬","hotLevel":84,"trend":1,"labelList":[],"id":"9000069286","dataType":0,"mark":""},{"rankNum":7,"title":"郑业成","hotLevel":83,"trend":1,"labelList":[],"id":"9000071910","dataType":0,"mark":""},{"rankNum":8,"title":"彭禺厶","hotLevel":82,"trend":0,"labelList":[],"id":"9000093813","dataType":0,"mark":""},{"rankNum":9,"title":"袁冰妍","hotLevel":82,"trend":1,"labelList":[],"id":"9000007216","dataType":0,"mark":""},{"rankNum":10,"title":"欧豪","hotLevel":81,"trend":1,"labelList":[],"id":"9000037611","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 1
                     * title : 林正英
                     * hotLevel : 100
                     * trend : 1
                     * labelList : []
                     * id : 9000073139
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$5001Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":1,"title":"梦华录","hotLevel":100,"trend":0,"labelList":[],"id":"梦华录","dataType":0,"mark":""},{"rankNum":2,"title":"奔跑吧 第6季","hotLevel":88,"trend":0,"labelList":[],"id":"奔跑吧 第6季","dataType":0,"mark":""},{"rankNum":3,"title":"斗罗大陆","hotLevel":83,"trend":0,"labelList":[],"id":"斗罗大陆","dataType":0,"mark":""},{"rankNum":4,"title":"战至巅峰","hotLevel":82,"trend":0,"labelList":[],"id":"战至巅峰","dataType":0,"mark":""},{"rankNum":5,"title":"回廊亭","hotLevel":81,"trend":1,"labelList":[],"id":"回廊亭","dataType":0,"mark":""},{"rankNum":6,"title":"闪亮的日子","hotLevel":79,"trend":1,"labelList":[],"id":"闪亮的日子","dataType":0,"mark":""},{"rankNum":7,"title":"王牌对王牌","hotLevel":78,"trend":-1,"labelList":[],"id":"王牌对王牌","dataType":0,"mark":""},{"rankNum":8,"title":"陈晓","hotLevel":78,"trend":1,"labelList":[],"id":"陈晓","dataType":0,"mark":""},{"rankNum":9,"title":"回廊亭邓家佳","hotLevel":78,"trend":1,"labelList":[],"id":"回廊亭邓家佳","dataType":0,"mark":""},{"rankNum":10,"title":"且试天下","hotLevel":78,"trend":1,"labelList":[],"id":"且试天下","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 1
                     * title : 梦华录
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : 梦华录
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$10001Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":1,"title":"2022鹅厂大剧片单","hotLevel":100,"trend":0,"labelList":[],"id":"2022鹅厂大剧片单","dataType":0,"mark":""},{"rankNum":2,"title":"小学生为躲避考试报警谎称被跟踪","hotLevel":99,"trend":1,"labelList":[],"id":"小学生为躲避考试报警谎称被跟踪","dataType":0,"mark":""},{"rankNum":3,"title":"北京今日新增本土感染者5例","hotLevel":89,"trend":1,"labelList":[],"id":"北京今日新增本土感染者5例","dataType":0,"mark":""},{"rankNum":4,"title":"阿里女员工案嫌犯被判一年半","hotLevel":89,"trend":1,"labelList":[],"id":"阿里女员工案嫌犯被判一年半","dataType":0,"mark":""},{"rankNum":5,"title":"猴痘病例已输入亚洲","hotLevel":89,"trend":1,"labelList":[],"id":"猴痘病例已输入亚洲","dataType":0,"mark":""},{"rankNum":6,"title":"香港警察训练中式步操","hotLevel":87,"trend":-1,"labelList":[],"id":"香港警察训练中式步操","dataType":0,"mark":""},{"rankNum":7,"title":"我养你啊","hotLevel":87,"trend":1,"labelList":[],"id":"我养你啊","dataType":0,"mark":""},{"rankNum":8,"title":"福建辟谣高考数学平均分37.8分","hotLevel":87,"trend":-1,"labelList":[],"id":"福建辟谣高考数学平均分37.8分","dataType":0,"mark":""},{"rankNum":9,"title":"唐山民警虚报出警时间需要给一个交代","hotLevel":83,"trend":1,"labelList":[],"id":"唐山民警虚报出警时间需要给一个交代","dataType":0,"mark":""},{"rankNum":10,"title":"武大毕业生自制繁花学士帽","hotLevel":79,"trend":1,"labelList":[],"id":"武大毕业生自制繁花学士帽","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 1
                     * title : 2022鹅厂大剧片单
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : 2022鹅厂大剧片单
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$10002Bean implements Serializable {
                /**
                 * channelTitle :
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":1,"title":"冰墩墩下班了","hotLevel":100,"trend":0,"labelList":[],"id":"冰墩墩下班了","dataType":0,"mark":""},{"rankNum":2,"title":"高亭宇扛着徐梦桃","hotLevel":97,"trend":0,"labelList":[],"id":"高亭宇扛着徐梦桃","dataType":0,"mark":""},{"rankNum":3,"title":"李玉刚羽生结弦","hotLevel":95,"trend":0,"labelList":[],"id":"李玉刚羽生结弦","dataType":0,"mark":""},{"rankNum":4,"title":"义墩墩告别","hotLevel":93,"trend":0,"labelList":[],"id":"义墩墩告别","dataType":0,"mark":""},{"rankNum":5,"title":"北京冬奥会闭幕式","hotLevel":91,"trend":0,"labelList":[],"id":"北京冬奥会闭幕式","dataType":0,"mark":""},{"rankNum":6,"title":"意大利8分钟","hotLevel":89,"trend":0,"labelList":[],"id":"意大利8分钟","dataType":0,"mark":""},{"rankNum":7,"title":"谷爱凌苏翊鸣像在蹦迪","hotLevel":87,"trend":0,"labelList":[],"id":"谷爱凌苏翊鸣像在蹦迪","dataType":0,"mark":""},{"rankNum":8,"title":"折柳寄情太浪漫了","hotLevel":85,"trend":0,"labelList":[],"id":"折柳寄情太浪漫了","dataType":0,"mark":""},{"rankNum":9,"title":"中国9金超燃混剪","hotLevel":82,"trend":0,"labelList":[],"id":"中国9金超燃混剪","dataType":0,"mark":""},{"rankNum":10,"title":"羽生结弦亲吻冰面","hotLevel":80,"trend":0,"labelList":[],"id":"羽生结弦亲吻冰面","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 1
                     * title : 冰墩墩下班了
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : 冰墩墩下班了
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }

            @Data
            public static class _$10005Bean implements Serializable {
                /**
                 * channelTitle : 竖屏短剧
                 * areaTitle :
                 * modifyTime :
                 * listInfo : [{"rankNum":0,"title":"方夏","hotLevel":100,"trend":0,"labelList":[],"id":"mzc003wlzx92z33","dataType":0,"mark":""},{"rankNum":0,"title":"裂焰","hotLevel":77,"trend":0,"labelList":[],"id":"mzc003vp6njqwtn","dataType":0,"mark":""},{"rankNum":0,"title":"君临裙下","hotLevel":76,"trend":0,"labelList":[],"id":"mzc00363jqeaznw","dataType":0,"mark":""},{"rankNum":0,"title":"家里家外","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0033lcl993ul","dataType":0,"mark":""},{"rankNum":0,"title":"爸妈跑路，福宝带债主发财了","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003gak8k5fhc","dataType":0,"mark":""},{"rankNum":0,"title":"战恋告捷","hotLevel":76,"trend":0,"labelList":[],"id":"mzc0034uo44lz1s","dataType":0,"mark":""},{"rankNum":0,"title":"她比枪火炽热","hotLevel":76,"trend":0,"labelList":[],"id":"mzc003r8lgcno7q","dataType":0,"mark":""},{"rankNum":0,"title":"善男信女","hotLevel":75,"trend":0,"labelList":[],"id":"mzc0037149917ud","dataType":0,"mark":""},{"rankNum":0,"title":"情靡","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003b1wpxvt41","dataType":0,"mark":""},{"rankNum":0,"title":"美人替身","hotLevel":75,"trend":0,"labelList":[],"id":"mzc003vedv3ipg5","dataType":0,"mark":""}]
                 * hasNextPage : true
                 */

                private String channelTitle;
                private String areaTitle;
                private String modifyTime;
                private boolean hasNextPage;
                private List<ListInfoBeanXXXXXXXXXXXXXXXX> listInfo;

                @Data
                public static class ListInfoBeanXXXXXXXXXXXXXXXX implements Serializable {
                    /**
                     * rankNum : 0
                     * title : 方夏
                     * hotLevel : 100
                     * trend : 0
                     * labelList : []
                     * id : mzc003wlzx92z33
                     * dataType : 0
                     * mark :
                     */

                    private int rankNum;
                    private String title;
                    private int hotLevel;
                    private int trend;
                    private String id;
                    private int dataType;
                    private String mark;
                    private List<?> labelList;
                }
            }
        }
    }

    @Data
    public static class BusinessHeadBean implements Serializable {
        /**
         * type : 0
         * body :
         */

        private int type;
        private String body;
    }
}
