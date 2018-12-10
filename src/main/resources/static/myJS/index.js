/**
 * Created by Administrator on 2018/12/10.
 */
$(document).ready(function(){


    $(".link").mouseout(function(){
        $(".link").hide();
    });
});
function hoverDiy(className) {
    $("."+className).next("div").show();
}