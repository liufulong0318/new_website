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
