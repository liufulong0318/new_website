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
    @RequestMapping("purchase")
    public String purchase(Model model){
        return "purchase";
    }
    @RequestMapping("download")
    public String download(Model model){
        return "download";
    }
}
