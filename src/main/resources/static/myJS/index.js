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
        var arr = $("#signupForm").find("input");
        var obj = new Object();
        obj.loginUserName = $(arr[0]).val();
        obj.password = hex_md5($(arr[1]).val());
        obj.code = $(arr[3]).val();
        $.post("/register",obj,function(data,status){
            var obj2 = JSON.parse(data);
            $('#myModal').modal("hide");
            $("#myModal_MSG .modal-body").html(obj2.msg);
            $("#ok_btn").click();
        });
    })

    $("#OK").on("click",function () {
        $('#myModal_MSG').modal("hide");
    });
});
function hoverDiy(className) {
    $("."+className).next("div").show();
}
function generatingVerificationCode() {
    $.get("/GeneratingVerificationCode",function(data,status){
        var arr = data.split("|");
        $("#generatingCode").attr("src",arr[0]);
        $("#token").attr("value",arr[1]);
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