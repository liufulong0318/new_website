/**
 * Created by Administrator on 2018/12/10.
 */
$(document).ready(function(){
    $(".link").mouseout(function(){
        $(".link").hide();
    });
    var validator = $("#signupForm").validate();
    $('#myModal').on('hide.bs.modal', function () {
        $("#myModal input").val("");
    });
    $("#submit").on('click',function () {
        $("#url").val(GetUrlRelativePath());
        $(".submit").click();
    })
    // 在键盘按下并释放及提交后验证提交表单
    // $("#signupForm").validate({
    //     rules: {
    //         username: {
    //             required: true,
    //             minlength: 6,
    //             maxlength: 30
    //         },
    //         password: {
    //             required: true,
    //             minlength: 8,
    //             maxlength: 8
    //         },
    //         confirm_password: {
    //             required: true,
    //             minlength: 8,
    //             maxlength: 8,
    //             equalTo: "#password"
    //         },
    //         verificationCode :{
    //             required: true
    //         }
    //     },
    //     messages: {
    //         username: {
    //             required: "请输入用户名",
    //             minlength: "用户名长度不能小于6位",
    //             maxlength: "用户名长度不能大于30位"
    //         },
    //         password: {
    //             required: "请输入密码",
    //             minlength: "密码长度不能小于8位",
    //             maxlength: "密码长度不能大于8位"
    //         },
    //         confirm_password: {
    //             required: "请输入密码",
    //             minlength: "密码长度不能小于8位",
    //             maxlength: "密码长度不能大于8位",
    //             equalTo: "两次密码输入不一致"
    //         },
    //         verificationCode: {
    //             required: "请输入验证码",
    //             minlength: "密码长度不能小于4位",
    //             maxlength: "密码长度不能大于4位"
    //         }
    //     }
    // });
});
function hoverDiy(className) {
    $("."+className).next("div").show();
}
function register() {
    $.get("/GeneratingVerificationCode",function(data,status){
        $("#generatingCode").attr("src",data);
        // alert("数据: " + data + "\n状态: " + status);
    });
};
function GetUrlRelativePath()
{
    var url = document.location.toString();
    var arrUrl = url.split("//");

    var start = arrUrl[1].indexOf("/");
    var relUrl = arrUrl[1].substring(start+1);//stop省略，截取从start开始到结尾的所有字符

    if(relUrl.indexOf("?") != -1){
        relUrl = relUrl.split("?")[0];
    }
    return relUrl;
}