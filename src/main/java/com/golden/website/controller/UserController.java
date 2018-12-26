package com.golden.website.controller;

import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
//    @RequestMapping("home")
//    public String home(Model model){
//        userService.getUser();
//        model.addAttribute("name","liufulong");
//        return "home";
//    }
//    @RequestMapping("product")
//    public String product(Model model){
//        userService.getUser();
//        model.addAttribute("title","庚云实时数据库管理系统");
//        model.addAttribute("html","<div class=\"contents\">\n" +
//                "\t\t        \t<div class=\"wrap\"><p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统是庚顿公司推出的具有自主知识产权的工业基础软件产品。用于采集、存储、分析机器设备产生的海量实时/历史传感数据。特别适用于工业自动化、生产管理、节能环保、智能制造、智慧城市、智慧医疗等领域。</span></font></p>\n" +
//                "<p>&nbsp;</p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统支持多种工业及物联网通信协议，可采集现场传感数据并做分析处理。支持C++、java、.net等二次开发接口，可将数据提供给上层应用系统，并能与Hadoop、Spark等主流的大数据平台有机融合。</span></font></p>\n" +
//                "<p>&nbsp;</p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统作为庚顿公司旗舰版实时数据库，通用性和易用性极高，数据库管理人员可快速掌握。用户可方便地基于实时数据库构建各类应用系统，包括：&nbsp; &nbsp;</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\"><br>\n" +
//                "</span></font><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（1）海量实时/历史数据中心</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（2）发电厂厂级监控信息系统（SIS）</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（3）流程企业制造执行系统（MES）</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（4）企业能源管理系统（EMS）</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（5）数据采集与监视控制系统（SCADA）</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（6）生产过程监控系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（7）生产调度系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（8）水利、环境、油井、煤矿、城市管网、通信基站等远程监控系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（9）城市轨道交通综合监控系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（10）电动汽车远程服务与管理系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（11）智慧城市集中监控系统</span></font></p>\n" +
//                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（12）传感器数据采集与交换系统</span></font></p>\n" +
//                "<div><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\"><br>\n" +
//                "</span></font></div> </div>\n" +
//                "\t\t      \t</div>");
//        return "product";
//    }
    @RequestMapping("golden_cloud")
    public String golden_cloud(Model model){
        userService.getUser();
        model.addAttribute("title","庚云实时数据库管理系统");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统是庚顿公司推出的具有自主知识产权的工业基础软件产品。用于采集、存储、分析机器设备产生的海量实时/历史传感数据。特别适用于工业自动化、生产管理、节能环保、智能制造、智慧城市、智慧医疗等领域。</span></font></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统支持多种工业及物联网通信协议，可采集现场传感数据并做分析处理。支持C++、java、.net等二次开发接口，可将数据提供给上层应用系统，并能与Hadoop、Spark等主流的大数据平台有机融合。</span></font></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">庚云实时数据库管理系统作为庚顿公司旗舰版实时数据库，通用性和易用性极高，数据库管理人员可快速掌握。用户可方便地基于实时数据库构建各类应用系统，包括：&nbsp; &nbsp;</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\"><br>\n" +
                "</span></font><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（1）海量实时/历史数据中心</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（2）发电厂厂级监控信息系统（SIS）</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（3）流程企业制造执行系统（MES）</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（4）企业能源管理系统（EMS）</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（5）数据采集与监视控制系统（SCADA）</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（6）生产过程监控系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（7）生产调度系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（8）水利、环境、油井、煤矿、城市管网、通信基站等远程监控系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（9）城市轨道交通综合监控系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（10）电动汽车远程服务与管理系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（11）智慧城市集中监控系统</span></font></p>\n" +
                "<p><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\">（12）传感器数据采集与交换系统</span></font></p>\n" +
                "<div><font color=\"#808080\" face=\"微软雅黑, sans-serif\"><span style=\"font-size: 13.3333px;\"><br>\n" +
                "</span></font></div> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
    @RequestMapping("golden_star")
    public String golden_star(Model model){
        userService.getUser();
        model.addAttribute("title","庚星时序数据库管理系统");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp; 庚顿公司聚十年实时数据库研发之核心技术，专为物联网、边缘计算打造庚星时序数据库管理系统。支持中国制造2025，普惠中小企业直通工业4.0！</p>\n" +
                "<p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp; 庚星时序数据库是专门用于存储和处理机器设备产生的传感数据，特别适用于物联网设备监控、企业能源管理、生产安全监控、电力监控等行业场景。时序数据库可帮助企业洞察全局数据趋势，实时发现数据异常，降低生产风险，控制成本提升产能和效益。</p>\n" +
                "<p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp;本产品为特价促销商品。可零售，可批量采购，批量采购按不同规格数量享受不同等级折扣，欢迎垂询！</p>\n" +
                "<p style=\"text-align: center\">&nbsp;<img alt=\"\" width=\"750\" height=\"1765\" src=\"http://52.83.234.27:80/gd/upload/fck/image/d0a331f702c544b4bb5220a01aa35372.png\"></p> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
    @RequestMapping("golden_configuration")
    public String golden_configuration(Model model){
        userService.getUser();
        model.addAttribute("title","庚顿通用监控组态平台");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><p><span style=\"font-size: medium\"><span style=\"font-family: 微软雅黑\">新一代</span><span style=\"font-family: 微软雅黑\">HMI/SCADA</span><span style=\"font-family: 微软雅黑\">与数据分析可视化平台</span></span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><span style=\"font-size: larger\"><span style=\"font-family: 微软雅黑\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span style=\"font-size: smaller\"><span style=\"font-family: 微软雅黑\">专为数据工业时代打造，一款包括来自传感器、设备、基于云服务的源数据和开放的通信框架，是庚顿力推的新型软件操作平台，人们可借助于它加载新应用，从而对现有的工业机器做数据分析、预测、诊断并提高使用效率。<br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp; 通过软件分析传感器采集的数据，最终实现机器与机器、机器与人的连接。实现远程监控、诊断、智能运行设备。<br>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp; 平台特点是预建立基础平台，采用模块化架构，流程和工具通用性强，便于第三方扩展，工程人员可快速创建新应用。</span></span></span><span style=\"font-size: medium\"><span style=\"font-family: 微软雅黑\"><br>\n" +
                "</span></span></p>\n" +
                "<p style=\"text-align: center\"><span style=\"font-size: medium\">&nbsp;<img alt=\"\" width=\"558\" height=\"320\" src=\"http://52.83.234.27:80/gd/upload/fck/image/57769f3081c44e4db04d9099c2dbef66.png\"></span></p>\n" +
                "<p style=\"text-align: center\">&nbsp;</p>\n" +
                "<p><span style=\"font-size: 20pt; font-family: 微软雅黑\"><img alt=\"\" width=\"817\" height=\"432\" src=\"http://52.83.234.27:80/gd/upload/fck/image/b64570558bd9454191cbc7fae68f87e1.png\"></span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img alt=\"\" width=\"817\" height=\"319\" src=\"http://52.83.234.27:80/gd/upload/fck/image/04eeba2d7014412b995ee70f9e163e98.png\"></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img alt=\"\" width=\"817\" height=\"325\" src=\"http://52.83.234.27:80/gd/upload/fck/image/8cebf49e784e4a3bbd54306ac053ea04.png\"></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img alt=\"\" width=\"817\" height=\"383\" src=\"http://52.83.234.27:80/gd/upload/fck/image/a34389872df648eda28eb9d021982cb3.png\"></p>\n" +
                "<p>&nbsp;</p> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
    @RequestMapping("golden_visualization")
    public String golden_visualization(Model model){
        userService.getUser();
        model.addAttribute("title","庚顿可视化产品系列");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><p>&nbsp;<span style=\"font-size: 20pt; font-family: 微软雅黑;\">趋势与分析系统</span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p style=\"language:zh-CN;margin-top:0pt;margin-bottom:0pt;text-align:left;\n" +
                "direction:ltr;unicode-bidi:embed;vertical-align:baseline;mso-line-break-override:\n" +
                "none;punctuation-wrap:hanging\">&nbsp;<span style=\"font-size: medium;\"><span style=\"font-family: 微软雅黑;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿趋势与分析系统包含了成组监控，历史趋势查询，选定时间段内的极值查询及实时趋势显示等功能，根据各专业人员所关心的数据进行编组和呈现，可以根据业务需要灵活调整趋势参数。为实现数据趋势查询和分析提供了有力的软件层面支撑。</span></span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img src=\"http://52.83.234.27:80/gd/upload/fck/image/b007ebf7adc3499da8eefe569007af84.png\" alt=\"\" width=\"672\" height=\"447\"></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&nbsp;<span style=\"font-size: 20pt; font-family: 微软雅黑;\">报警与事件系统</span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p style=\"language:zh-CN;margin-top:0pt;margin-bottom:0pt;text-align:left;\n" +
                "direction:ltr;unicode-bidi:embed;vertical-align:baseline;mso-line-break-override:\n" +
                "none;punctuation-wrap:hanging\">&nbsp;&nbsp;&nbsp;<span style=\"font-size: medium;\"><span style=\"font-family: 微软雅黑;\">&nbsp;&nbsp; &nbsp; &nbsp; 对过程</span><span style=\"font-family: 微软雅黑;\">/</span><span style=\"font-family: 微软雅黑;\">流程中的重要事件进行管理，可实现阈值报警、状态变化报警，可设置报警延时和阈值死区。支持实时报警管理、历史报警查询与报警统计。支持多级别管理，支持语音、弹窗提示。支持移动端订阅。</span></span>&nbsp;</p>\n" +
                "<p style=\"language:zh-CN;margin-top:0pt;margin-bottom:0pt;text-align:left;\n" +
                "direction:ltr;unicode-bidi:embed;vertical-align:baseline;mso-line-break-override:\n" +
                "none;punctuation-wrap:hanging\">&nbsp;</p>\n" +
                "<p style=\"language:zh-CN;margin-top:0pt;margin-bottom:0pt;text-align:left;\n" +
                "direction:ltr;unicode-bidi:embed;vertical-align:baseline;mso-line-break-override:\n" +
                "none;punctuation-wrap:hanging\"><span style=\"font-size: 20pt; font-family: 微软雅黑;\"><img src=\"http://52.83.234.27:80/gd/upload/fck/image/34f356fa69de44719349f5d1ad5d1390.jpg\" alt=\"\" width=\"817\" height=\"548\"></span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&nbsp;<span style=\"font-size: 20pt; font-family: 微软雅黑;\">场站集中监控系统</span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p style=\"language:zh-CN;margin-top:0pt;margin-bottom:0pt;text-align:left;\n" +
                "direction:ltr;unicode-bidi:embed;vertical-align:baseline;mso-line-break-override:\n" +
                "none;punctuation-wrap:hanging\">&nbsp;<span style=\"font-size: medium;\"><span style=\"font-family: 微软雅黑;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿场站集中监控系统（</span><span style=\"font-family: 微软雅黑;\">SCADA</span><span style=\"font-family: 微软雅黑;\">）拥有极其出色的可视化效果和操控性能，可依托庚顿监控组态平台快速构建和发布，同时支持</span><span style=\"font-family: 微软雅黑;\">C/S</span><span style=\"font-family: 微软雅黑;\">和</span><span style=\"font-family: 微软雅黑;\">B/S</span><span style=\"font-family: 微软雅黑;\">架构部署。产品依托</span><span style=\"font-family: 微软雅黑;\">HTML5</span><span style=\"font-family: 微软雅黑;\">前沿技术框架，可完美实现三屏融合，支持任意内核的浏览器。</span></span></p>\n" +
                "<p>&nbsp; <img src=\"http://52.83.234.27:80/gd/upload/fck/image/f2dbefc151964cf6b80749cce367e81d.jpg\" alt=\"\" width=\"817\" height=\"460\"></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img src=\"http://52.83.234.27:80/gd/upload/fck/image/db17d9f80ca2457ca79638027071f24e.png\" alt=\"\" width=\"817\" height=\"355\"></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><img src=\"http://52.83.234.27:80/gd/upload/fck/image/c3c7c509d21b42b1920bf17c64a29884.jpg\" alt=\"\" width=\"817\" height=\"460\"></p>\n" +
                "<p>&nbsp;</p> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
    @RequestMapping("golden_collection")
    public String golden_collection(Model model){
        userService.getUser();
        model.addAttribute("title","庚顿数据采集适配器");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><div><span style=\"color: #808080\">&nbsp;</span></div>\n" +
                "<div><span style=\"color: #808080\"><span style=\"background: white\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 为机器数据量身定制，数据采集适配器作为庚云工业大数据平台数据处理层的前端采集系统，主要负责数据采集并将采集的数据存储到实时数据库。支持分布式部署及单机部署。它能够将工业中常见的各种协议格式或自定义格式的数据输入到主流实时数据库中。支持OPC协议、电力IEC103\\104规约、控制器Modbus协议、各种PLC设备，以及可自定义格式的文件采集器，支持常见关系型数据库的采集器等。</span></span></div>\n" +
                "<p><span style=\"color: #808080\">&nbsp;</span></p> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
    @RequestMapping("golden_export")
    public String golden_export(Model model){
        userService.getUser();
        model.addAttribute("title","庚顿数据输出适配器");
        model.addAttribute("html","<div class=\"contents\">\n" +
                "\t\t        \t<div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿数据输出适配器提供将实时数据库中采集到的数据以窄表、宽表模式实时输出到后端的各种管理及分析平台，为企业进行及时决策，快速管理，为数据的充分挖掘分析提供关键性支撑。庚顿数据输出适配器是一个开放的，具有高度可扩展、可配置式的插件管理系统。对应当前主流的数据管理和分析平台，输出适配器目前可以将数据灵活输出到Hadoop大数据平台以及Oracle、MySql、SqlServer等关系数据库中。</p> </div>\n" +
                "\t\t      \t</div>");
        return "product";
    }
//    @RequestMapping("customer")
//    public String customer(Model model,String productName ){
//        System.out.println("sss  "+productName);
//        model.addAttribute("title","能效管控一体化平台");
//        model.addAttribute("html","<div class=\"contents\">\n" +
//                "\t\t\t\t    <div class=\"wrap\"><p style=\"text-indent: 32px; \">能效管控一体化平台是一个以能源管理为中心的信息系统管理平台，从设计的角度使用不同的视图对系统进行综合的描述，包括数据采集、综合监控、与信息系统交换、节能调度管理支持、基础能源管理、重点能耗设备管理、能源信息发布、系统配置及权限管理等部分。系统可采集DCS/PLC中的生产数据及计量数据，提供对生产运行数据的在线查询功能，实现能源管理及全厂能源信息的充分共享；这套完整安全可靠的实时能源数据管理系统能够提高生产过程运行的质量和效率，节能降耗，增加企业的经济效益。</p>\n" +
//                "<p style=\"text-indent: 32px; \">&nbsp;</p>\n" +
//                "<p><span style=\"text-indent: 24pt; font-size: 12pt; font-family: 宋体;\"><img src=\"http://52.83.234.27:80/gd/upload/fck/image/4c67f635ca4a4e739370e6b320975ef9.png\" width=\"558\" height=\"333\" alt=\"\"></span></p>\n" +
//                "<p>&nbsp;</p>\n" +
//                "<p><span style=\"text-indent: 24pt; font-size: 12pt; font-family: 宋体;\"><img src=\"http://52.83.234.27:80/gd/upload/fck/image/eb9319a184244cb9a98c588f13426ba8.png\" width=\"558\" height=\"345\" alt=\"\"></span></p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">重点用户：顺成集团</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">项目名称：河南省顺成集团能源管理中心实时生产能源管理信息系统</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">案例简介：</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp; &nbsp; &nbsp; &nbsp;能源管理中心系统搭建在集团办公大楼，与ERP、OA等现有信息系统对接并实现数据共享。集团各分厂、车间或主要设备对于已有DCS或PLC已经采集的能源数据通过与DCS系统接口方式实现，同时对于不具备自动采集条件的重点监测点通过人工录入方式上送到中心，以满足集团能源集中管理的需要。</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp; &nbsp; &nbsp; &nbsp;系统具有实时数据采集、海量数据存储、历史数据追忆和数据分析的能力，系统不仅将分散在各生产现场的实时能源信息集成起来，并为管理者提供全面的实时监控能源信息的统一平台，通过对数据的再次加工处理，提炼出真正对生产管理、经营决策有用的数据，从而在产生经营管理和实时过程控制之间架起一座桥梁，达到两者之间的信息交换和紧密集成。</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp; &nbsp; &nbsp; &nbsp;系统以庚顿实时数据库管理系统和能效管控平台为基础建设，可采集DCS/PLC中的生产数据和计量数据，具备对生产运行数据的在线查询能力，实现全厂能源信息的充分共享；是一套完整的、安全可靠的实时能源数据管理系统，提高生产过程运行质量和效率，节能降耗，增加企业的经济效益。</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\"><img src=\"http://52.83.234.27:80/gd/upload/fck/image/6a68268e86ed436d94f868ac2f0db797.png\" width=\"817\" height=\"430\" alt=\"\"></p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\"><img src=\"http://52.83.234.27:80/gd/upload/fck/image/c102b2faa6e343c68730331f1a06a299.png\" width=\"817\" height=\"354\" alt=\"\"></p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\" style=\"text-indent: 21pt;\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" style=\"text-indent: 21pt;\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\" style=\"text-indent: 21pt;\">&nbsp;</p>\n" +
//                "<p class=\"MsoNormal\" align=\"left\" style=\"text-indent: 21pt;\">&nbsp;</p></div>\n" +
//                "\t\t\t  \t</div>");
//        return "customer";
//    }

    @RequestMapping("solution")
    public String solution(Model model){
        return "solution";
    }

    @RequestMapping("solutionDetails")
    public String solutionDetails(Model model,String hyly){
        System.out.println("hyly : "+hyly);
        switch (hyly){
            case "1" :
                model.addAttribute("title","风电集控");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p><span style=\"font-size: small\">\n" +
                        "</span></p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 大数据平台基于庚顿实时数据库、Hadoop，以及规范的数据共享技术构建。</p>\n" +
                        "<span style=\"font-size: 12pt\">\n" +
                        "<div style=\"text-align: left; text-indent: 21pt\" align=\"left\"><span style=\"font-size: 12pt\">&nbsp; 平台功能包括采集数据接收及传输、数据实时清洗、数据实时处理、实时数据告警、元数据管理、数据压缩存储、海量数据在线多维查询及导出、数据并行分析计算、数据挖掘、作业调度管理、并提供实时数据库接口、数据共享服务、平台维护管理功能。</span></div>\n" +
                        "</span><p></p>\n" +
                        "<p style=\"text-align: center\"><span style=\"font-size: small\"><img alt=\"\" width=\"588\" height=\"676\" src=\"http://www.golden-data.com.cn/upload/fck/image/71a4342f6f78432089d2d5f21e1cb6b2.png\"></span></p>\n" +
                        "<p><span style=\"font-size: small\">&nbsp;</span></p>\n" +
                        "<p><span style=\"font-size: small\">&nbsp;</span></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "2" :
                model.addAttribute("title","轨道交通");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p><span style=\"font-size: small\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;城市轨道交通综合监控系统，以实时监控为主要应用目的，实现电力调度、机电设备监控、车站运营状态监视等功能。在体系架构设计和接口方面主要侧重于实时设备监控和数据处理，实时数据及历史数据的管理。系统主要由中心服务器及车站端、车辆段端、停车场端服务器构成，以实时数据库和关系数据库为基础构建。</span></p>\n" +
                        "<div style=\"text-align: center; margin: 0cm 0cm 0pt 21pt; text-indent: -21pt\">&nbsp;<img alt=\"\" width=\"547\" height=\"367\" src=\"http://www.golden-data.com.cn/upload/fck/image/df1b58ce68654db9a608cd8bc243aba1.png\"></div></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "3" :
                model.addAttribute("title","智慧城市");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p><span><span style=\"font-size: 12pt\"><span><span>&nbsp;&nbsp;&nbsp; <a name=\"OLE_LINK6\"><span>智慧城市大数据平台遵循住建部发布的智慧城市标准，实时采集水、电、气、管网、环境、路网等基础数据，实时监测城市、商圈运行体征，实现整个城市或商圈的用电信息采集及监控、能耗管控、地下管网实时监控、环境实时监测、路网实时监控、智能停车导引、室内导航、商业区客流量监控、</span></a><span><span>IT</span></span><span><span>设备监控、智能家居、智能照明等系统和服务。</span></span></span></span></span></span>\n" +
                        "</p><p style=\"text-align: center\"><img alt=\"\" width=\"557\" height=\"369\" src=\"http://www.golden-data.com.cn/upload/fck/image/c832bacba42242ec94cdbe17ba2c7d6d.png\"></p>\n" +
                        "<p></p>\n" +
                        "<div align=\"left\"><span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 实时数据库作为物联网产业的基础软件，能有效支撑智慧城市大数据平台的高效运转，使平台具有无限扩展上层智慧应用的能力，以及无限扩展下层数据接入的能力，起到了承上启下的关键作用，是必不可少的关键部件。</span></span></div></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "4" :
                model.addAttribute("title","智能楼宇");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"font-size: 12pt\">智慧楼宇平台基于庚顿实时数据库并采用先进的计算机控制技术，管理软件和节能系统程序，使建筑物机电或建筑群内的设备有条不紊、综合协调、科学地运行，从而达到有效地保证建筑物内有舒适的工作环境、实现节能、节省维护管理工作量和运行费用的目的。平台主要采集监测存储楼宇的主要耗电设备空调的运行情况，包括电流电压以及用电量等参数。分析不同时间段和分布在不同地点的空调耗电情况，可以准确诊断空调系统故障，合理选配使用空调，以及节约用电。</span><span id=\"1496305180853E\" style=\"display: none\">&nbsp;</span><img alt=\"\" width=\"555\" height=\"408\" src=\"http://www.golden-data.com.cn/upload/fck/image/31a17c77bfbe4bb3be6cdb2ba772f2f9.png\"><span id=\"1496305180813S\" style=\"display: none\">&nbsp;</span></p>\n" +
                        "<p>&nbsp;</p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "5" :
                model.addAttribute("title","火力发电");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;<span style=\"font-size: 12pt\">&nbsp;&nbsp;&nbsp;&nbsp; 发电厂厂级监控信息系统是通过实时数据库对</span><span style=\"font-size: 12pt\">DCS</span><span style=\"font-size: 12pt\">、脱硫、输煤、除灰、化水等数据的集中采集和存储管理，实现生产实时监控，进而进行机组级和厂级性能计算、耗差分析、能量审计，形成负荷优化分配、操作优化指导等辅助决策知识，以提高发电厂的经济性和安全性。</span></p>\n" +
                        "<p><img alt=\"\" width=\"558\" height=\"378\" src=\"http://www.golden-data.com.cn/upload/fck/image/57560deb712c4887b63e0b392157ccde.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "6" :
                model.addAttribute("title","安全生产");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"font-size: 12pt\">物联网安全生产监控系统，是以生产过程的安全监控为核心，以</span><span style=\"font-size: 12pt\">B/S </span><span style=\"font-size: 12pt\">为架构建立的系统，整个系统以庚顿实时数据库为核心，并借助于关系库，将实时监控与信息查询有机结合起来，对不同功能的子系统进行界面集成，实现对工业企业生产过程中的安全环节进行监控。主要功能模块包括：统一展现门户，操作系统维护，应急指挥，应急管理，监测监控，统一管理等模块，整个系统具有操作简单，信息共享性强，业务扩展方便，可将不同的子系统进行界面集成，部署维护容易，为工业企业的安全生产提供可靠信息支持。</span></p>\n" +
                        "<p><img alt=\"\" width=\"558\" height=\"350\" src=\"http://www.golden-data.com.cn/upload/fck/image/23c82a950ed54f57beaed5741366d5fd.png\"></p>\n" +
                        "<p><img alt=\"\" width=\"558\" height=\"332\" src=\"http://www.golden-data.com.cn/upload/fck/image/260a4d3228a94dd3ba94ba55f0c6c91d.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "7" :
                model.addAttribute("title","智能电网");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"font-size: 12pt\">以信息化、自动化、互动化为特征的智能电网在发电、输电、变电、配电、用电和调度六个环节产生海量数据。这些数据是智能电网的重要基础。</span></p>\n" +
                        "<div style=\"text-align: left; margin: 0cm 0cm 0pt -21.2pt; text-indent: 24pt\" align=\"left\"><span style=\"font-size: 12pt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 基于实时数据库建立的海量实时</span><span style=\"font-size: 12pt\">/</span><span style=\"font-size: 12pt\">历史数据管理平台，可以满足智能电网各业务应用对海量实时</span><span style=\"font-size: 12pt\">/</span><span style=\"font-size: 12pt\">历史数据进行整合、存储、共享、统一访问的需求。</span></div>\n" +
                        "<p><img alt=\"\" width=\"558\" height=\"582\" src=\"http://www.golden-data.com.cn/upload/fck/image/361fe0d5db25446785e448c73204e5ac.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "8" :
                model.addAttribute("title","节能环保");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"font-size: 12pt\">以信息化、自动化、互动化为特征的智能电网在发电、输电、变电、配电、用电和调度六个环节产生海量数据。这些数据是智能电网的重要基础。</span></p>\n" +
                        "<div style=\"text-align: left; margin: 0cm 0cm 0pt -21.2pt; text-indent: 24pt\" align=\"left\"><span style=\"font-size: 12pt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 基于实时数据库建立的海量实时</span><span style=\"font-size: 12pt\">/</span><span style=\"font-size: 12pt\">历史数据管理平台，可以满足智能电网各业务应用对海量实时</span><span style=\"font-size: 12pt\">/</span><span style=\"font-size: 12pt\">历史数据进行整合、存储、共享、统一访问的需求。</span></div>\n" +
                        "<p><img alt=\"\" width=\"558\" height=\"582\" src=\"http://www.golden-data.com.cn/upload/fck/image/361fe0d5db25446785e448c73204e5ac.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "9" :
                model.addAttribute("title","智慧消防");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"font-size: 12pt\">智慧消防云平台是一个集设备运行监测、故障分析和维保记录于一体的管理系统，它可以接收数据采集器传输过来的实时数据，全面了解设备的实时运行状态和故障分布情况，并通过多种设备和移动终端来展现。除了提供开放的信息查询窗口给用户，一些重要信息（如火警信息、关键设备故障、长期未处理故障等）将会主动推送给相关用户，发掘海量数据中有价值的数据，快速、精准的投递给需要的用户，不受时间、空间的限制。</span></p>\n" +
                        "<div style=\"text-indent: 21pt\"><span style=\"font-size: 12pt\">智慧消防云平台利用大数据技术，基于大量历史数据，分析出故障率较高的设备和品牌的季节性故障、行业性故障及影响设备使用寿命的因素等，提供给不同的用户、部门、厂商、行业、机构等使用。</span></div>\n" +
                        "<div><span style=\"font-size: 12pt\">主要特点是快速（数据实时传输）、精准（数据经过平台的分析和筛选，不同的数据发送给不同的用户）、主动（数据可以透过手机</span><span style=\"font-size: 12pt\">APP</span><span style=\"font-size: 12pt\">、短信等方式推送给用户，避免遗漏）。</span></div>\n" +
                        "<p><img width=\"557\" height=\"341\" alt=\"\" src=\"http://www.golden-data.com.cn/upload/fck/image/19a99d0b9be142faaba028d79bed50d9.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            case "10" :
                model.addAttribute("title","集团生产");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p>&nbsp;</p>\n" +
                        "<div>\n" +
                        "<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 集团级生产实时信息系统中的实时数据库支持分布式部署，具有数据断网续传、编码转换、与第三方数据库无缝链接等功能，适于构建集团生产实时信息系统。集团数据中心实时数据库汇总各分厂实时生产信息，为集团实时掌握下属各企业生产动态、实现精细化管理提供支撑。</div>\n" +
                        "</div>\n" +
                        "<p><img width=\"558\" height=\"375\" alt=\"\" src=\"http://www.golden-data.com.cn/upload/fck/image/440cb758bcec492dbbfa9725909d0b9a.png\"></p></div>\n" +
                        "\t\t\t  \t</div>");
                break;
            default:
                model.addAttribute("title","风电集控");
                model.addAttribute("html","<div class=\"contents\">\n" +
                        "\t\t\t\t    <div class=\"wrap\"><p><span style=\"font-size: small\">\n" +
                        "</span></p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 大数据平台基于庚顿实时数据库、Hadoop，以及规范的数据共享技术构建。</p>\n" +
                        "<span style=\"font-size: 12pt\">\n" +
                        "<div style=\"text-align: left; text-indent: 21pt\" align=\"left\"><span style=\"font-size: 12pt\">&nbsp; 平台功能包括采集数据接收及传输、数据实时清洗、数据实时处理、实时数据告警、元数据管理、数据压缩存储、海量数据在线多维查询及导出、数据并行分析计算、数据挖掘、作业调度管理、并提供实时数据库接口、数据共享服务、平台维护管理功能。</span></div>\n" +
                        "</span><p></p>\n" +
                        "<p style=\"text-align: center\"><span style=\"font-size: small\"><img alt=\"\" width=\"588\" height=\"676\" src=\"http://www.golden-data.com.cn/upload/fck/image/71a4342f6f78432089d2d5f21e1cb6b2.png\"></span></p>\n" +
                        "<p><span style=\"font-size: small\">&nbsp;</span></p>\n" +
                        "<p><span style=\"font-size: small\">&nbsp;</span></p></div>\n" +
                        "\t\t\t  \t</div>");
        }
        return "solutionDetails";
    }

    @RequestMapping("about")
    public String about(Model model) {
        model.addAttribute("title","成立宣言");
        model.addAttribute("html","<div class=\"contents\" id=\"content_2\">\n" +
                "\t        \t<div class=\"wrap\"><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 北京庚顿数据科技有限公司专业从事自主知识产权的\"实时数据库管理系统\"研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p>\n" +
                "<p>我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p> </div>\n" +
                "\t      \t</div>");

        return "about";
    }
    @RequestMapping("aboutContent")
    public String aboutContent(Model model, String id) {
        switch (id){
            case "1":
                model.addAttribute("title","成立宣言");
                model.addAttribute("html","<div class=\"contents\" id=\"content_2\">\n" +
                        "\t        \t<div class=\"wrap\"><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 北京庚顿数据科技有限公司专业从事自主知识产权的\"实时数据库管理系统\"研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p>\n" +
                        "<p>我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p> </div>\n" +
                        "\t      \t</div>");
                break;
            case "2":
                model.addAttribute("title","公司简介");
                model.addAttribute("html","<div class=\"contents\" id=\"content_1\">\n" +
                        "\t        \t<div class=\"wrap\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 北京庚顿数据科技有限公司成立于2007年8月，位于中关村软件园。公司专业从事自主知识产权的“实时数据库管理系统”研发及产业化，庚顿公司成立11年来，打造了一支专注民族基础软件产业、敢为天下先的创新团队。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿人坚持持续自主创新，推出适应市场需求的一系列实时数据库产品，该系列产品是工业领域信息化的核心基础软件，在两化融合中发挥着重要作用，更是大数据、云计算、物联网等新兴产业不可或缺的重要支撑软件。可应用于智能电网、生产管理、节能环保、先进控制、现代物流等行业或领域。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 目前庚顿实时数据库已达到国际领先水平，广泛应用于国家电网、南方电网、神华集团、华能集团、华润集团等世界五百强企业中，以及金风科技、广东明阳、大唐华创风能、湖北能源集团、华能新能源等风电领军企业中。</p> </div>\n" +
                        "\t      \t</div>");
                break;
            case "3":
                model.addAttribute("title","资质荣誉");
                model.addAttribute("html","<div class=\"contents\" id=\"content_2\">\n" +
                        "\t        \t<div class=\"wrap\"><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 北京庚顿数据科技有限公司专业从事自主知识产权的\"实时数据库管理系统\"研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p>\n" +
                        "<p>我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p> </div>\n" +
                        "\t      \t</div>");
                break;
            case "4":
                model.addAttribute("title","企业文化");
                model.addAttribute("html","<div class=\"contents\" id=\"content_8\">\n" +
                        "\t        \t<div class=\"wrap\"><p>庚顿愿景：技术达到世界领先，产品超越国际一流，产业确立民族品牌。<br>\n" +
                        "<br>\n" +
                        "庚顿使命：做中国的数据库，助力中华民族的伟大复兴。<br>\n" +
                        "<br>\n" +
                        "庚顿理念：专注、创新、发展。<br>\n" +
                        "<br>\n" +
                        "专注于数据处理领域，坚持持续创新，实现企业的可持续发展；<br>\n" +
                        "<br>\n" +
                        "只有专注我们才有高效率，只有持续创新我们才能立而不倒、不战而胜。<br>\n" +
                        "<br>\n" +
                        "庚顿原则：一个中心、四个坚持<br>\n" +
                        "<br>\n" +
                        "以解决问题为中心，坚持艰苦奋斗，坚持持续创新，坚持利益分享，坚持培训队伍。<br>\n" +
                        "<br>\n" +
                        "庚顿文化：坦诚、分享、坚持。</p> </div>\n" +
                        "\t      \t</div>");
                break;
            case "5":
                model.addAttribute("title","庚顿动态");
                model.addAttribute("html","庚顿动态");
                break;
            case "6":
                model.addAttribute("title","庚顿分享");
                model.addAttribute("html","");
                break;
            case "7":
                model.addAttribute("title","联系我们");
                model.addAttribute("html","<div class=\"contents\" id=\"content_5\">\n" +
                        "\t        \t<div class=\"wrap\"><p>&nbsp;</p>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">地址:北京市海淀区</span><span style=\"font-size: 10.5pt\">中关村</span><span style=\"font-size: 10.5pt\">软件园</span><span style=\"font-size: 10.5pt\">2号楼B座一层</span><span style=\"font-size: 10.5pt\"><br>\n" +
                        "</span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">行车线路:城铁昌平线、13号线西二旗站下，步行</span><span style=\"font-size: 10.5pt\">8</span><span style=\"font-size: 10.5pt\">分钟即到；</span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">公交447路，509路，963路，570路，专34路环线，</span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">快速直达专线80路，333路，365路，642路，982路</span><span style=\"font-size: 10.5pt\">软件园</span><span style=\"font-size: 10.5pt\">广场下。</span><span style=\"font-size: 10.5pt\"><br>\n" +
                        "</span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">电话:</span><span style=\"font-size: 10.5pt\">400-628-5226 </span><span style=\"font-size: 10.5pt\">010-</span><span style=\"font-size: 10.5pt\">82790169 </span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">传真:010-828</span><span style=\"font-size: 10.5pt\">25226</span><span style=\"font-size: 10.5pt\">·</span></div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\">&nbsp;</div>\n" +
                        "<div style=\"text-align: left; margin: 0pt\"><span style=\"font-size: 10.5pt\">电子邮件:</span><span style=\"font-size: 10.5pt\">service</span><span style=\"font-size: 10.5pt\">@</span><span style=\"font-size: 10.5pt\">golden-data.com.cn</span></div> </div>\n" +
                        "\t      \t</div>");
                break;
            default:
                model.addAttribute("title","成立宣言");
                model.addAttribute("html","<div class=\"contents\" id=\"content_2\">\n" +
                        "\t        \t<div class=\"wrap\"><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 北京庚顿数据科技有限公司专业从事自主知识产权的\"实时数据库管理系统\"研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p>\n" +
                        "<p>我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p> </div>\n" +
                        "\t      \t</div>");
        }

        return "about";
    }
    @RequestMapping("purchase")
    public String purchase(Model model){
        return "purchase";
    }
    @RequestMapping("download")
    public String download(Model model){
        return "download";
    }
}
