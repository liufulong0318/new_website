/**
 * Created by Administrator on 2018/12/10.
 */
$(document).ready(function () {
    $.ajax({
        async : false,
        cache : false,
        type:"post",
        timeout : 3000, //超时时间设置，单位毫秒
        datatype:"jsonp",
        url:"http://52.83.234.27:8081/ZPSYS/golden/guanWang.action",
        success:function(msg){
            var obj = msg.split(",");
            $(".important_data_1").html(obj[1]);
            $(".important_data_2").html(obj[3]);
            $(".important_data_3").html(parseInt(obj[2]/10000));
            $(".important_data_4").html(obj[4]);
        }
    })
    $(".link").mouseout(function () {
        $(".link").hide();
    });
    var validator = $("#signupForm").validate();
    $('#myModal').on('hide.bs.modal', function () {
        $("#myModal input").val("");
    });
    $('#myModal_MSG').on('hide.bs.modal', function () {
        window.location.reload();
    });
    $('#myModal_login').on('hide.bs.modal', function () {
        $("#myModal_login input").val("");
        $("body").css("papadding-right","0px");
    });
    $("#submit").on('click', function () {
        var arr = $("#signupForm").find("input");
        var obj = new Object();
        obj.loginUserName = $(arr[0]).val();
        obj.password = hex_md5($(arr[1]).val());
        obj.code = $(arr[3]).val();
        $.post("/register", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $('#myModal').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })
    $("#login").on('click', function () {
        var arr = $("#loginForm").find("input");
        var obj = new Object();
        obj.loginusername = $(arr[0]).val();
        obj.password = hex_md5($(arr[1]).val());
        obj.code = $(arr[2]).val();
        $.post("/login", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $('#myModal_login').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })
    $("#logout").on('click', function () {
        $.post("/logout", function (data, status) {
            if(status == "success"){
                window.location.reload();
            }
        });
    })
    $("#OK").on("click", function () {
        $('#myModal_MSG').modal("hide");
    });
//修改密码
    $("#up_pwd").on("click",function () {
        generatingVerificationCode_UpdatePWD();
        $("#up_btn").click();
    })
    $("#updatePwd").on("click",function () {
        var arr = $("#updatePwdForm").find("input");
        var obj = new Object();
        obj.src_password = hex_md5($(arr[0]).val());
        obj.new_password = hex_md5($(arr[1]).val());
        obj.new_password2 = hex_md5($(arr[2]).val());
        obj.code = $(arr[3]).val();
        $.post("/updatePwd", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $('#myModal').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })
    $("#myModal_login").bind("keyup",function (event) {
        if(event.keyCode == 13){
             $('#login').click();
        }
    })

    $("#myModal_MSG").bind("keyup",function (event) {
        if(event.keyCode == 13){
            $("#ok_btn").click();
        }
    })
    $("#close_myinfo").on("click",function () {
        window.location.href="/home";
    })
    $("#save").on("click",function () {
        var form_control = $(".panel-body").find(".form-control");
        var obj = new Object();
        obj.name = $(form_control[1]).val();
        obj.sex=$('input:radio[name="sex"]:checked').val();
        obj.tin = $(form_control[5]).val();
        obj.type=$("#type").val();
        obj.phone = $(form_control[6]).val();
        obj.bank = $(form_control[7]).val();
        obj.bankacount = $(form_control[8]).val();
        $.post("/saveMyInfo", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $('#myModal').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })
    $("#buy").on("click",function () {
        $.ajax({
            async : false,
            cache : false,
            type:"post",
            timeout : 3000, //超时时间设置，单位毫秒
            url:"/checkIsLogin",
            success:function(msg){
                // var obj2 = JSON.parse(msg);
                if(msg.code == 0){
                    $('#myModal').modal("hide");
                    $("#myModal_MSG .modal-body").html(msg.msg);
                    $("#ok_btn").click();
                }else{
                    window.location.href="/buyPage";
                }
            }
        })
    })
    //立即购买
    $("#submit_order").on("click",function () {
        var form_control = $("#orderForm").find(".form-control");
        var obj = new Object();
        obj.product_name = $(form_control[0]).val();
        obj.product_tag=$(form_control[1]).val();
        obj.product_total = $(form_control[2]).val();
        obj.product_purchaser=$(form_control[3]).val();
        obj.product_phone = $(form_control[4]).val();
        obj.verificationCode_order = $(form_control[5]).val();
        obj.userId = $(form_control[6]).val();
        obj.code = $("#verificationCode_order").val();
        $.post("/addOrderInfo", obj, function (data, status) {
            var obj2 = JSON.parse(data);
            $('#myModal').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })

});

function hoverDiy(className) {
    $("." + className).next("a").children("div").show();
}

function generatingVerificationCode() {
    $.get("/GeneratingVerificationCode", function (data, status) {
        var arr = data.split("|");
        $("#generatingCode").attr("src", arr[0]);
        $("#token").attr("value", arr[1]);
    });
};

function generatingVerificationCode_login() {
    $.get("/GeneratingVerificationCode", function (data, status) {
        var arr = data.split("|");
        $("#generatingCode_login").attr("src", arr[0]);
    });
};

function gotoBuyPage(id) {
    window.location.href="../buyPage?id="+id;
}
function generatingVerificationCode_UpdatePWD() {
    $.get("/GeneratingVerificationCode", function (data, status) {
        var arr = data.split("|");
        $("#generatingCode_UpdatePwd").attr("src", arr[0]);
    });
};

function GetUrlRelativePath() {
    var url = document.location.toString();
    var arrUrl = url.split("//");

    var start = arrUrl[1].indexOf("/");
    var relUrl = arrUrl[1].substring(start + 1);//stop省略，截取从start开始到结尾的所有字符

    if (relUrl.indexOf("?") != -1) {
        relUrl = relUrl.split("?")[0];
    }
    return relUrl;
}

//立即购买
function doBuy() {
    //验证是否登录
    //已登录：弹出订单信息确认（产品名称、产品规格、购买价格、购买人姓名、购买人联系方式、购买人收货方式、收获地址、是否开票、支付方式）
    //未登录：弹出登录窗，登录后弹出订单信息
    $.post("/checkIsLogin", function (data, status) {
        if(data == ""){
           $("#product_name").val($(".media-heading").text()) ;
            $("#product_tag").val($("#price_op option:selected").text());
            $("#product_total").val($("#disabledInput").val());
            generatingVerificationCode_order();
            getUserInfoByLoginName();
            $("#order_trigger").click();
        }else if(data.code == "0"){
            generatingVerificationCode_login();//生成验证码
            $("#login_trigger").click();//弹出登录窗口
        }
    });
}

function getUserInfoByLoginName() {
    $.post("/getUserInfoByLoginName", function (data, status) {
        var obj = eval('(' + data + ')');
        $("#product_purchaser").val(obj.name);
        $("#product_phone").val(obj.phone);
        $("#userId").val(obj.id);
    })
}

function generatingVerificationCode_order(){
    $.get("/GeneratingVerificationCode", function (data, status) {
        var arr = data.split("|");
        $("#generatingCode_order").attr("src", arr[0]);
    });
}